
package org.elasticsearch.search.search.hits;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.common_abstractions.lazy_document.*;
import org.elasticsearch.internal.*;

public class InnerHitsMetadata  implements XContentable<InnerHitsMetadata> {
  
  static final ParseField HITS = new ParseField("hits");
  private List<Hit<LazyDocument>> _hits;
  public List<Hit<LazyDocument>> getHits() { return this._hits; }
  public InnerHitsMetadata setHits(List<Hit<LazyDocument>> val) { this._hits = val; return this; }

  static final ParseField MAX_SCORE = new ParseField("max_score");
  private double _maxScore;
  private boolean _maxScore$isSet;
  public double getMaxScore() { return this._maxScore; }
  public InnerHitsMetadata setMaxScore(double val) {
    this._maxScore = val;
    _maxScore$isSet = true;
    return this;
  }

  static final ParseField TOTAL = new ParseField("total");
  private TotalHits _total;
  public TotalHits getTotal() { return this._total; }
  public InnerHitsMetadata setTotal(TotalHits val) { this._total = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_hits != null) {
      builder.array(HITS.getPreferredName(), _hits);
    }
    if (_maxScore$isSet) {
      builder.field(MAX_SCORE.getPreferredName(), _maxScore);
    }
    if (_total != null) {
      builder.field(TOTAL.getPreferredName());
      _total.toXContent(builder, params);
    }
  }

  @Override
  public InnerHitsMetadata fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return InnerHitsMetadata.PARSER.apply(parser, null);
  }

  public static final ObjectParser<InnerHitsMetadata, Void> PARSER =
    new ObjectParser<>(InnerHitsMetadata.class.getName(), false, InnerHitsMetadata::new);

  static {
    Hit<LazyDocument> _hits = new Hit<LazyDocument>();
    PARSER.declareObjectArray(InnerHitsMetadata::setHits, (p, t) -> _hits.PARSER.apply(p, t), HITS);
    PARSER.declareDouble(InnerHitsMetadata::setMaxScore, MAX_SCORE);
    PARSER.declareObject(InnerHitsMetadata::setTotal, (p, t) -> TotalHits.PARSER.apply(p, t), TOTAL);
  }

}
