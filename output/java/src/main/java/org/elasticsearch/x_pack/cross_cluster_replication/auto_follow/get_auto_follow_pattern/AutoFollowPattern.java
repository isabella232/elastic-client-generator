
package org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.get_auto_follow_pattern;

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
import org.elasticsearch.common_options.time_unit.*;

public class AutoFollowPattern  implements XContentable<AutoFollowPattern> {
  
  static final ParseField FOLLOW_INDEX_PATTERN = new ParseField("follow_index_pattern");
  private String _followIndexPattern;
  public String getFollowIndexPattern() { return this._followIndexPattern; }
  public AutoFollowPattern setFollowIndexPattern(String val) { this._followIndexPattern = val; return this; }

  static final ParseField LEADER_INDEX_PATTERNS = new ParseField("leader_index_patterns");
  private List<String> _leaderIndexPatterns;
  public List<String> getLeaderIndexPatterns() { return this._leaderIndexPatterns; }
  public AutoFollowPattern setLeaderIndexPatterns(List<String> val) { this._leaderIndexPatterns = val; return this; }

  static final ParseField MAX_OUTSTANDING_READ_REQUESTS = new ParseField("max_outstanding_read_requests");
  private long _maxOutstandingReadRequests;
  private boolean _maxOutstandingReadRequests$isSet;
  public long getMaxOutstandingReadRequests() { return this._maxOutstandingReadRequests; }
  public AutoFollowPattern setMaxOutstandingReadRequests(long val) {
    this._maxOutstandingReadRequests = val;
    _maxOutstandingReadRequests$isSet = true;
    return this;
  }

  static final ParseField MAX_OUTSTANDING_WRITE_REQUESTS = new ParseField("max_outstanding_write_requests");
  private int _maxOutstandingWriteRequests;
  private boolean _maxOutstandingWriteRequests$isSet;
  public int getMaxOutstandingWriteRequests() { return this._maxOutstandingWriteRequests; }
  public AutoFollowPattern setMaxOutstandingWriteRequests(int val) {
    this._maxOutstandingWriteRequests = val;
    _maxOutstandingWriteRequests$isSet = true;
    return this;
  }

  static final ParseField READ_POLL_TIMEOUT = new ParseField("read_poll_timeout");
  private String _readPollTimeout;
  public String getReadPollTimeout() { return this._readPollTimeout; }
  public AutoFollowPattern setReadPollTimeout(String val) { this._readPollTimeout = val; return this; }

  static final ParseField MAX_READ_REQUEST_OPERATION_COUNT = new ParseField("max_read_request_operation_count");
  private int _maxReadRequestOperationCount;
  private boolean _maxReadRequestOperationCount$isSet;
  public int getMaxReadRequestOperationCount() { return this._maxReadRequestOperationCount; }
  public AutoFollowPattern setMaxReadRequestOperationCount(int val) {
    this._maxReadRequestOperationCount = val;
    _maxReadRequestOperationCount$isSet = true;
    return this;
  }

  static final ParseField MAX_READ_REQUEST_SIZE = new ParseField("max_read_request_size");
  private String _maxReadRequestSize;
  public String getMaxReadRequestSize() { return this._maxReadRequestSize; }
  public AutoFollowPattern setMaxReadRequestSize(String val) { this._maxReadRequestSize = val; return this; }

  static final ParseField MAX_RETRY_DELAY = new ParseField("max_retry_delay");
  private String _maxRetryDelay;
  public String getMaxRetryDelay() { return this._maxRetryDelay; }
  public AutoFollowPattern setMaxRetryDelay(String val) { this._maxRetryDelay = val; return this; }

  static final ParseField MAX_WRITE_BUFFER_COUNT = new ParseField("max_write_buffer_count");
  private int _maxWriteBufferCount;
  private boolean _maxWriteBufferCount$isSet;
  public int getMaxWriteBufferCount() { return this._maxWriteBufferCount; }
  public AutoFollowPattern setMaxWriteBufferCount(int val) {
    this._maxWriteBufferCount = val;
    _maxWriteBufferCount$isSet = true;
    return this;
  }

  static final ParseField MAX_WRITE_BUFFER_SIZE = new ParseField("max_write_buffer_size");
  private String _maxWriteBufferSize;
  public String getMaxWriteBufferSize() { return this._maxWriteBufferSize; }
  public AutoFollowPattern setMaxWriteBufferSize(String val) { this._maxWriteBufferSize = val; return this; }

  static final ParseField MAX_WRITE_REQUEST_OPERATION_COUNT = new ParseField("max_write_request_operation_count");
  private int _maxWriteRequestOperationCount;
  private boolean _maxWriteRequestOperationCount$isSet;
  public int getMaxWriteRequestOperationCount() { return this._maxWriteRequestOperationCount; }
  public AutoFollowPattern setMaxWriteRequestOperationCount(int val) {
    this._maxWriteRequestOperationCount = val;
    _maxWriteRequestOperationCount$isSet = true;
    return this;
  }

