
package org.elasticsearch.indices.monitoring.indices_stats;

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

public class ShardIndexing  implements XContentable<ShardIndexing> {
  
  static final ParseField DELETE_CURRENT = new ParseField("delete_current");
  private long _deleteCurrent;
  private boolean _deleteCurrent$isSet;
  public long getDeleteCurrent() { return this._deleteCurrent; }
  public ShardIndexing setDeleteCurrent(long val) {
    this._deleteCurrent = val;
    _deleteCurrent$isSet = true;
    return this;
  }

  static final ParseField DELETE_TIME_IN_MILLIS = new ParseField("delete_time_in_millis");
  private long _deleteTimeInMillis;
  private boolean _deleteTimeInMillis$isSet;
  public long getDeleteTimeInMillis() { return this._deleteTimeInMillis; }
  public ShardIndexing setDeleteTimeInMillis(long val) {
    this._deleteTimeInMillis = val;
    _deleteTimeInMillis$isSet = true;
    return this;
  }

  static final ParseField DELETE_TOTAL = new ParseField("delete_total");
  private long _deleteTotal;
  private boolean _deleteTotal$isSet;
  public long getDeleteTotal() { return this._deleteTotal; }
  public ShardIndexing setDeleteTotal(long val) {
    this._deleteTotal = val;
    _deleteTotal$isSet = true;
    return this;
  }

  static final ParseField INDEX_CURRENT = new ParseField("index_current");
  private long _indexCurrent;
  private boolean _indexCurrent$isSet;
  public long getIndexCurrent() { return this._indexCurrent; }
  public ShardIndexing setIndexCurrent(long val) {
    this._indexCurrent = val;
    _indexCurrent$isSet = true;
    return this;
  }

  static final ParseField INDEX_FAILED = new ParseField("index_failed");
  private long _indexFailed;
  private boolean _indexFailed$isSet;
  public long getIndexFailed() { return this._indexFailed; }
  public ShardIndexing setIndexFailed(long val) {
    this._indexFailed = val;
    _indexFailed$isSet = true;
    return this;
  }

  static final ParseField INDEX_TIME_IN_MILLIS = new ParseField("index_time_in_millis");
  private long _indexTimeInMillis;
  private boolean _indexTimeInMillis$isSet;
  public long getIndexTimeInMillis() { return this._indexTimeInMillis; }
  public ShardIndexing setIndexTimeInMillis(long val) {
    this._indexTimeInMillis = val;
    _indexTimeInMillis$isSet = true;
    return this;
  }

  static final ParseField INDEX_TOTAL = new ParseField("index_total");
  private long _indexTotal;
  private boolean _indexTotal$isSet;
  public long getIndexTotal() { return this._indexTotal; }
  public ShardIndexing setIndexTotal(long val) {
    this._indexTotal = val;
    _indexTotal$isSet = true;
    return this;
  }

  static final ParseField IS_THROTTLED = new ParseField("is_throttled");
  private Boolean _isThrottled;
  public Boolean getIsThrottled() { return this._isThrottled; }
  public ShardIndexing setIsThrottled(Boolean val) { this._isThrottled = val; return this; }

  static final ParseField NOOP_UPDATE_TOTAL = new ParseField("noop_update_total");
  private long _noopUpdateTotal;
  private boolean _noopUpdateTotal$isSet;
  public long getNoopUpdateTotal() { return this._noopUpdateTotal; }
  public ShardIndexing setNoopUpdateTotal(long val) {
    this._noopUpdateTotal = val;
    _noopUpdateTotal$isSet = true;
    return this;
  }

  static final ParseField THROTTLE_TIME_IN_MILLIS = new ParseField("throttle_time_in_millis");
  private long _throttleTimeInMillis;
  private boolean _throttleTimeInMillis$isSet;
  public long getThrottleTimeInMillis() { return this._throttleTimeInMillis; }
  public ShardIndexing setThrottleTimeInMillis(long val) {
    this._throttleTimeInMillis = val;
    _throttleTimeInMillis$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_deleteCurrent$isSet) {
      builder.field(DELETE_CURRENT.getPreferredName(), _deleteCurrent);
    }
    if (_deleteTimeInMillis$isSet) {
      builder.field(DELETE_TIME_IN_MILLIS.getPreferredName(), _deleteTimeInMillis);
    }
    if (_deleteTotal$isSet) {
      builder.field(DELETE_TOTAL.getPreferredName(), _deleteTotal);
    }
    if (_indexCurrent$isSet) {
      builder.field(INDEX_CURRENT.getPreferredName(), _indexCurrent);
    }
    if (_indexFailed$isSet) {
      builder.field(INDEX_FAILED.getPreferredName(), _indexFailed);
    }
    if (_indexTimeInMillis$isSet) {
      builder.field(INDEX_TIME_IN_MILLIS.getPreferredName(), _indexTimeInMillis);
    }
    if (_indexTotal$isSet) {
      builder.field(INDEX_TOTAL.getPreferredName(), _indexTotal);
    }
    if (_isThrottled != null) {
      builder.field(IS_THROTTLED.getPreferredName(), _isThrottled);
    }
    if (_noopUpdateTotal$isSet) {
      builder.field(NOOP_UPDATE_TOTAL.getPreferredName(), _noopUpdateTotal);
    }
    if (_throttleTimeInMillis$isSet) {
      builder.field(THROTTLE_TIME_IN_MILLIS.getPreferredName(), _throttleTimeInMillis);
    }
  }

  @Override
  public ShardIndexing fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardIndexing.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ShardIndexing, Void> PARSER =
    new ObjectParser<>(ShardIndexing.class.getName(), false, ShardIndexing::new);

  static {
    PARSER.declareLong(ShardIndexing::setDeleteCurrent, DELETE_CURRENT);
    PARSER.declareLong(ShardIndexing::setDeleteTimeInMillis, DELETE_TIME_IN_MILLIS);
    PARSER.declareLong(ShardIndexing::setDeleteTotal, DELETE_TOTAL);
    PARSER.declareLong(ShardIndexing::setIndexCurrent, INDEX_CURRENT);
    PARSER.declareLong(ShardIndexing::setIndexFailed, INDEX_FAILED);
    PARSER.declareLong(ShardIndexing::setIndexTimeInMillis, INDEX_TIME_IN_MILLIS);
    PARSER.declareLong(ShardIndexing::setIndexTotal, INDEX_TOTAL);
    PARSER.declareBoolean(ShardIndexing::setIsThrottled, IS_THROTTLED);
    PARSER.declareLong(ShardIndexing::setNoopUpdateTotal, NOOP_UPDATE_TOTAL);
    PARSER.declareLong(ShardIndexing::setThrottleTimeInMillis, THROTTLE_TIME_IN_MILLIS);
  }

}
