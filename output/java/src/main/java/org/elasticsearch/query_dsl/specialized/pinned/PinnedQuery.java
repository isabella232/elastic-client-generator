
package org.elasticsearch.query_dsl.specialized.pinned;

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
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.query_dsl.abstractions.query.*;

public class PinnedQuery extends QueryBase implements XContentable<PinnedQuery> {
  
  static final ParseField IDS = new ParseField("ids");
  private List<Id> _ids;
  public List<Id> getIds() { return this._ids; }
  public PinnedQuery setIds(List<Id> val) { this._ids = val; return this; }

  static final ParseField ORGANIC = new ParseField("organic");
  private QueryContainer _organic;
  public QueryContainer getOrganic() { return this._organic; }
  public PinnedQuery setOrganic(QueryContainer val) { this._organic = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_ids != null) {
      builder.array(IDS.getPreferredName(), _ids);
    }
    if (_organic != null) {
      builder.field(ORGANIC.getPreferredName());
      _organic.toXContent(builder, params);
    }
  }

  @Override
  public PinnedQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PinnedQuery.PARSER.apply(parser, null);
  }

  public static final ObjectParser<PinnedQuery, Void> PARSER =
    new ObjectParser<>(PinnedQuery.class.getName(), false, PinnedQuery::new);

  static {
    PARSER.declareObjectArray(PinnedQuery::setIds, (p, t) -> Id.createFrom(p), IDS);
    PARSER.declareObject(PinnedQuery::setOrganic, (p, t) -> QueryContainer.PARSER.apply(p, t), ORGANIC);
  }

}
