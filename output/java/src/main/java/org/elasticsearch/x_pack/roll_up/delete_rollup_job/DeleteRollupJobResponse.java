
package org.elasticsearch.x_pack.roll_up.delete_rollup_job;

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

public class DeleteRollupJobResponse extends AcknowledgedResponseBase implements XContentable<DeleteRollupJobResponse> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    
  }

  @Override
  public DeleteRollupJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteRollupJobResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<DeleteRollupJobResponse, Void> PARSER =
    new ObjectParser<>(DeleteRollupJobResponse.class.getName(), false, DeleteRollupJobResponse::new);

  static {
    
  }

}
