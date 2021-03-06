
package org.elasticsearch.x_pack.transform.get_transform_stats;

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
import org.elasticsearch.x_pack.transform.get_transform_stats.*;

public class TransformCheckpointStats  implements XContentable<TransformCheckpointStats> {
  
  static final ParseField CHECKPOINT = new ParseField("checkpoint");
  private long _checkpoint;
  private boolean _checkpoint$isSet;
  public long getCheckpoint() { return this._checkpoint; }
  public TransformCheckpointStats setCheckpoint(long val) {
    this._checkpoint = val;
    _checkpoint$isSet = true;
    return this;
  }

  static final ParseField CHECKPOINT_PROGRESS = new ParseField("checkpoint_progress");
  private TransformProgress _checkpointProgress;
  public TransformProgress getCheckpointProgress() { return this._checkpointProgress; }
  public TransformCheckpointStats setCheckpointProgress(TransformProgress val) { this._checkpointProgress = val; return this; }

  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public TransformCheckpointStats setTimestamp(Date val) { this._timestamp = val; return this; }

  static final ParseField TIMESTAMP_MILLIS = new ParseField("timestamp_millis");
  private long _timestampMillis;
  private boolean _timestampMillis$isSet;
  public long getTimestampMillis() { return this._timestampMillis; }
  public TransformCheckpointStats setTimestampMillis(long val) {
    this._timestampMillis = val;
    _timestampMillis$isSet = true;
    return this;
  }

  static final ParseField TIME_UPPER_BOUND = new ParseField("time_upper_bound");
  private Date _timeUpperBound;
  public Date getTimeUpperBound() { return this._timeUpperBound; }
  public TransformCheckpointStats setTimeUpperBound(Date val) { this._timeUpperBound = val; return this; }

  static final ParseField TIME_UPPER_BOUND_MILLIS = new ParseField("time_upper_bound_millis");
  private long _timeUpperBoundMillis;
  private boolean _timeUpperBoundMillis$isSet;
  public long getTimeUpperBoundMillis() { return this._timeUpperBoundMillis; }
  public TransformCheckpointStats setTimeUpperBoundMillis(long val) {
    this._timeUpperBoundMillis = val;
    _timeUpperBoundMillis$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_checkpoint$isSet) {
      builder.field(CHECKPOINT.getPreferredName(), _checkpoint);
    }
    if (_checkpointProgress != null) {
      builder.field(CHECKPOINT_PROGRESS.getPreferredName());
      _checkpointProgress.toXContent(builder, params);
    }
    if (_timestamp != null) {
      builder.field(TIMESTAMP.getPreferredName(),
        DateTimeFormatter.ISO_DATE.format(_timestamp.toInstant()));
    }
    if (_timestampMillis$isSet) {
      builder.field(TIMESTAMP_MILLIS.getPreferredName(), _timestampMillis);
    }
    if (_timeUpperBound != null) {
      builder.field(TIME_UPPER_BOUND.getPreferredName(),
        DateTimeFormatter.ISO_DATE.format(_timeUpperBound.toInstant()));
    }
    if (_timeUpperBoundMillis$isSet) {
      builder.field(TIME_UPPER_BOUND_MILLIS.getPreferredName(), _timeUpperBoundMillis);
    }
  }

  @Override
  public TransformCheckpointStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TransformCheckpointStats.PARSER.apply(parser, null);
  }

  public static final ObjectParser<TransformCheckpointStats, Void> PARSER =
    new ObjectParser<>(TransformCheckpointStats.class.getName(), false, TransformCheckpointStats::new);

  static {
    PARSER.declareLong(TransformCheckpointStats::setCheckpoint, CHECKPOINT);
    PARSER.declareObject(TransformCheckpointStats::setCheckpointProgress, (p, t) -> TransformProgress.PARSER.apply(p, t), CHECKPOINT_PROGRESS);
    PARSER.declareObject(TransformCheckpointStats::setTimestamp, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), TIMESTAMP);
    PARSER.declareLong(TransformCheckpointStats::setTimestampMillis, TIMESTAMP_MILLIS);
    PARSER.declareObject(TransformCheckpointStats::setTimeUpperBound, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), TIME_UPPER_BOUND);
    PARSER.declareLong(TransformCheckpointStats::setTimeUpperBoundMillis, TIME_UPPER_BOUND_MILLIS);
  }

}
