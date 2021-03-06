
package org.elasticsearch.x_pack.ilm.stop;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.common_abstractions.response.*;

public class StopIlmResponse extends AcknowledgedResponseBase implements XContentable<StopIlmResponse> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    
  }

  @Override
  public StopIlmResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StopIlmResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<StopIlmResponse, Void> PARSER =
    new ObjectParser<>(StopIlmResponse.class.getName(), false, StopIlmResponse::new);

  static {
    
  }

}
