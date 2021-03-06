
package org.elasticsearch.x_pack.watcher.input;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.x_pack.watcher.input.*;
import org.elasticsearch.common_options.time_unit.*;

public class SearchInput  implements XContentable<SearchInput> {
  
  static final ParseField EXTRACT = new ParseField("extract");
  private List<String> _extract;
  public List<String> getExtract() { return this._extract; }
  public SearchInput setExtract(List<String> val) { this._extract = val; return this; }

  static final ParseField REQUEST = new ParseField("request");
  private SearchInputRequest _request;
  public SearchInputRequest getRequest() { return this._request; }
  public SearchInput setRequest(SearchInputRequest val) { this._request = val; return this; }

  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public SearchInput setTimeout(String val) { this._timeout = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_extract != null) {
      builder.array(EXTRACT.getPreferredName(), _extract);
    }
    if (_request != null) {
      builder.field(REQUEST.getPreferredName());
      _request.toXContent(builder, params);
    }
    if (_timeout != null) {
      builder.field(TIMEOUT.getPreferredName(), _timeout);
    }
  }

  @Override
  public SearchInput fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SearchInput.PARSER.apply(parser, null);
  }

  public static final ObjectParser<SearchInput, Void> PARSER =
    new ObjectParser<>(SearchInput.class.getName(), false, SearchInput::new);

  static {
    PARSER.declareStringArray(SearchInput::setExtract, EXTRACT);
    PARSER.declareObject(SearchInput::setRequest, (p, t) -> SearchInputRequest.PARSER.apply(p, t), REQUEST);
    PARSER.declareString(SearchInput::setTimeout, TIMEOUT);
  }

}
