
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.x_pack.roll_up.get_rollup_job.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRollupJobResponse extends ResponseBase<GetRollupJobResponse> implements XContentable<GetRollupJobResponse> {
  
  static final ParseField JOBS = new ParseField("jobs");
  private List<RollupJobInformation> _jobs;
  public List<RollupJobInformation> getJobs() { return this._jobs; }
  public GetRollupJobResponse setJobs(List<RollupJobInformation> val) { this._jobs = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_jobs != null) {
      builder.array(JOBS.getPreferredName(), _jobs);
    }
  }

  @Override
  public GetRollupJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRollupJobResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GetRollupJobResponse, Void> PARSER =
    new ObjectParser<>(GetRollupJobResponse.class.getName(), false, GetRollupJobResponse::new);

  static {
    PARSER.declareObjectArray(GetRollupJobResponse::setJobs, (p, t) -> RollupJobInformation.PARSER.apply(p, t), JOBS);
  }

}
