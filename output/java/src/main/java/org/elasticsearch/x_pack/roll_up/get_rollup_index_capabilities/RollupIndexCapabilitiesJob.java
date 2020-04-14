
package org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_abstractions.infer.field.*;

public class RollupIndexCapabilitiesJob  implements XContentable<RollupIndexCapabilitiesJob> {
  
  static final ParseField FIELDS = new ParseField("fields");
  private NamedContainer<Field, NamedContainer<String, String>> _fields;
  public NamedContainer<Field, NamedContainer<String, String>> getFields() { return this._fields; }
  public RollupIndexCapabilitiesJob setFields(NamedContainer<Field, NamedContainer<String, String>> val) { this._fields = val; return this; }


  static final ParseField INDEX_PATTERN = new ParseField("index_pattern");
  private String _indexPattern;
  public String getIndexPattern() { return this._indexPattern; }
  public RollupIndexCapabilitiesJob setIndexPattern(String val) { this._indexPattern = val; return this; }


  static final ParseField JOB_ID = new ParseField("job_id");
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public RollupIndexCapabilitiesJob setJobId(String val) { this._jobId = val; return this; }


  static final ParseField ROLLUP_INDEX = new ParseField("rollup_index");
  private String _rollupIndex;
  public String getRollupIndex() { return this._rollupIndex; }
  public RollupIndexCapabilitiesJob setRollupIndex(String val) { this._rollupIndex = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    if (_fields != null) {
      builder.field(FIELDS.getPreferredName());
      _fields.toXContent(builder, params);
    }
    builder.field(INDEX_PATTERN.getPreferredName(), _indexPattern);
    builder.field(JOB_ID.getPreferredName(), _jobId);
    builder.field(ROLLUP_INDEX.getPreferredName(), _rollupIndex);
    builder.endObject();
    return builder;
  }

  @Override
  public RollupIndexCapabilitiesJob fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RollupIndexCapabilitiesJob.PARSER.apply(parser, null);
  }

  public static final ObjectParser<RollupIndexCapabilitiesJob, Void> PARSER =
    new ObjectParser<>(RollupIndexCapabilitiesJob.class.getName(), false, RollupIndexCapabilitiesJob::new);

  static {
    PARSER.declareObject(RollupIndexCapabilitiesJob::setFields, (p, t) -> new NamedContainer<>(n -> () -> new Field(n),null /* TODO NamedContainer<String, String> */), FIELDS);
    PARSER.declareString(RollupIndexCapabilitiesJob::setIndexPattern, INDEX_PATTERN);
    PARSER.declareString(RollupIndexCapabilitiesJob::setJobId, JOB_ID);
    PARSER.declareString(RollupIndexCapabilitiesJob::setRollupIndex, ROLLUP_INDEX);
  }

}