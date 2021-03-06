
package org.elasticsearch.x_pack.info.x_pack_usage;

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
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class IlmUsage  implements XContentable<IlmUsage> {
  
  static final ParseField POLICY_COUNT = new ParseField("policy_count");
  private int _policyCount;
  private boolean _policyCount$isSet;
  public int getPolicyCount() { return this._policyCount; }
  public IlmUsage setPolicyCount(int val) {
    this._policyCount = val;
    _policyCount$isSet = true;
    return this;
  }

  static final ParseField POLICY_STATS = new ParseField("policy_stats");
  private List<IlmPolicyStatistics> _policyStats;
  public List<IlmPolicyStatistics> getPolicyStats() { return this._policyStats; }
  public IlmUsage setPolicyStats(List<IlmPolicyStatistics> val) { this._policyStats = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_policyCount$isSet) {
      builder.field(POLICY_COUNT.getPreferredName(), _policyCount);
    }
    if (_policyStats != null) {
      builder.array(POLICY_STATS.getPreferredName(), _policyStats);
    }
  }

  @Override
  public IlmUsage fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IlmUsage.PARSER.apply(parser, null);
  }

  public static final ObjectParser<IlmUsage, Void> PARSER =
    new ObjectParser<>(IlmUsage.class.getName(), false, IlmUsage::new);

  static {
    PARSER.declareInt(IlmUsage::setPolicyCount, POLICY_COUNT);
    PARSER.declareObjectArray(IlmUsage::setPolicyStats, (p, t) -> IlmPolicyStatistics.PARSER.apply(p, t), POLICY_STATS);
  }

}
