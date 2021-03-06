
package org.elasticsearch.common_options.stats;

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

public class MergesStats  implements XContentable<MergesStats> {
  
  static final ParseField CURRENT = new ParseField("current");
  private long _current;
  private boolean _current$isSet;
  public long getCurrent() { return this._current; }
  public MergesStats setCurrent(long val) {
    this._current = val;
    _current$isSet = true;
    return this;
  }

  static final ParseField CURRENT_DOCS = new ParseField("current_docs");
  private long _currentDocs;
  private boolean _currentDocs$isSet;
  public long getCurrentDocs() { return this._currentDocs; }
  public MergesStats setCurrentDocs(long val) {
    this._currentDocs = val;
    _currentDocs$isSet = true;
    return this;
  }

  static final ParseField CURRENT_SIZE = new ParseField("current_size");
  private String _currentSize;
  public String getCurrentSize() { return this._currentSize; }
  public MergesStats setCurrentSize(String val) { this._currentSize = val; return this; }

  static final ParseField CURRENT_SIZE_IN_BYTES = new ParseField("current_size_in_bytes");
  private long _currentSizeInBytes;
  private boolean _currentSizeInBytes$isSet;
  public long getCurrentSizeInBytes() { return this._currentSizeInBytes; }
  public MergesStats setCurrentSizeInBytes(long val) {
    this._currentSizeInBytes = val;
    _currentSizeInBytes$isSet = true;
    return this;
  }

  static final ParseField TOTAL = new ParseField("total");
  private long _total;
  private boolean _total$isSet;
  public long getTotal() { return this._total; }
  public MergesStats setTotal(long val) {
    this._total = val;
    _total$isSet = true;
    return this;
  }

  static final ParseField TOTAL_AUTO_THROTTLE = new ParseField("total_auto_throttle");
  private String _totalAutoThrottle;
  public String getTotalAutoThrottle() { return this._totalAutoThrottle; }
  public MergesStats setTotalAutoThrottle(String val) { this._totalAutoThrottle = val; return this; }

  static final ParseField TOTAL_AUTO_THROTTLE_IN_BYTES = new ParseField("total_auto_throttle_in_bytes");
  private long _totalAutoThrottleInBytes;
  private boolean _totalAutoThrottleInBytes$isSet;
  public long getTotalAutoThrottleInBytes() { return this._totalAutoThrottleInBytes; }
  public MergesStats setTotalAutoThrottleInBytes(long val) {
    this._totalAutoThrottleInBytes = val;
    _totalAutoThrottleInBytes$isSet = true;
    return this;
  }

  static final ParseField TOTAL_DOCS = new ParseField("total_docs");
  private long _totalDocs;
  private boolean _totalDocs$isSet;
  public long getTotalDocs() { return this._totalDocs; }
  public MergesStats setTotalDocs(long val) {
    this._totalDocs = val;
    _totalDocs$isSet = true;
    return this;
  }

  static final ParseField TOTAL_SIZE = new ParseField("total_size");
  private String _totalSize;
  public String getTotalSize() { return this._totalSize; }
  public MergesStats setTotalSize(String val) { this._totalSize = val; return this; }

  static final ParseField TOTAL_SIZE_IN_BYTES = new ParseField("total_size_in_bytes");
  private long _totalSizeInBytes;
  private boolean _totalSizeInBytes$isSet;
  public long getTotalSizeInBytes() { return this._totalSizeInBytes; }
  public MergesStats setTotalSizeInBytes(long val) {
    this._totalSizeInBytes = val;
    _totalSizeInBytes$isSet = true;
    return this;
  }

  static final ParseField TOTAL_STOPPED_TIME = new ParseField("total_stopped_time");
  private String _totalStoppedTime;
  public String getTotalStoppedTime() { return this._totalStoppedTime; }
  public MergesStats setTotalStoppedTime(String val) { this._totalStoppedTime = val; return this; }

  static final ParseField TOTAL_STOPPED_TIME_IN_MILLIS = new ParseField("total__stopped_time_in_millis");
  private long _totalStoppedTimeInMillis;
  private boolean _totalStoppedTimeInMillis$isSet;
  public long getTotalStoppedTimeInMillis() { return this._totalStoppedTimeInMillis; }
  public MergesStats setTotalStoppedTimeInMillis(long val) {
    this._totalStoppedTimeInMillis = val;
    _totalStoppedTimeInMillis$isSet = true;
    return this;
  }

  static final ParseField TOTAL_THROTTLED_TIME = new ParseField("total_throttled_time");
  private String _totalThrottledTime;
  public String getTotalThrottledTime() { return this._totalThrottledTime; }
  public MergesStats setTotalThrottledTime(String val) { this._totalThrottledTime = val; return this; }

  static final ParseField TOTAL_THROTTLED_TIME_IN_MILLIS = new ParseField("total_throttled_time_in_millis");
  private long _totalThrottledTimeInMillis;
  private boolean _totalThrottledTimeInMillis$isSet;
  public long getTotalThrottledTimeInMillis() { return this._totalThrottledTimeInMillis; }
  public MergesStats setTotalThrottledTimeInMillis(long val) {
    this._totalThrottledTimeInMillis = val;
    _totalThrottledTimeInMillis$isSet = true;
    return this;
  }

