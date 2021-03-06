
package org.elasticsearch.cluster.cluster_stats;

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
import org.elasticsearch.cluster.cluster_stats.*;

public class ClusterIngestStats  implements XContentable<ClusterIngestStats> {
  
  static final ParseField NUMBER_OF_PIPELINES = new ParseField("number_of_pipelines");
  private int _numberOfPipelines;
  private boolean _numberOfPipelines$isSet;
  public int getNumberOfPipelines() { return this._numberOfPipelines; }
  public ClusterIngestStats setNumberOfPipelines(int val) {
    this._numberOfPipelines = val;
    _numberOfPipelines$isSet = true;
    return this;
  }

  static final ParseField PROCESSOR_STATS = new ParseField("processor_stats");
  private NamedContainer<String, ClusterProcessorStats> _processorStats;
  public NamedContainer<String, ClusterProcessorStats> getProcessorStats() { return this._processorStats; }
  public ClusterIngestStats setProcessorStats(NamedContainer<String, ClusterProcessorStats> val) { this._processorStats = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_numberOfPipelines$isSet) {
      builder.field(NUMBER_OF_PIPELINES.getPreferredName(), _numberOfPipelines);
    }
    if (_processorStats != null) {
      builder.field(PROCESSOR_STATS.getPreferredName());
      _processorStats.toXContent(builder, params);
    }
  }

  @Override
  public ClusterIngestStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterIngestStats.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ClusterIngestStats, Void> PARSER =
    new ObjectParser<>(ClusterIngestStats.class.getName(), false, ClusterIngestStats::new);

  static {
    PARSER.declareInt(ClusterIngestStats::setNumberOfPipelines, NUMBER_OF_PIPELINES);
    PARSER.declareObject(ClusterIngestStats::setProcessorStats, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> ClusterProcessorStats.PARSER.apply(pp, null)), PROCESSOR_STATS);
  }

}
