
package org.elasticsearch.modules.snapshot_and_restore.snapshot.get_snapshot;

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

public class GetSnapshotRequest extends RequestBase<GetSnapshotRequest> implements XContentable<GetSnapshotRequest> {
  
  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetSnapshotRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }

  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private String _masterTimeout;
  public String getMasterTimeout() { return this._masterTimeout; }
  public GetSnapshotRequest setMasterTimeout(String val) { this._masterTimeout = val; return this; }

  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public GetSnapshotRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_ignoreUnavailable != null) {
      builder.field(IGNORE_UNAVAILABLE.getPreferredName(), _ignoreUnavailable);
    }
    if (_masterTimeout != null) {
      builder.field(MASTER_TIMEOUT.getPreferredName(), _masterTimeout);
    }
    if (_verbose != null) {
      builder.field(VERBOSE.getPreferredName(), _verbose);
    }
  }

  @Override
  public GetSnapshotRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetSnapshotRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GetSnapshotRequest, Void> PARSER =
    new ObjectParser<>(GetSnapshotRequest.class.getName(), false, GetSnapshotRequest::new);

  static {
    PARSER.declareBoolean(GetSnapshotRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareString(GetSnapshotRequest::setMasterTimeout, MASTER_TIMEOUT);
    PARSER.declareBoolean(GetSnapshotRequest::setVerbose, VERBOSE);
  }

}
