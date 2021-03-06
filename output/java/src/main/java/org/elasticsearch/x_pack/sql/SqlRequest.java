
package org.elasticsearch.x_pack.sql;

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

public class SqlRequest  implements XContentable<SqlRequest> {
  
  static final ParseField FETCH_SIZE = new ParseField("fetch_size");
  private int _fetchSize;
  private boolean _fetchSize$isSet;
  public int getFetchSize() { return this._fetchSize; }
  public SqlRequest setFetchSize(int val) {
    this._fetchSize = val;
    _fetchSize$isSet = true;
    return this;
  }

  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public SqlRequest setFilter(QueryContainer val) { this._filter = val; return this; }

  static final ParseField QUERY = new ParseField("query");
  private String _query;
  public String getQuery() { return this._query; }
  public SqlRequest setQuery(String val) { this._query = val; return this; }

  static final ParseField TIME_ZONE = new ParseField("time_zone");
  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public SqlRequest setTimeZone(String val) { this._timeZone = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_fetchSize$isSet) {
      builder.field(FETCH_SIZE.getPreferredName(), _fetchSize);
    }
    if (_filter != null) {
      builder.field(FILTER.getPreferredName());
      _filter.toXContent(builder, params);
    }
    if (_query != null) {
      builder.field(QUERY.getPreferredName(), _query);
    }
    if (_timeZone != null) {
      builder.field(TIME_ZONE.getPreferredName(), _timeZone);
    }
  }

  @Override
  public SqlRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SqlRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<SqlRequest, Void> PARSER =
    new ObjectParser<>(SqlRequest.class.getName(), false, SqlRequest::new);

  static {
    PARSER.declareInt(SqlRequest::setFetchSize, FETCH_SIZE);
    PARSER.declareObject(SqlRequest::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, t), FILTER);
    PARSER.declareString(SqlRequest::setQuery, QUERY);
    PARSER.declareString(SqlRequest::setTimeZone, TIME_ZONE);
  }

}
