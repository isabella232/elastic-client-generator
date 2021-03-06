
package org.elasticsearch.query_dsl.nest_specific;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class RawQuery  implements XContentable<RawQuery> {
  
  static final ParseField RAW = new ParseField("raw");
  private String _raw;
  public String getRaw() { return this._raw; }
  public RawQuery setRaw(String val) { this._raw = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_raw != null) {
      builder.field(RAW.getPreferredName(), _raw);
    }
  }

  @Override
  public RawQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RawQuery.PARSER.apply(parser, null);
  }

  public static final ObjectParser<RawQuery, Void> PARSER =
    new ObjectParser<>(RawQuery.class.getName(), false, RawQuery::new);

  static {
    PARSER.declareString(RawQuery::setRaw, RAW);
  }

}
