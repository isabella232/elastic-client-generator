
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

public class GetStats  implements XContentable<GetStats> {
  
  static final ParseField CURRENT = new ParseField("current");
  private long _current;
  private boolean _current$isSet;
  public long getCurrent() { return this._current; }
  public GetStats setCurrent(long val) {
    this._current = val;
    _current$isSet = true;
    return this;
  }

  static final ParseField EXISTS_TIME = new ParseField("exists_time");
  private String _existsTime;
  public String getExistsTime() { return this._existsTime; }
  public GetStats setExistsTime(String val) { this._existsTime = val; return this; }

  static final ParseField EXISTS_TIME_IN_MILLIS = new ParseField("exists_time_in_millis");
  private long _existsTimeInMillis;
  private boolean _existsTimeInMillis$isSet;
  public long getExistsTimeInMillis() { return this._existsTimeInMillis; }
  public GetStats setExistsTimeInMillis(long val) {
    this._existsTimeInMillis = val;
    _existsTimeInMillis$isSet = true;
    return this;
  }

  static final ParseField EXISTS_TOTAL = new ParseField("exists_total");
  private long _existsTotal;
  private boolean _existsTotal$isSet;
  public long getExistsTotal() { return this._existsTotal; }
  public GetStats setExistsTotal(long val) {
    this._existsTotal = val;
    _existsTotal$isSet = true;
    return this;
  }

  static final ParseField MISSING_TIME = new ParseField("missing_time");
  private String _missingTime;
  public String getMissingTime() { return this._missingTime; }
  public GetStats setMissingTime(String val) { this._missingTime = val; return this; }

  static final ParseField MISSING_TIME_IN_MILLIS = new ParseField("missing_time_in_millis");
  private long _missingTimeInMillis;
  private boolean _missingTimeInMillis$isSet;
  public long getMissingTimeInMillis() { return this._missingTimeInMillis; }
  public GetStats setMissingTimeInMillis(long val) {
    this._missingTimeInMillis = val;
    _missingTimeInMillis$isSet = true;
    return this;
  }

  static final ParseField MISSING_TOTAL = new ParseField("missing_total");
  private long _missingTotal;
  private boolean _missingTotal$isSet;
  public long getMissingTotal() { return this._missingTotal; }
  public GetStats setMissingTotal(long val) {
    this._missingTotal = val;
    _missingTotal$isSet = true;
    return this;
  }

  static final ParseField TIME = new ParseField("time");
  private String _time;
  public String getTime() { return this._time; }
  public GetStats setTime(String val) { this._time = val; return this; }

  static final ParseField TIME_IN_MILLIS = new ParseField("time_in_millis");
  private long _timeInMillis;
  private boolean _timeInMillis$isSet;
  public long getTimeInMillis() { return this._timeInMillis; }
  public GetStats setTimeInMillis(long val) {
    this._timeInMillis = val;
    _timeInMillis$isSet = true;
    return this;
  }

  static final ParseField TOTAL = new ParseField("total");
  private long _total;
  private boolean _total$isSet;
  public long getTotal() { return this._total; }
  public GetStats setTotal(long val) {
    this._total = val;
    _total$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_current$isSet) {
      builder.field(CURRENT.getPreferredName(), _current);
    }
    if (_existsTime != null) {
      builder.field(EXISTS_TIME.getPreferredName(), _existsTime);
    }
    if (_existsTimeInMillis$isSet) {
      builder.field(EXISTS_TIME_IN_MILLIS.getPreferredName(), _existsTimeInMillis);
    }
    if (_existsTotal$isSet) {
      builder.field(EXISTS_TOTAL.getPreferredName(), _existsTotal);
    }
    if (_missingTime != null) {
      builder.field(MISSING_TIME.getPreferredName(), _missingTime);
    }
    if (_missingTimeInMillis$isSet) {
      builder.field(MISSING_TIME_IN_MILLIS.getPreferredName(), _missingTimeInMillis);
    }
    if (_missingTotal$isSet) {
      builder.field(MISSING_TOTAL.getPreferredName(), _missingTotal);
    }
    if (_time != null) {
      builder.field(TIME.getPreferredName(), _time);
    }
    if (_timeInMillis$isSet) {
      builder.field(TIME_IN_MILLIS.getPreferredName(), _timeInMillis);
    }
    if (_total$isSet) {
      builder.field(TOTAL.getPreferredName(), _total);
    }
  }

  @Override
  public GetStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetStats.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GetStats, Void> PARSER =
    new ObjectParser<>(GetStats.class.getName(), false, GetStats::new);

  static {
    PARSER.declareLong(GetStats::setCurrent, CURRENT);
    PARSER.declareString(GetStats::setExistsTime, EXISTS_TIME);
    PARSER.declareLong(GetStats::setExistsTimeInMillis, EXISTS_TIME_IN_MILLIS);
    PARSER.declareLong(GetStats::setExistsTotal, EXISTS_TOTAL);
    PARSER.declareString(GetStats::setMissingTime, MISSING_TIME);
    PARSER.declareLong(GetStats::setMissingTimeInMillis, MISSING_TIME_IN_MILLIS);
    PARSER.declareLong(GetStats::setMissingTotal, MISSING_TOTAL);
    PARSER.declareString(GetStats::setTime, TIME);
    PARSER.declareLong(GetStats::setTimeInMillis, TIME_IN_MILLIS);
    PARSER.declareLong(GetStats::setTotal, TOTAL);
  }

}
