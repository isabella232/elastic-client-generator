
package org.elasticsearch.aggregations.metric.average;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class AverageAggregation  implements XContentable<AverageAggregation> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    
  }

  @Override
  public AverageAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AverageAggregation.PARSER.apply(parser, null);
  }

  public static final ObjectParser<AverageAggregation, Void> PARSER =
    new ObjectParser<>(AverageAggregation.class.getName(), false, AverageAggregation::new);

  static {
    
  }

}
