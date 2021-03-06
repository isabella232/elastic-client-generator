
package org.elasticsearch.x_pack.machine_learning.job.results;

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
import org.elasticsearch.x_pack.machine_learning.job.results.*;

public class OverallBucket  implements XContentable<OverallBucket> {
  
  static final ParseField BUCKET_SPAN = new ParseField("bucket_span");
  private long _bucketSpan;
  private boolean _bucketSpan$isSet;
  public long getBucketSpan() { return this._bucketSpan; }
  public OverallBucket setBucketSpan(long val) {
    this._bucketSpan = val;
    _bucketSpan$isSet = true;
    return this;
  }

  static final ParseField IS_INTERIM = new ParseField("is_interim");
  private Boolean _isInterim;
  public Boolean getIsInterim() { return this._isInterim; }
  public OverallBucket setIsInterim(Boolean val) { this._isInterim = val; return this; }

  static final ParseField JOBS = new ParseField("jobs");
  private List<OverallBucketJobInfo> _jobs;
  public List<OverallBucketJobInfo> getJobs() { return this._jobs; }
  public OverallBucket setJobs(List<OverallBucketJobInfo> val) { this._jobs = val; return this; }

  static final ParseField OVERALL_SCORE = new ParseField("overall_score");
  private double _overallScore;
  private boolean _overallScore$isSet;
  public double getOverallScore() { return this._overallScore; }
  public OverallBucket setOverallScore(double val) {
    this._overallScore = val;
    _overallScore$isSet = true;
    return this;
  }

  static final ParseField RESULT_TYPE = new ParseField("result_type");
  private String _resultType;
  public String getResultType() { return this._resultType; }
  public OverallBucket setResultType(String val) { this._resultType = val; return this; }

  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public OverallBucket setTimestamp(Date val) { this._timestamp = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_bucketSpan$isSet) {
      builder.field(BUCKET_SPAN.getPreferredName(), _bucketSpan);
    }
    if (_isInterim != null) {
      builder.field(IS_INTERIM.getPreferredName(), _isInterim);
    }
    if (_jobs != null) {
      builder.array(JOBS.getPreferredName(), _jobs);
    }
    if (_overallScore$isSet) {
      builder.field(OVERALL_SCORE.getPreferredName(), _overallScore);
    }
    if (_resultType != null) {
      builder.field(RESULT_TYPE.getPreferredName(), _resultType);
    }
    if (_timestamp != null) {
      builder.field(TIMESTAMP.getPreferredName(),
        DateTimeFormatter.ISO_DATE.format(_timestamp.toInstant()));
    }
  }

  @Override
  public OverallBucket fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return OverallBucket.PARSER.apply(parser, null);
  }

  public static final ObjectParser<OverallBucket, Void> PARSER =
    new ObjectParser<>(OverallBucket.class.getName(), false, OverallBucket::new);

  static {
    PARSER.declareLong(OverallBucket::setBucketSpan, BUCKET_SPAN);
    PARSER.declareBoolean(OverallBucket::setIsInterim, IS_INTERIM);
    PARSER.declareObjectArray(OverallBucket::setJobs, (p, t) -> OverallBucketJobInfo.PARSER.apply(p, t), JOBS);
    PARSER.declareDouble(OverallBucket::setOverallScore, OVERALL_SCORE);
    PARSER.declareString(OverallBucket::setResultType, RESULT_TYPE);
    PARSER.declareObject(OverallBucket::setTimestamp, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), TIMESTAMP);
  }

}
