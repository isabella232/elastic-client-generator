
package org.elasticsearch.x_pack.machine_learning.close_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.request.*;

public class CloseJobRequest extends RequestBase<CloseJobRequest> implements XContentable<CloseJobRequest> {
  
  static final ParseField ALLOW_NO_JOBS = new ParseField("allow_no_jobs");
  private Boolean _allowNoJobs;
  public Boolean getAllowNoJobs() { return this._allowNoJobs; }
  public CloseJobRequest setAllowNoJobs(Boolean val) { this._allowNoJobs = val; return this; }

  static final ParseField FORCE = new ParseField("force");
  private Boolean _force;
  public Boolean getForce() { return this._force; }
  public CloseJobRequest setForce(Boolean val) { this._force = val; return this; }

  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public CloseJobRequest setTimeout(String val) { this._timeout = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_allowNoJobs != null) {
      builder.field(ALLOW_NO_JOBS.getPreferredName(), _allowNoJobs);
    }
    if (_force != null) {
      builder.field(FORCE.getPreferredName(), _force);
    }
    if (_timeout != null) {
      builder.field(TIMEOUT.getPreferredName(), _timeout);
    }
  }

  @Override
  public CloseJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CloseJobRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<CloseJobRequest, Void> PARSER =
    new ObjectParser<>(CloseJobRequest.class.getName(), false, CloseJobRequest::new);

  static {
    PARSER.declareBoolean(CloseJobRequest::setAllowNoJobs, ALLOW_NO_JOBS);
    PARSER.declareBoolean(CloseJobRequest::setForce, FORCE);
    PARSER.declareString(CloseJobRequest::setTimeout, TIMEOUT);
  }

}
