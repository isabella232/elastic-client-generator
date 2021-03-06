
package org.elasticsearch.cat.cat_plugins;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.request.*;

public class CatPluginsRequest extends RequestBase<CatPluginsRequest> implements XContentable<CatPluginsRequest> {
  
  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatPluginsRequest setFormat(String val) { this._format = val; return this; }

  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatPluginsRequest setHeaders(List<String> val) { this._headers = val; return this; }

  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatPluginsRequest setHelp(Boolean val) { this._help = val; return this; }

  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatPluginsRequest setLocal(Boolean val) { this._local = val; return this; }

  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private String _masterTimeout;
  public String getMasterTimeout() { return this._masterTimeout; }
  public CatPluginsRequest setMasterTimeout(String val) { this._masterTimeout = val; return this; }

  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatPluginsRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }

  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatPluginsRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_format != null) {
      builder.field(FORMAT.getPreferredName(), _format);
    }
    if (_headers != null) {
      builder.array(HEADERS.getPreferredName(), _headers);
    }
    if (_help != null) {
      builder.field(HELP.getPreferredName(), _help);
    }
    if (_local != null) {
      builder.field(LOCAL.getPreferredName(), _local);
    }
    if (_masterTimeout != null) {
      builder.field(MASTER_TIMEOUT.getPreferredName(), _masterTimeout);
    }
    if (_sortByColumns != null) {
      builder.array(SORT_BY_COLUMNS.getPreferredName(), _sortByColumns);
    }
    if (_verbose != null) {
      builder.field(VERBOSE.getPreferredName(), _verbose);
    }
  }

  @Override
  public CatPluginsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatPluginsRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<CatPluginsRequest, Void> PARSER =
    new ObjectParser<>(CatPluginsRequest.class.getName(), false, CatPluginsRequest::new);

  static {
    PARSER.declareString(CatPluginsRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatPluginsRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatPluginsRequest::setHelp, HELP);
    PARSER.declareBoolean(CatPluginsRequest::setLocal, LOCAL);
    PARSER.declareString(CatPluginsRequest::setMasterTimeout, MASTER_TIMEOUT);
    PARSER.declareStringArray(CatPluginsRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatPluginsRequest::setVerbose, VERBOSE);
  }

}
