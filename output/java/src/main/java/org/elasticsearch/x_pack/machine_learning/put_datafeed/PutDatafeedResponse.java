
package org.elasticsearch.x_pack.machine_learning.put_datafeed;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.aggregations.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.common_abstractions.response.*;

public class PutDatafeedResponse extends ResponseBase<PutDatafeedResponse> implements XContentable<PutDatafeedResponse> {
  
  static final ParseField AGGREGATIONS = new ParseField("aggregations");
  private NamedContainer<String, AggregationContainer> _aggregations;
  public NamedContainer<String, AggregationContainer> getAggregations() { return this._aggregations; }
  public PutDatafeedResponse setAggregations(NamedContainer<String, AggregationContainer> val) { this._aggregations = val; return this; }

  static final ParseField CHUNKING_CONFIG = new ParseField("chunking_config");
  private ChunkingConfig _chunkingConfig;
  public ChunkingConfig getChunkingConfig() { return this._chunkingConfig; }
  public PutDatafeedResponse setChunkingConfig(ChunkingConfig val) { this._chunkingConfig = val; return this; }

  static final ParseField DATAFEED_ID = new ParseField("datafeed_id");
  private String _datafeedId;
  public String getDatafeedId() { return this._datafeedId; }
  public PutDatafeedResponse setDatafeedId(String val) { this._datafeedId = val; return this; }

  static final ParseField FREQUENCY = new ParseField("frequency");
  private String _frequency;
  public String getFrequency() { return this._frequency; }
  public PutDatafeedResponse setFrequency(String val) { this._frequency = val; return this; }

  static final ParseField INDICES = new ParseField("indices");
  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public PutDatafeedResponse setIndices(Indices val) { this._indices = val; return this; }

  static final ParseField JOB_ID = new ParseField("job_id");
  private String _jobId;
  public String getJobId() { return this._jobId; }
  public PutDatafeedResponse setJobId(String val) { this._jobId = val; return this; }

  static final ParseField MAX_EMPTY_SEARCHES = new ParseField("max_empty_searches");
  private int _maxEmptySearches;
  private boolean _maxEmptySearches$isSet;
  public int getMaxEmptySearches() { return this._maxEmptySearches; }
  public PutDatafeedResponse setMaxEmptySearches(int val) {
    this._maxEmptySearches = val;
    _maxEmptySearches$isSet = true;
    return this;
  }

  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public PutDatafeedResponse setQuery(QueryContainer val) { this._query = val; return this; }

  static final ParseField QUERY_DELAY = new ParseField("query_delay");
  private String _queryDelay;
  public String getQueryDelay() { return this._queryDelay; }
  public PutDatafeedResponse setQueryDelay(String val) { this._queryDelay = val; return this; }

  static final ParseField SCRIPT_FIELDS = new ParseField("script_fields");
  private NamedContainer<String, ScriptField> _scriptFields;
  public NamedContainer<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public PutDatafeedResponse setScriptFields(NamedContainer<String, ScriptField> val) { this._scriptFields = val; return this; }

  static final ParseField SCROLL_SIZE = new ParseField("scroll_size");
  private int _scrollSize;
  private boolean _scrollSize$isSet;
  public int getScrollSize() { return this._scrollSize; }
  public PutDatafeedResponse setScrollSize(int val) {
    this._scrollSize = val;
    _scrollSize$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_aggregations != null) {
      builder.field(AGGREGATIONS.getPreferredName());
      _aggregations.toXContent(builder, params);
    }
    if (_chunkingConfig != null) {
      builder.field(CHUNKING_CONFIG.getPreferredName());
      _chunkingConfig.toXContent(builder, params);
    }
    if (_datafeedId != null) {
      builder.field(DATAFEED_ID.getPreferredName(), _datafeedId);
    }
    if (_frequency != null) {
      builder.field(FREQUENCY.getPreferredName(), _frequency);
    }
    if (_indices != null) {
      builder.field(INDICES.getPreferredName());
      _indices.toXContent(builder, params);
    }
    if (_jobId != null) {
      builder.field(JOB_ID.getPreferredName(), _jobId);
    }
    if (_maxEmptySearches$isSet) {
      builder.field(MAX_EMPTY_SEARCHES.getPreferredName(), _maxEmptySearches);
    }
    if (_query != null) {
      builder.field(QUERY.getPreferredName());
      _query.toXContent(builder, params);
    }
    if (_queryDelay != null) {
      builder.field(QUERY_DELAY.getPreferredName(), _queryDelay);
    }
    if (_scriptFields != null) {
      builder.field(SCRIPT_FIELDS.getPreferredName());
      _scriptFields.toXContent(builder, params);
    }
    if (_scrollSize$isSet) {
      builder.field(SCROLL_SIZE.getPreferredName(), _scrollSize);
    }
  }

  @Override
  public PutDatafeedResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutDatafeedResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<PutDatafeedResponse, Void> PARSER =
    new ObjectParser<>(PutDatafeedResponse.class.getName(), false, PutDatafeedResponse::new);

  static {
    PARSER.declareObject(PutDatafeedResponse::setAggregations, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> AggregationContainer.PARSER.apply(pp, null)), AGGREGATIONS);
    PARSER.declareObject(PutDatafeedResponse::setChunkingConfig, (p, t) -> ChunkingConfig.PARSER.apply(p, t), CHUNKING_CONFIG);
    PARSER.declareString(PutDatafeedResponse::setDatafeedId, DATAFEED_ID);
    PARSER.declareString(PutDatafeedResponse::setFrequency, FREQUENCY);
    PARSER.declareObject(PutDatafeedResponse::setIndices, (p, t) -> Indices.createFrom(p), INDICES);
    PARSER.declareString(PutDatafeedResponse::setJobId, JOB_ID);
    PARSER.declareInt(PutDatafeedResponse::setMaxEmptySearches, MAX_EMPTY_SEARCHES);
    PARSER.declareObject(PutDatafeedResponse::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, t), QUERY);
    PARSER.declareString(PutDatafeedResponse::setQueryDelay, QUERY_DELAY);
    PARSER.declareObject(PutDatafeedResponse::setScriptFields, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> ScriptField.PARSER.apply(pp, null)), SCRIPT_FIELDS);
    PARSER.declareInt(PutDatafeedResponse::setScrollSize, SCROLL_SIZE);
  }

}
