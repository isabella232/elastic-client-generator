
package org.elasticsearch.x_pack.ilm.get_lifecycle;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.ilm.*;

public class LifecyclePolicy  implements XContentable<LifecyclePolicy> {
  
  static final ParseField MODIFIED_DATE = new ParseField("modified_date");
  private Date _modifiedDate;
  public Date getModifiedDate() { return this._modifiedDate; }
  public LifecyclePolicy setModifiedDate(Date val) { this._modifiedDate = val; return this; }

  static final ParseField POLICY = new ParseField("policy");
  private Policy _policy;
  public Policy getPolicy() { return this._policy; }
  public LifecyclePolicy setPolicy(Policy val) { this._policy = val; return this; }

  static final ParseField VERSION = new ParseField("version");
  private int _version;
  private boolean _version$isSet;
  public int getVersion() { return this._version; }
  public LifecyclePolicy setVersion(int val) {
    this._version = val;
    _version$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_modifiedDate != null) {
      builder.field(MODIFIED_DATE.getPreferredName(),
        DateTimeFormatter.ISO_DATE.format(_modifiedDate.toInstant()));
    }
    if (_policy != null) {
      builder.field(POLICY.getPreferredName());
      _policy.toXContent(builder, params);
    }
    if (_version$isSet) {
      builder.field(VERSION.getPreferredName(), _version);
    }
  }

  @Override
  public LifecyclePolicy fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LifecyclePolicy.PARSER.apply(parser, null);
  }

  public static final ObjectParser<LifecyclePolicy, Void> PARSER =
    new ObjectParser<>(LifecyclePolicy.class.getName(), false, LifecyclePolicy::new);

  static {
    PARSER.declareObject(LifecyclePolicy::setModifiedDate, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), MODIFIED_DATE);
    PARSER.declareObject(LifecyclePolicy::setPolicy, (p, t) -> Policy.PARSER.apply(p, t), POLICY);
    PARSER.declareInt(LifecyclePolicy::setVersion, VERSION);
  }

}
