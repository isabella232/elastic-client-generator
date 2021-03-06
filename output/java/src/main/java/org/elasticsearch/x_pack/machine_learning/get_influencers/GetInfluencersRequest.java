
package org.elasticsearch.x_pack.machine_learning.get_influencers;

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
import org.elasticsearch.x_pack.machine_learning.job.*;
import org.elasticsearch.common_abstractions.request.*;

public class GetInfluencersRequest extends RequestBase<GetInfluencersRequest> implements XContentable<GetInfluencersRequest> {
  
  static final ParseField DESCENDING = new ParseField("descending");
  private Boolean _descending;
  public Boolean getDescending() { return this._descending; }
  public GetInfluencersRequest setDescending(Boolean val) { this._descending = val; return this; }

  static final ParseField END = new ParseField("end");
  private Date _end;
  public Date getEnd() { return this._end; }
  public GetInfluencersRequest setEnd(Date val) { this._end = val; return this; }

  static final ParseField EXCLUDE_INTERIM = new ParseField("exclude_interim");
  private Boolean _excludeInterim;
  public Boolean getExcludeInterim() { return this._excludeInterim; }
  public GetInfluencersRequest setExcludeInterim(Boolean val) { this._excludeInterim = val; return this; }

  static final ParseField INFLUENCER_SCORE = new ParseField("influencer_score");
  private double _influencerScore;
  private boolean _influencerScore$isSet;
  public double getInfluencerScore() { return this._influencerScore; }
  public GetInfluencersRequest setInfluencerScore(double val) {
    this._influencerScore = val;
    _influencerScore$isSet = true;
    return this;
  }

  static final ParseField PAGE = new ParseField("page");
  private Page _page;
  public Page getPage() { return this._page; }
  public GetInfluencersRequest setPage(Page val) { this._page = val; return this; }

  static final ParseField SORT = new ParseField("sort");
  private String _sort;
  public String getSort() { return this._sort; }
  public GetInfluencersRequest setSort(String val) { this._sort = val; return this; }

  static final ParseField START = new ParseField("start");
  private Date _start;
  public Date getStart() { return this._start; }
  public GetInfluencersRequest setStart(Date val) { this._start = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_descending != null) {
      builder.field(DESCENDING.getPreferredName(), _descending);
    }
    if (_end != null) {
      builder.field(END.getPreferredName(),
        DateTimeFormatter.ISO_DATE.format(_end.toInstant()));
    }
    if (_excludeInterim != null) {
      builder.field(EXCLUDE_INTERIM.getPreferredName(), _excludeInterim);
    }
    if (_influencerScore$isSet) {
      builder.field(INFLUENCER_SCORE.getPreferredName(), _influencerScore);
    }
    if (_page != null) {
      builder.field(PAGE.getPreferredName());
      _page.toXContent(builder, params);
    }
    if (_sort != null) {
      builder.field(SORT.getPreferredName(), _sort);
    }
    if (_start != null) {
      builder.field(START.getPreferredName(),
        DateTimeFormatter.ISO_DATE.format(_start.toInstant()));
    }
  }

  @Override
  public GetInfluencersRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetInfluencersRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GetInfluencersRequest, Void> PARSER =
    new ObjectParser<>(GetInfluencersRequest.class.getName(), false, GetInfluencersRequest::new);

  static {
    PARSER.declareBoolean(GetInfluencersRequest::setDescending, DESCENDING);
    PARSER.declareObject(GetInfluencersRequest::setEnd, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), END);
    PARSER.declareBoolean(GetInfluencersRequest::setExcludeInterim, EXCLUDE_INTERIM);
    PARSER.declareDouble(GetInfluencersRequest::setInfluencerScore, INFLUENCER_SCORE);
    PARSER.declareObject(GetInfluencersRequest::setPage, (p, t) -> Page.PARSER.apply(p, t), PAGE);
    PARSER.declareString(GetInfluencersRequest::setSort, SORT);
    PARSER.declareObject(GetInfluencersRequest::setStart, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), START);
  }

}