  static final ParseField MAX_WRITE_REQUEST_SIZE = new ParseField("max_write_request_size");
  private String _maxWriteRequestSize;
  public String getMaxWriteRequestSize() { return this._maxWriteRequestSize; }
  public AutoFollowPattern setMaxWriteRequestSize(String val) { this._maxWriteRequestSize = val; return this; }

  static final ParseField REMOTE_CLUSTER = new ParseField("remote_cluster");
  private String _remoteCluster;
  public String getRemoteCluster() { return this._remoteCluster; }
  public AutoFollowPattern setRemoteCluster(String val) { this._remoteCluster = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_followIndexPattern != null) {
      builder.field(FOLLOW_INDEX_PATTERN.getPreferredName(), _followIndexPattern);
    }
    if (_leaderIndexPatterns != null) {
      builder.array(LEADER_INDEX_PATTERNS.getPreferredName(), _leaderIndexPatterns);
    }
    if (_maxOutstandingReadRequests$isSet) {
      builder.field(MAX_OUTSTANDING_READ_REQUESTS.getPreferredName(), _maxOutstandingReadRequests);
    }
    if (_maxOutstandingWriteRequests$isSet) {
      builder.field(MAX_OUTSTANDING_WRITE_REQUESTS.getPreferredName(), _maxOutstandingWriteRequests);
    }
    if (_readPollTimeout != null) {
      builder.field(READ_POLL_TIMEOUT.getPreferredName(), _readPollTimeout);
    }
    if (_maxReadRequestOperationCount$isSet) {
      builder.field(MAX_READ_REQUEST_OPERATION_COUNT.getPreferredName(), _maxReadRequestOperationCount);
    }
    if (_maxReadRequestSize != null) {
      builder.field(MAX_READ_REQUEST_SIZE.getPreferredName(), _maxReadRequestSize);
    }
    if (_maxRetryDelay != null) {
      builder.field(MAX_RETRY_DELAY.getPreferredName(), _maxRetryDelay);
    }
    if (_maxWriteBufferCount$isSet) {
      builder.field(MAX_WRITE_BUFFER_COUNT.getPreferredName(), _maxWriteBufferCount);
    }
    if (_maxWriteBufferSize != null) {
      builder.field(MAX_WRITE_BUFFER_SIZE.getPreferredName(), _maxWriteBufferSize);
    }
    if (_maxWriteRequestOperationCount$isSet) {
      builder.field(MAX_WRITE_REQUEST_OPERATION_COUNT.getPreferredName(), _maxWriteRequestOperationCount);
    }
    if (_maxWriteRequestSize != null) {
      builder.field(MAX_WRITE_REQUEST_SIZE.getPreferredName(), _maxWriteRequestSize);
    }
    if (_remoteCluster != null) {
      builder.field(REMOTE_CLUSTER.getPreferredName(), _remoteCluster);
    }
  }

  @Override
  public AutoFollowPattern fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AutoFollowPattern.PARSER.apply(parser, null);
  }

  public static final ObjectParser<AutoFollowPattern, Void> PARSER =
    new ObjectParser<>(AutoFollowPattern.class.getName(), false, AutoFollowPattern::new);

  static {
    PARSER.declareString(AutoFollowPattern::setFollowIndexPattern, FOLLOW_INDEX_PATTERN);
    PARSER.declareStringArray(AutoFollowPattern::setLeaderIndexPatterns, LEADER_INDEX_PATTERNS);
    PARSER.declareLong(AutoFollowPattern::setMaxOutstandingReadRequests, MAX_OUTSTANDING_READ_REQUESTS);
    PARSER.declareInt(AutoFollowPattern::setMaxOutstandingWriteRequests, MAX_OUTSTANDING_WRITE_REQUESTS);
    PARSER.declareString(AutoFollowPattern::setReadPollTimeout, READ_POLL_TIMEOUT);
    PARSER.declareInt(AutoFollowPattern::setMaxReadRequestOperationCount, MAX_READ_REQUEST_OPERATION_COUNT);
    PARSER.declareString(AutoFollowPattern::setMaxReadRequestSize, MAX_READ_REQUEST_SIZE);
    PARSER.declareString(AutoFollowPattern::setMaxRetryDelay, MAX_RETRY_DELAY);
    PARSER.declareInt(AutoFollowPattern::setMaxWriteBufferCount, MAX_WRITE_BUFFER_COUNT);
    PARSER.declareString(AutoFollowPattern::setMaxWriteBufferSize, MAX_WRITE_BUFFER_SIZE);
    PARSER.declareInt(AutoFollowPattern::setMaxWriteRequestOperationCount, MAX_WRITE_REQUEST_OPERATION_COUNT);
    PARSER.declareString(AutoFollowPattern::setMaxWriteRequestSize, MAX_WRITE_REQUEST_SIZE);
    PARSER.declareString(AutoFollowPattern::setRemoteCluster, REMOTE_CLUSTER);
  }

}
