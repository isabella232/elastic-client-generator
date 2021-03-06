
package org.elasticsearch.indices.index_settings.index_templates.put_index_template;

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
import org.elasticsearch.internal.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.common_abstractions.request.*;

public class PutIndexTemplateRequest extends RequestBase<PutIndexTemplateRequest> implements XContentable<PutIndexTemplateRequest> {
  
  static final ParseField CREATE = new ParseField("create");
  private Boolean _create;
  public Boolean getCreate() { return this._create; }
  public PutIndexTemplateRequest setCreate(Boolean val) { this._create = val; return this; }

  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public PutIndexTemplateRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }

  static final ParseField INCLUDE_TYPE_NAME = new ParseField("include_type_name");
  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public PutIndexTemplateRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }

  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private String _masterTimeout;
  public String getMasterTimeout() { return this._masterTimeout; }
  public PutIndexTemplateRequest setMasterTimeout(String val) { this._masterTimeout = val; return this; }

  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public PutIndexTemplateRequest setTimeout(String val) { this._timeout = val; return this; }

  static final ParseField ALIASES = new ParseField("aliases");
  private NamedContainer<String, Alias> _aliases;
  public NamedContainer<String, Alias> getAliases() { return this._aliases; }
  public PutIndexTemplateRequest setAliases(NamedContainer<String, Alias> val) { this._aliases = val; return this; }

  static final ParseField INDEX_PATTERNS = new ParseField("index_patterns");
  private List<String> _indexPatterns;
  public List<String> getIndexPatterns() { return this._indexPatterns; }
  public PutIndexTemplateRequest setIndexPatterns(List<String> val) { this._indexPatterns = val; return this; }

  static final ParseField MAPPINGS = new ParseField("mappings");
  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public PutIndexTemplateRequest setMappings(TypeMapping val) { this._mappings = val; return this; }

  static final ParseField ORDER = new ParseField("order");
  private int _order;
  private boolean _order$isSet;
  public int getOrder() { return this._order; }
  public PutIndexTemplateRequest setOrder(int val) {
    this._order = val;
    _order$isSet = true;
    return this;
  }

  static final ParseField SETTINGS = new ParseField("settings");
  private NamedContainer<String, Object> _settings;
  public NamedContainer<String, Object> getSettings() { return this._settings; }
  public PutIndexTemplateRequest setSettings(NamedContainer<String, Object> val) { this._settings = val; return this; }

  static final ParseField VERSION = new ParseField("version");
  private int _version;
  private boolean _version$isSet;
  public int getVersion() { return this._version; }
  public PutIndexTemplateRequest setVersion(int val) {
    this._version = val;
    _version$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_create != null) {
      builder.field(CREATE.getPreferredName(), _create);
    }
    if (_flatSettings != null) {
      builder.field(FLAT_SETTINGS.getPreferredName(), _flatSettings);
    }
    if (_includeTypeName != null) {
      builder.field(INCLUDE_TYPE_NAME.getPreferredName(), _includeTypeName);
    }
    if (_masterTimeout != null) {
      builder.field(MASTER_TIMEOUT.getPreferredName(), _masterTimeout);
    }
    if (_timeout != null) {
      builder.field(TIMEOUT.getPreferredName(), _timeout);
    }
    if (_aliases != null) {
      builder.field(ALIASES.getPreferredName());
      _aliases.toXContent(builder, params);
    }
    if (_indexPatterns != null) {
      builder.array(INDEX_PATTERNS.getPreferredName(), _indexPatterns);
    }
    if (_mappings != null) {
      builder.field(MAPPINGS.getPreferredName());
      _mappings.toXContent(builder, params);
    }
    if (_order$isSet) {
      builder.field(ORDER.getPreferredName(), _order);
    }
    if (_settings != null) {
      builder.field(SETTINGS.getPreferredName());
      _settings.toXContent(builder, params);
    }
    if (_version$isSet) {
      builder.field(VERSION.getPreferredName(), _version);
    }
  }

  @Override
  public PutIndexTemplateRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutIndexTemplateRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<PutIndexTemplateRequest, Void> PARSER =
    new ObjectParser<>(PutIndexTemplateRequest.class.getName(), false, PutIndexTemplateRequest::new);

  static {
    PARSER.declareBoolean(PutIndexTemplateRequest::setCreate, CREATE);
    PARSER.declareBoolean(PutIndexTemplateRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareBoolean(PutIndexTemplateRequest::setIncludeTypeName, INCLUDE_TYPE_NAME);
    PARSER.declareString(PutIndexTemplateRequest::setMasterTimeout, MASTER_TIMEOUT);
    PARSER.declareString(PutIndexTemplateRequest::setTimeout, TIMEOUT);
    PARSER.declareObject(PutIndexTemplateRequest::setAliases, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> Alias.PARSER.apply(pp, null)), ALIASES);
    PARSER.declareStringArray(PutIndexTemplateRequest::setIndexPatterns, INDEX_PATTERNS);
    PARSER.declareObject(PutIndexTemplateRequest::setMappings, (p, t) -> TypeMapping.PARSER.apply(p, t), MAPPINGS);
    PARSER.declareInt(PutIndexTemplateRequest::setOrder, ORDER);
    PARSER.declareObject(PutIndexTemplateRequest::setSettings, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), SETTINGS);
    PARSER.declareInt(PutIndexTemplateRequest::setVersion, VERSION);
  }

}
