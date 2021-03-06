
package org.elasticsearch.x_pack.machine_learning.get_jobs;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_abstractions.request.*;

public class GetJobsRequest extends RequestBase<GetJobsRequest> implements XContentable<GetJobsRequest> {
  
  static final ParseField ALLOW_NO_JOBS = new ParseField("allow_no_jobs");
  private Boolean _allowNoJobs;
  public Boolean getAllowNoJobs() { return this._allowNoJobs; }
  public GetJobsRequest setAllowNoJobs(Boolean val) { this._allowNoJobs = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_allowNoJobs != null) {
      builder.field(ALLOW_NO_JOBS.getPreferredName(), _allowNoJobs);
    }
  }

  @Override
  public GetJobsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetJobsRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GetJobsRequest, Void> PARSER =
    new ObjectParser<>(GetJobsRequest.class.getName(), false, GetJobsRequest::new);

  static {
    PARSER.declareBoolean(GetJobsRequest::setAllowNoJobs, ALLOW_NO_JOBS);
  }

}
