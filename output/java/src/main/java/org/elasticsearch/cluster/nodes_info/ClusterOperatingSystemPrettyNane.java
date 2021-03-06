
package org.elasticsearch.cluster.nodes_info;

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

public class ClusterOperatingSystemPrettyNane  implements XContentable<ClusterOperatingSystemPrettyNane> {
  
  static final ParseField COUNT = new ParseField("count");
  private int _count;
  private boolean _count$isSet;
  public int getCount() { return this._count; }
  public ClusterOperatingSystemPrettyNane setCount(int val) {
    this._count = val;
    _count$isSet = true;
    return this;
  }

  static final ParseField PRETTY_NAME = new ParseField("pretty_name");
  private String _prettyName;
  public String getPrettyName() { return this._prettyName; }
  public ClusterOperatingSystemPrettyNane setPrettyName(String val) { this._prettyName = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_count$isSet) {
      builder.field(COUNT.getPreferredName(), _count);
    }
    if (_prettyName != null) {
      builder.field(PRETTY_NAME.getPreferredName(), _prettyName);
    }
  }

  @Override
  public ClusterOperatingSystemPrettyNane fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterOperatingSystemPrettyNane.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ClusterOperatingSystemPrettyNane, Void> PARSER =
    new ObjectParser<>(ClusterOperatingSystemPrettyNane.class.getName(), false, ClusterOperatingSystemPrettyNane::new);

  static {
    PARSER.declareInt(ClusterOperatingSystemPrettyNane::setCount, COUNT);
    PARSER.declareString(ClusterOperatingSystemPrettyNane::setPrettyName, PRETTY_NAME);
  }

}
