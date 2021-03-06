
package org.elasticsearch.document.multiple.reindex_on_server;

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
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common.*;
import org.elasticsearch.document.multiple.reindex_on_server.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.common_abstractions.request.*;

public class ReindexOnServerRequest extends RequestBase<ReindexOnServerRequest> implements XContentable<ReindexOnServerRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public ReindexOnServerRequest setRefresh(Boolean val) { this._refresh = val; return this; }

  static final ParseField REQUESTS_PER_SECOND = new ParseField("requests_per_second");
  private long _requestsPerSecond;
  private boolean _requestsPerSecond$isSet;
  public long getRequestsPerSecond() { return this._requestsPerSecond; }
  public ReindexOnServerRequest setRequestsPerSecond(long val) {
    this._requestsPerSecond = val;
    _requestsPerSecond$isSet = true;
    return this;
  }

  static final ParseField SCROLL = new ParseField("scroll");
  private String _scroll;
  public String getScroll() { return this._scroll; }
  public ReindexOnServerRequest setScroll(String val) { this._scroll = val; return this; }

  static final ParseField SLICES = new ParseField("slices");
  private long _slices;
  private boolean _slices$isSet;
  public long getSlices() { return this._slices; }
  public ReindexOnServerRequest setSlices(long val) {
    this._slices = val;
    _slices$isSet = true;
    return this;
  }

  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public ReindexOnServerRequest setTimeout(String val) { this._timeout = val; return this; }

  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public ReindexOnServerRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

  static final ParseField WAIT_FOR_COMPLETION = new ParseField("wait_for_completion");
  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public ReindexOnServerRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }

  static final ParseField CONFLICTS = new ParseField("conflicts");
  private Conflicts _conflicts;
  public Conflicts getConflicts() { return this._conflicts; }
  public ReindexOnServerRequest setConflicts(Conflicts val) { this._conflicts = val; return this; }

  static final ParseField DEST = new ParseField("dest");
  private ReindexDestination _dest;
  public ReindexDestination getDest() { return this._dest; }
  public ReindexOnServerRequest setDest(ReindexDestination val) { this._dest = val; return this; }

  static final ParseField MAX_DOCS = new ParseField("max_docs");
  private long _maxDocs;
  private boolean _maxDocs$isSet;
  public long getMaxDocs() { return this._maxDocs; }
  public ReindexOnServerRequest setMaxDocs(long val) {
    this._maxDocs = val;
    _maxDocs$isSet = true;
    return this;
  }

  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public ReindexOnServerRequest setScript(Script val) { this._script = val; return this; }

  static final ParseField SIZE = new ParseField("size");
  private long _size;
  private boolean _size$isSet;
  public long getSize() { return this._size; }
  public ReindexOnServerRequest setSize(long val) {
    this._size = val;
    _size$isSet = true;
    return this;
  }

  static final ParseField SOURCE = new ParseField("source");
  private ReindexSource _source;
  public ReindexSource getSource() { return this._source; }
  public ReindexOnServerRequest setSource(ReindexSource val) { this._source = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_refresh != null) {
      builder.field(REFRESH.getPreferredName(), _refresh);
    }
    if (_requestsPerSecond$isSet) {
      builder.field(REQUESTS_PER_SECOND.getPreferredName(), _requestsPerSecond);
    }
    if (_scroll != null) {
      builder.field(SCROLL.getPreferredName(), _scroll);
    }
    if (_slices$isSet) {
      builder.field(SLICES.getPreferredName(), _slices);
    }
    if (_timeout != null) {
      builder.field(TIMEOUT.getPreferredName(), _timeout);
    }
    if (_waitForActiveShards != null) {
      builder.field(WAIT_FOR_ACTIVE_SHARDS.getPreferredName(), _waitForActiveShards);
    }
    if (_waitForCompletion != null) {
      builder.field(WAIT_FOR_COMPLETION.getPreferredName(), _waitForCompletion);
    }
    if (_conflicts != null) {
      builder.field(CONFLICTS.getPreferredName());
      _conflicts.toXContent(builder, params);
    }
    if (_dest != null) {
      builder.field(DEST.getPreferredName());
      _dest.toXContent(builder, params);
    }
    if (_maxDocs$isSet) {
      builder.field(MAX_DOCS.getPreferredName(), _maxDocs);
    }
    if (_script != null) {
      builder.field(SCRIPT.getPreferredName());
      _script.toXContent(builder, params);
    }
    if (_size$isSet) {
      builder.field(SIZE.getPreferredName(), _size);
    }
    if (_source != null) {
      builder.field(SOURCE.getPreferredName());
      _source.toXContent(builder, params);
    }
  }

  @Override
  public ReindexOnServerRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReindexOnServerRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ReindexOnServerRequest, Void> PARSER =
    new ObjectParser<>(ReindexOnServerRequest.class.getName(), false, ReindexOnServerRequest::new);

  static {
    PARSER.declareBoolean(ReindexOnServerRequest::setRefresh, REFRESH);
    PARSER.declareLong(ReindexOnServerRequest::setRequestsPerSecond, REQUESTS_PER_SECOND);
    PARSER.declareString(ReindexOnServerRequest::setScroll, SCROLL);
    PARSER.declareLong(ReindexOnServerRequest::setSlices, SLICES);
    PARSER.declareString(ReindexOnServerRequest::setTimeout, TIMEOUT);
    PARSER.declareString(ReindexOnServerRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
    PARSER.declareBoolean(ReindexOnServerRequest::setWaitForCompletion, WAIT_FOR_COMPLETION);
    PARSER.declareField(ReindexOnServerRequest::setConflicts, (p, t) -> Conflicts.PARSER.apply(p), CONFLICTS, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareObject(ReindexOnServerRequest::setDest, (p, t) -> ReindexDestination.PARSER.apply(p, t), DEST);
    PARSER.declareLong(ReindexOnServerRequest::setMaxDocs, MAX_DOCS);
    PARSER.declareObject(ReindexOnServerRequest::setScript, (p, t) -> Script.PARSER.apply(p, t), SCRIPT);
    PARSER.declareLong(ReindexOnServerRequest::setSize, SIZE);
    PARSER.declareObject(ReindexOnServerRequest::setSource, (p, t) -> ReindexSource.PARSER.apply(p, t), SOURCE);
  }

}
