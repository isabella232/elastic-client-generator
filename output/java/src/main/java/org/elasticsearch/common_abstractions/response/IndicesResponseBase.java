
package org.elasticsearch.common_abstractions.response;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_options.hit.*;
import org.elasticsearch.common_abstractions.response.*;

public class IndicesResponseBase extends AcknowledgedResponseBase implements XContentable<IndicesResponseBase> {
  
  static final ParseField SHARDS = new ParseField("_shards");
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public IndicesResponseBase setShards(ShardStatistics val) { this._shards = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_shards != null) {
      builder.field(SHARDS.getPreferredName());
      _shards.toXContent(builder, params);
    }
  }

  @Override
  public IndicesResponseBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IndicesResponseBase.PARSER.apply(parser, null);
  }

  public static final ObjectParser<IndicesResponseBase, Void> PARSER =
    new ObjectParser<>(IndicesResponseBase.class.getName(), false, IndicesResponseBase::new);

  static {
    PARSER.declareObject(IndicesResponseBase::setShards, (p, t) -> ShardStatistics.PARSER.apply(p, t), SHARDS);
  }

}
