
package org.elasticsearch.document.single.index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.document.single.*;
import org.elasticsearch.common_abstractions.response.*;

public class IndexResponse extends WriteResponseBase implements XContentable<IndexResponse> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    
  }

  @Override
  public IndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IndexResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<IndexResponse, Void> PARSER =
    new ObjectParser<>(IndexResponse.class.getName(), false, IndexResponse::new);

  static {
    
  }

}
