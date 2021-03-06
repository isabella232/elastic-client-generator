
package org.elasticsearch.common_options.range;

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

public class AggregationRange  implements XContentable<AggregationRange> {
  
  static final ParseField FROM = new ParseField("from");
  private double _from;
  private boolean _from$isSet;
  public double getFrom() { return this._from; }
  public AggregationRange setFrom(double val) {
    this._from = val;
    _from$isSet = true;
    return this;
  }

  static final ParseField KEY = new ParseField("key");
  private String _key;
  public String getKey() { return this._key; }
  public AggregationRange setKey(String val) { this._key = val; return this; }

  static final ParseField TO = new ParseField("to");
  private double _to;
  private boolean _to$isSet;
  public double getTo() { return this._to; }
  public AggregationRange setTo(double val) {
    this._to = val;
    _to$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_from$isSet) {
      builder.field(FROM.getPreferredName(), _from);
    }
    if (_key != null) {
      builder.field(KEY.getPreferredName(), _key);
    }
    if (_to$isSet) {
      builder.field(TO.getPreferredName(), _to);
    }
  }

  @Override
  public AggregationRange fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AggregationRange.PARSER.apply(parser, null);
  }

  public static final ObjectParser<AggregationRange, Void> PARSER =
    new ObjectParser<>(AggregationRange.class.getName(), false, AggregationRange::new);

  static {
    PARSER.declareDouble(AggregationRange::setFrom, FROM);
    PARSER.declareString(AggregationRange::setKey, KEY);
    PARSER.declareDouble(AggregationRange::setTo, TO);
  }

}