  static final ParseField TOTAL_TIME = new ParseField("total_time");
  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public MergesStats setTotalTime(String val) { this._totalTime = val; return this; }

  static final ParseField TOTAL_TIME_IN_MILLIS = new ParseField("total_time_in_millis");
  private long _totalTimeInMillis;
  private boolean _totalTimeInMillis$isSet;
  public long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public MergesStats setTotalTimeInMillis(long val) {
    this._totalTimeInMillis = val;
    _totalTimeInMillis$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_current$isSet) {
      builder.field(CURRENT.getPreferredName(), _current);
    }
    if (_currentDocs$isSet) {
      builder.field(CURRENT_DOCS.getPreferredName(), _currentDocs);
    }
    if (_currentSize != null) {
      builder.field(CURRENT_SIZE.getPreferredName(), _currentSize);
    }
    if (_currentSizeInBytes$isSet) {
      builder.field(CURRENT_SIZE_IN_BYTES.getPreferredName(), _currentSizeInBytes);
    }
    if (_total$isSet) {
      builder.field(TOTAL.getPreferredName(), _total);
    }
    if (_totalAutoThrottle != null) {
      builder.field(TOTAL_AUTO_THROTTLE.getPreferredName(), _totalAutoThrottle);
    }
    if (_totalAutoThrottleInBytes$isSet) {
      builder.field(TOTAL_AUTO_THROTTLE_IN_BYTES.getPreferredName(), _totalAutoThrottleInBytes);
    }
    if (_totalDocs$isSet) {
      builder.field(TOTAL_DOCS.getPreferredName(), _totalDocs);
    }
    if (_totalSize != null) {
      builder.field(TOTAL_SIZE.getPreferredName(), _totalSize);
    }
    if (_totalSizeInBytes$isSet) {
      builder.field(TOTAL_SIZE_IN_BYTES.getPreferredName(), _totalSizeInBytes);
    }
    if (_totalStoppedTime != null) {
      builder.field(TOTAL_STOPPED_TIME.getPreferredName(), _totalStoppedTime);
    }
    if (_totalStoppedTimeInMillis$isSet) {
      builder.field(TOTAL_STOPPED_TIME_IN_MILLIS.getPreferredName(), _totalStoppedTimeInMillis);
    }
    if (_totalThrottledTime != null) {
      builder.field(TOTAL_THROTTLED_TIME.getPreferredName(), _totalThrottledTime);
    }
    if (_totalThrottledTimeInMillis$isSet) {
      builder.field(TOTAL_THROTTLED_TIME_IN_MILLIS.getPreferredName(), _totalThrottledTimeInMillis);
    }
    if (_totalTime != null) {
      builder.field(TOTAL_TIME.getPreferredName(), _totalTime);
    }
    if (_totalTimeInMillis$isSet) {
      builder.field(TOTAL_TIME_IN_MILLIS.getPreferredName(), _totalTimeInMillis);
    }
  }

  @Override
  public MergesStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MergesStats.PARSER.apply(parser, null);
  }

  public static final ObjectParser<MergesStats, Void> PARSER =
    new ObjectParser<>(MergesStats.class.getName(), false, MergesStats::new);

  static {
    PARSER.declareLong(MergesStats::setCurrent, CURRENT);
    PARSER.declareLong(MergesStats::setCurrentDocs, CURRENT_DOCS);
    PARSER.declareString(MergesStats::setCurrentSize, CURRENT_SIZE);
    PARSER.declareLong(MergesStats::setCurrentSizeInBytes, CURRENT_SIZE_IN_BYTES);
    PARSER.declareLong(MergesStats::setTotal, TOTAL);
    PARSER.declareString(MergesStats::setTotalAutoThrottle, TOTAL_AUTO_THROTTLE);
    PARSER.declareLong(MergesStats::setTotalAutoThrottleInBytes, TOTAL_AUTO_THROTTLE_IN_BYTES);
    PARSER.declareLong(MergesStats::setTotalDocs, TOTAL_DOCS);
    PARSER.declareString(MergesStats::setTotalSize, TOTAL_SIZE);
    PARSER.declareLong(MergesStats::setTotalSizeInBytes, TOTAL_SIZE_IN_BYTES);
    PARSER.declareString(MergesStats::setTotalStoppedTime, TOTAL_STOPPED_TIME);
    PARSER.declareLong(MergesStats::setTotalStoppedTimeInMillis, TOTAL_STOPPED_TIME_IN_MILLIS);
    PARSER.declareString(MergesStats::setTotalThrottledTime, TOTAL_THROTTLED_TIME);
    PARSER.declareLong(MergesStats::setTotalThrottledTimeInMillis, TOTAL_THROTTLED_TIME_IN_MILLIS);
    PARSER.declareString(MergesStats::setTotalTime, TOTAL_TIME);
    PARSER.declareLong(MergesStats::setTotalTimeInMillis, TOTAL_TIME_IN_MILLIS);
  }

}
