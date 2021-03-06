
package org.elasticsearch.x_pack.info.x_pack_usage;

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
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class MonitoringUsage extends XPackUsage implements XContentable<MonitoringUsage> {
  
  static final ParseField COLLECTION_ENABLED = new ParseField("collection_enabled");
  private Boolean _collectionEnabled;
  public Boolean getCollectionEnabled() { return this._collectionEnabled; }
  public MonitoringUsage setCollectionEnabled(Boolean val) { this._collectionEnabled = val; return this; }

  static final ParseField ENABLED_EXPORTERS = new ParseField("enabled_exporters");
  private NamedContainer<String, Long> _enabledExporters;
  public NamedContainer<String, Long> getEnabledExporters() { return this._enabledExporters; }
  public MonitoringUsage setEnabledExporters(NamedContainer<String, Long> val) { this._enabledExporters = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_collectionEnabled != null) {
      builder.field(COLLECTION_ENABLED.getPreferredName(), _collectionEnabled);
    }
    if (_enabledExporters != null) {
      builder.field(ENABLED_EXPORTERS.getPreferredName());
      _enabledExporters.toXContent(builder, params);
    }
  }

  @Override
  public MonitoringUsage fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MonitoringUsage.PARSER.apply(parser, null);
  }

  public static final ObjectParser<MonitoringUsage, Void> PARSER =
    new ObjectParser<>(MonitoringUsage.class.getName(), false, MonitoringUsage::new);

  static {
    PARSER.declareBoolean(MonitoringUsage::setCollectionEnabled, COLLECTION_ENABLED);
    PARSER.declareObject(MonitoringUsage::setEnabledExporters, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> long.PARSER.apply(pp, null)), ENABLED_EXPORTERS);
  }

}
