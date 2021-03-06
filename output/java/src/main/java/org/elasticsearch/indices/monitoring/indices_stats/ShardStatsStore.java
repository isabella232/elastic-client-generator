
package org.elasticsearch.indices.monitoring.indices_stats;

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

public class ShardStatsStore  implements XContentable<ShardStatsStore> {
  
  static final ParseField SIZE_IN_BYTES = new ParseField("size_in_bytes");
  private long _sizeInBytes;
  private boolean _sizeInBytes$isSet;
  public long getSizeInBytes() { return this._sizeInBytes; }
  public ShardStatsStore setSizeInBytes(long val) {
    this._sizeInBytes = val;
    _sizeInBytes$isSet = true;
    return this;
  }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_sizeInBytes$isSet) {
      builder.field(SIZE_IN_BYTES.getPreferredName(), _sizeInBytes);
    }
  }

  @Override
  public ShardStatsStore fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardStatsStore.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ShardStatsStore, Void> PARSER =
    new ObjectParser<>(ShardStatsStore.class.getName(), false, ShardStatsStore::new);

  static {
    PARSER.declareLong(ShardStatsStore::setSizeInBytes, SIZE_IN_BYTES);
  }

}
