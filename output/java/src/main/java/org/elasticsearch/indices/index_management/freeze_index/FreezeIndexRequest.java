
package org.elasticsearch.indices.index_management.freeze_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.request.*;

public class FreezeIndexRequest extends RequestBase<FreezeIndexRequest> implements XContentable<FreezeIndexRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public FreezeIndexRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }

  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public FreezeIndexRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }

  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public FreezeIndexRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }

  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private String _masterTimeout;
  public String getMasterTimeout() { return this._masterTimeout; }
  public FreezeIndexRequest setMasterTimeout(String val) { this._masterTimeout = val; return this; }

  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public FreezeIndexRequest setTimeout(String val) { this._timeout = val; return this; }

  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public FreezeIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_allowNoIndices != null) {
      builder.field(ALLOW_NO_INDICES.getPreferredName(), _allowNoIndices);
    }
    if (_expandWildcards != null) {
      builder.field(EXPAND_WILDCARDS.getPreferredName());
      _expandWildcards.toXContent(builder, params);
    }
    if (_ignoreUnavailable != null) {
      builder.field(IGNORE_UNAVAILABLE.getPreferredName(), _ignoreUnavailable);
    }
    if (_masterTimeout != null) {
      builder.field(MASTER_TIMEOUT.getPreferredName(), _masterTimeout);
    }
    if (_timeout != null) {
      builder.field(TIMEOUT.getPreferredName(), _timeout);
    }
    if (_waitForActiveShards != null) {
      builder.field(WAIT_FOR_ACTIVE_SHARDS.getPreferredName(), _waitForActiveShards);
    }
  }

  @Override
  public FreezeIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FreezeIndexRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<FreezeIndexRequest, Void> PARSER =
    new ObjectParser<>(FreezeIndexRequest.class.getName(), false, FreezeIndexRequest::new);

  static {
    PARSER.declareBoolean(FreezeIndexRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareField(FreezeIndexRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareBoolean(FreezeIndexRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareString(FreezeIndexRequest::setMasterTimeout, MASTER_TIMEOUT);
    PARSER.declareString(FreezeIndexRequest::setTimeout, TIMEOUT);
    PARSER.declareString(FreezeIndexRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
  }

}
