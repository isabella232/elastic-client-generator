
package org.elasticsearch.cluster.nodes_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.internal.*;

public class FileSystemStats  implements XContentable<FileSystemStats> {
  
  static final ParseField DATA = new ParseField("data");
  private List<DataPathStats> _data;
  public List<DataPathStats> getData() { return this._data; }
  public FileSystemStats setData(List<DataPathStats> val) { this._data = val; return this; }

  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private long _timestamp;
  private boolean _timestamp$isSet;
  public long getTimestamp() { return this._timestamp; }
  public FileSystemStats setTimestamp(long val) {
    this._timestamp = val;
    _timestamp$isSet = true;
    return this;
  }

  static final ParseField TOTAL = new ParseField("total");
  private TotalFileSystemStats _total;
  public TotalFileSystemStats getTotal() { return this._total; }
  public FileSystemStats setTotal(TotalFileSystemStats val) { this._total = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_data != null) {
      builder.array(DATA.getPreferredName(), _data);
    }
    if (_timestamp$isSet) {
      builder.field(TIMESTAMP.getPreferredName(), _timestamp);
    }
    if (_total != null) {
      builder.field(TOTAL.getPreferredName());
      _total.toXContent(builder, params);
    }
  }

  @Override
  public FileSystemStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FileSystemStats.PARSER.apply(parser, null);
  }

  public static final ObjectParser<FileSystemStats, Void> PARSER =
    new ObjectParser<>(FileSystemStats.class.getName(), false, FileSystemStats::new);

  static {
    PARSER.declareObjectArray(FileSystemStats::setData, (p, t) -> DataPathStats.PARSER.apply(p, t), DATA);
    PARSER.declareLong(FileSystemStats::setTimestamp, TIMESTAMP);
    PARSER.declareObject(FileSystemStats::setTotal, (p, t) -> TotalFileSystemStats.PARSER.apply(p, t), TOTAL);
  }

}
