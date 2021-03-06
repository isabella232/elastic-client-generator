
package org.elasticsearch.analysis.plugins.icu;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.analysis.plugins.icu.transform.*;
import org.elasticsearch.analysis.token_filters.*;

public class IcuTransformTokenFilter extends TokenFilterBase implements XContentable<IcuTransformTokenFilter> {
  
  static final ParseField DIR = new ParseField("dir");
  private IcuTransformDirection _dir;
  public IcuTransformDirection getDir() { return this._dir; }
  public IcuTransformTokenFilter setDir(IcuTransformDirection val) { this._dir = val; return this; }

  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public IcuTransformTokenFilter setId(String val) { this._id = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_dir != null) {
      builder.field(DIR.getPreferredName());
      _dir.toXContent(builder, params);
    }
    if (_id != null) {
      builder.field(ID.getPreferredName(), _id);
    }
  }

  @Override
  public IcuTransformTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IcuTransformTokenFilter.PARSER.apply(parser, null);
  }

  public static final ObjectParser<IcuTransformTokenFilter, Void> PARSER =
    new ObjectParser<>(IcuTransformTokenFilter.class.getName(), false, IcuTransformTokenFilter::new);

  static {
    PARSER.declareField(IcuTransformTokenFilter::setDir, (p, t) -> IcuTransformDirection.PARSER.apply(p), DIR, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareString(IcuTransformTokenFilter::setId, ID);
  }

}
