
package org.elasticsearch.indices.index_settings.update_index_settings;

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

public class UpdateIndexSettingsRequest extends RequestBase<UpdateIndexSettingsRequest> implements XContentable<UpdateIndexSettingsRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public UpdateIndexSettingsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }

  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public UpdateIndexSettingsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }

  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public UpdateIndexSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }

  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public UpdateIndexSettingsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }

  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private String _masterTimeout;
  public String getMasterTimeout() { return this._masterTimeout; }
  public UpdateIndexSettingsRequest setMasterTimeout(String val) { this._masterTimeout = val; return this; }

  static final ParseField PRESERVE_EXISTING = new ParseField("preserve_existing");
  private Boolean _preserveExisting;
  public Boolean getPreserveExisting() { return this._preserveExisting; }
  public UpdateIndexSettingsRequest setPreserveExisting(Boolean val) { this._preserveExisting = val; return this; }

  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public UpdateIndexSettingsRequest setTimeout(String val) { this._timeout = val; return this; }

  static final ParseField INDEX_SETTINGS = new ParseField("index_settings");
  private NamedContainer<String, Object> _indexSettings;
  public NamedContainer<String, Object> getIndexSettings() { return this._indexSettings; }
  public UpdateIndexSettingsRequest setIndexSettings(NamedContainer<String, Object> val) { this._indexSettings = val; return this; }


  
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
    if (_masterTimeout != null) {
      builder.field(MASTER_TIMEOUT.getPreferredName(), _masterTimeout);
    }
    if (_preserveExisting != null) {
      builder.field(PRESERVE_EXISTING.getPreferredName(), _preserveExisting);
    }
    if (_timeout != null) {
      builder.field(TIMEOUT.getPreferredName(), _timeout);
    }
    if (_indexSettings != null) {
      builder.field(INDEX_SETTINGS.getPreferredName());
      _indexSettings.toXContent(builder, params);
    }
  }

  @Override
  public UpdateIndexSettingsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UpdateIndexSettingsRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<UpdateIndexSettingsRequest, Void> PARSER =
    new ObjectParser<>(UpdateIndexSettingsRequest.class.getName(), false, UpdateIndexSettingsRequest::new);

  static {
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareField(UpdateIndexSettingsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareString(UpdateIndexSettingsRequest::setMasterTimeout, MASTER_TIMEOUT);
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setPreserveExisting, PRESERVE_EXISTING);
    PARSER.declareString(UpdateIndexSettingsRequest::setTimeout, TIMEOUT);
    PARSER.declareObject(UpdateIndexSettingsRequest::setIndexSettings, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), INDEX_SETTINGS);
  }

}
