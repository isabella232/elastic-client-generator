
package org.elasticsearch.aggregations.bucket.global;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class GlobalAggregation  implements XContentable<GlobalAggregation> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    
  }

  @Override
  public GlobalAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GlobalAggregation.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GlobalAggregation, Void> PARSER =
    new ObjectParser<>(GlobalAggregation.class.getName(), false, GlobalAggregation::new);

  static {
    
  }

}
