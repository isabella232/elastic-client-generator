
package org.elasticsearch.mapping.types.complex.nested;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.mapping.types.complex.object.*;
import org.elasticsearch.mapping.types.*;

public class NestedProperty extends ObjectProperty implements XContentable<NestedProperty> {
  
  static final ParseField INCLUDE_IN_PARENT = new ParseField("include_in_parent");
  private Boolean _includeInParent;
  public Boolean getIncludeInParent() { return this._includeInParent; }
  public NestedProperty setIncludeInParent(Boolean val) { this._includeInParent = val; return this; }

  static final ParseField INCLUDE_IN_ROOT = new ParseField("include_in_root");
  private Boolean _includeInRoot;
  public Boolean getIncludeInRoot() { return this._includeInRoot; }
  public NestedProperty setIncludeInRoot(Boolean val) { this._includeInRoot = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_includeInParent != null) {
      builder.field(INCLUDE_IN_PARENT.getPreferredName(), _includeInParent);
    }
    if (_includeInRoot != null) {
      builder.field(INCLUDE_IN_ROOT.getPreferredName(), _includeInRoot);
    }
  }

  @Override
  public NestedProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NestedProperty.PARSER.apply(parser, null);
  }

  public static final ObjectParser<NestedProperty, Void> PARSER =
    new ObjectParser<>(NestedProperty.class.getName(), false, NestedProperty::new);

  static {
    PARSER.declareBoolean(NestedProperty::setIncludeInParent, INCLUDE_IN_PARENT);
    PARSER.declareBoolean(NestedProperty::setIncludeInRoot, INCLUDE_IN_ROOT);
  }

}
