
package org.elasticsearch.indices.monitoring.indices_recovery;

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

public class RecoveryTranslogStatus  implements XContentable<RecoveryTranslogStatus> {
  
  static final ParseField PERCENT = new ParseField("percent");
  private String _percent;
  public String getPercent() { return this._percent; }
  public RecoveryTranslogStatus setPercent(String val) { this._percent = val; return this; }

  static final ParseField RECOVERED = new ParseField("recovered");
  private long _recovered;
  private boolean _recovered$isSet;
  public long getRecovered() { return this._recovered; }
  public RecoveryTranslogStatus setRecovered(long val) {
    this._recovered = val;
    _recovered$isSet = true;
    return this;
  }

  static final ParseField TOTAL = new ParseField("total");
  private long _total;
  private boolean _total$isSet;
  public long getTotal() { return this._total; }
  public RecoveryTranslogStatus setTotal(long val) {
    this._total = val;
    _total$isSet = true;
    return this;
  }

  static final ParseField TOTAL_ON_START = new ParseField("total_on_start");
  private long _totalOnStart;
  private boolean _totalOnStart$isSet;
  public long getTotalOnStart() { return this._totalOnStart; }
  public RecoveryTranslogStatus setTotalOnStart(long val) {
    this._totalOnStart = val;
    _totalOnStart$isSet = true;
    return this;
  }

  static final ParseField TOTAL_TIME = new ParseField("total_time");
  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public RecoveryTranslogStatus setTotalTime(String val) { this._totalTime = val; return this; }

  static final ParseField TOTAL_TIME_IN_MILLIS = new ParseField("total_time_in_millis");
  private long _totalTimeInMillis;
  private boolean _totalTimeInMillis$isSet;
  public long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public RecoveryTranslogStatus setTotalTimeInMillis(long val) {
    this._totalTimeInMillis = val;
    _totalTimeInMillis$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_percent != null) {
      builder.field(PERCENT.getPreferredName(), _percent);
    }
    if (_recovered$isSet) {
      builder.field(RECOVERED.getPreferredName(), _recovered);
    }
    if (_total$isSet) {
      builder.field(TOTAL.getPreferredName(), _total);
    }
    if (_totalOnStart$isSet) {
      builder.field(TOTAL_ON_START.getPreferredName(), _totalOnStart);
    }
    if (_totalTime != null) {
      builder.field(TOTAL_TIME.getPreferredName(), _totalTime);
    }
    if (_totalTimeInMillis$isSet) {
      builder.field(TOTAL_TIME_IN_MILLIS.getPreferredName(), _totalTimeInMillis);
    }
  }

  @Override
  public RecoveryTranslogStatus fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryTranslogStatus.PARSER.apply(parser, null);
  }

  public static final ObjectParser<RecoveryTranslogStatus, Void> PARSER =
    new ObjectParser<>(RecoveryTranslogStatus.class.getName(), false, RecoveryTranslogStatus::new);

  static {
    PARSER.declareString(RecoveryTranslogStatus::setPercent, PERCENT);
    PARSER.declareLong(RecoveryTranslogStatus::setRecovered, RECOVERED);
    PARSER.declareLong(RecoveryTranslogStatus::setTotal, TOTAL);
    PARSER.declareLong(RecoveryTranslogStatus::setTotalOnStart, TOTAL_ON_START);
    PARSER.declareString(RecoveryTranslogStatus::setTotalTime, TOTAL_TIME);
    PARSER.declareLong(RecoveryTranslogStatus::setTotalTimeInMillis, TOTAL_TIME_IN_MILLIS);
  }

}
