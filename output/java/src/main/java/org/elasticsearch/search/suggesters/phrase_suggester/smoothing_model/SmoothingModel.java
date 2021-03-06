
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class SmoothingModel  implements XContentable<SmoothingModel> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    
  }

  @Override
  public SmoothingModel fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SmoothingModel.PARSER.apply(parser, null);
  }

  public static final ObjectParser<SmoothingModel, Void> PARSER =
    new ObjectParser<>(SmoothingModel.class.getName(), false, SmoothingModel::new);

  static {
    
  }

}
