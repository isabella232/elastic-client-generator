
package org.elasticsearch.search.explain;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.search.explain.*;
import org.elasticsearch.internal.*;

public class Explanation  implements XContentable<Explanation> {
  
  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public Explanation setDescription(String val) { this._description = val; return this; }

  static final ParseField DETAILS = new ParseField("details");
  private List<ExplanationDetail> _details;
  public List<ExplanationDetail> getDetails() { return this._details; }
  public Explanation setDetails(List<ExplanationDetail> val) { this._details = val; return this; }

  static final ParseField VALUE = new ParseField("value");
  private float _value;
  private boolean _value$isSet;
  public float getValue() { return this._value; }
  public Explanation setValue(float val) {
    this._value = val;
    _value$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_description != null) {
      builder.field(DESCRIPTION.getPreferredName(), _description);
    }
    if (_details != null) {
      builder.array(DETAILS.getPreferredName(), _details);
    }
    if (_value$isSet) {
      builder.field(VALUE.getPreferredName(), _value);
    }
  }

  @Override
  public Explanation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Explanation.PARSER.apply(parser, null);
  }

  public static final ObjectParser<Explanation, Void> PARSER =
    new ObjectParser<>(Explanation.class.getName(), false, Explanation::new);

  static {
    PARSER.declareString(Explanation::setDescription, DESCRIPTION);
    PARSER.declareObjectArray(Explanation::setDetails, (p, t) -> ExplanationDetail.PARSER.apply(p, t), DETAILS);
    PARSER.declareFloat(Explanation::setValue, VALUE);
  }

}
