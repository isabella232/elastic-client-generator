
package org.elasticsearch.indices.index_management.get_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.request.*;

public class GetIndexRequest extends RequestBase<GetIndexRequest> implements XContentable<GetIndexRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public GetIndexRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }

  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public GetIndexRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }

  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public GetIndexRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }

  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetIndexRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }

  static final ParseField INCLUDE_DEFAULTS = new ParseField("include_defaults");
  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public GetIndexRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }

  static final ParseField INCLUDE_TYPE_NAME = new ParseField("include_type_name");
  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public GetIndexRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }

  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetIndexRequest setLocal(Boolean val) { this._local = val; return this; }

  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private String _masterTimeout;
  public String getMasterTimeout() { return this._masterTimeout; }
  public GetIndexRequest setMasterTimeout(String val) { this._masterTimeout = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_allowNoIndices != null) {
      builder.field(ALLOW_NO_INDICES.getPreferredName(), _allowNoIndices);
    }
    if (_expandWildcards != null) {
      builder.field(EXPAND_WILDCARDS.getPreferredName());
      _expandWildcards.toXContent(builder, params);
    }
    if (_flatSettings != null) {
      builder.field(FLAT_SETTINGS.getPreferredName(), _flatSettings);
    }
    if (_ignoreUnavailable != null) {
      builder.field(IGNORE_UNAVAILABLE.getPreferredName(), _ignoreUnavailable);
    }
    if (_includeDefaults != null) {
      builder.field(INCLUDE_DEFAULTS.getPreferredName(), _includeDefaults);
    }
    if (_includeTypeName != null) {
      builder.field(INCLUDE_TYPE_NAME.getPreferredName(), _includeTypeName);
    }
    if (_local != null) {
      builder.field(LOCAL.getPreferredName(), _local);
    }
    if (_masterTimeout != null) {
      builder.field(MASTER_TIMEOUT.getPreferredName(), _masterTimeout);
    }
  }

  @Override
  public GetIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetIndexRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GetIndexRequest, Void> PARSER =
    new ObjectParser<>(GetIndexRequest.class.getName(), false, GetIndexRequest::new);

  static {
    PARSER.declareBoolean(GetIndexRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareField(GetIndexRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareBoolean(GetIndexRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareBoolean(GetIndexRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(GetIndexRequest::setIncludeDefaults, INCLUDE_DEFAULTS);
    PARSER.declareBoolean(GetIndexRequest::setIncludeTypeName, INCLUDE_TYPE_NAME);
    PARSER.declareBoolean(GetIndexRequest::setLocal, LOCAL);
    PARSER.declareString(GetIndexRequest::setMasterTimeout, MASTER_TIMEOUT);
  }

}
