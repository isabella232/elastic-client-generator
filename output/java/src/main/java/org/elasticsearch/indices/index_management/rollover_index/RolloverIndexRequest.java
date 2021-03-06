
package org.elasticsearch.indices.index_management.rollover_index;

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
import org.elasticsearch.indices.index_management.rollover_index.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.common_abstractions.request.*;

public class RolloverIndexRequest extends RequestBase<RolloverIndexRequest> implements XContentable<RolloverIndexRequest> {
  
  static final ParseField DRY_RUN = new ParseField("dry_run");
  private Boolean _dryRun;
  public Boolean getDryRun() { return this._dryRun; }
  public RolloverIndexRequest setDryRun(Boolean val) { this._dryRun = val; return this; }

  static final ParseField INCLUDE_TYPE_NAME = new ParseField("include_type_name");
  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public RolloverIndexRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }

  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private String _masterTimeout;
  public String getMasterTimeout() { return this._masterTimeout; }
  public RolloverIndexRequest setMasterTimeout(String val) { this._masterTimeout = val; return this; }

  static final ParseField TIMEOUT = new ParseField("timeout");
  private String _timeout;
  public String getTimeout() { return this._timeout; }
  public RolloverIndexRequest setTimeout(String val) { this._timeout = val; return this; }

  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public RolloverIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }

  static final ParseField ALIASES = new ParseField("aliases");
  private NamedContainer<String, Alias> _aliases;
  public NamedContainer<String, Alias> getAliases() { return this._aliases; }
  public RolloverIndexRequest setAliases(NamedContainer<String, Alias> val) { this._aliases = val; return this; }

  static final ParseField CONDITIONS = new ParseField("conditions");
  private RolloverConditions _conditions;
  public RolloverConditions getConditions() { return this._conditions; }
  public RolloverIndexRequest setConditions(RolloverConditions val) { this._conditions = val; return this; }

  static final ParseField MAPPINGS = new ParseField("mappings");
  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public RolloverIndexRequest setMappings(TypeMapping val) { this._mappings = val; return this; }

  static final ParseField SETTINGS = new ParseField("settings");
  private NamedContainer<String, Object> _settings;
  public NamedContainer<String, Object> getSettings() { return this._settings; }
  public RolloverIndexRequest setSettings(NamedContainer<String, Object> val) { this._settings = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_dryRun != null) {
      builder.field(DRY_RUN.getPreferredName(), _dryRun);
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
    if (_waitForActiveShards != null) {
      builder.field(WAIT_FOR_ACTIVE_SHARDS.getPreferredName(), _waitForActiveShards);
    }
    if (_aliases != null) {
      builder.field(ALIASES.getPreferredName());
      _aliases.toXContent(builder, params);
    }
    if (_conditions != null) {
      builder.field(CONDITIONS.getPreferredName());
      _conditions.toXContent(builder, params);
    }
    if (_mappings != null) {
      builder.field(MAPPINGS.getPreferredName());
      _mappings.toXContent(builder, params);
    }
    if (_settings != null) {
      builder.field(SETTINGS.getPreferredName());
      _settings.toXContent(builder, params);
    }
  }

  @Override
  public RolloverIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RolloverIndexRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<RolloverIndexRequest, Void> PARSER =
    new ObjectParser<>(RolloverIndexRequest.class.getName(), false, RolloverIndexRequest::new);

  static {
    PARSER.declareBoolean(RolloverIndexRequest::setDryRun, DRY_RUN);
    PARSER.declareBoolean(RolloverIndexRequest::setIncludeTypeName, INCLUDE_TYPE_NAME);
    PARSER.declareString(RolloverIndexRequest::setMasterTimeout, MASTER_TIMEOUT);
    PARSER.declareString(RolloverIndexRequest::setTimeout, TIMEOUT);
    PARSER.declareString(RolloverIndexRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
    PARSER.declareObject(RolloverIndexRequest::setAliases, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> Alias.PARSER.apply(pp, null)), ALIASES);
    PARSER.declareObject(RolloverIndexRequest::setConditions, (p, t) -> RolloverConditions.PARSER.apply(p, t), CONDITIONS);
    PARSER.declareObject(RolloverIndexRequest::setMappings, (p, t) -> TypeMapping.PARSER.apply(p, t), MAPPINGS);
    PARSER.declareObject(RolloverIndexRequest::setSettings, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), SETTINGS);
  }

}
