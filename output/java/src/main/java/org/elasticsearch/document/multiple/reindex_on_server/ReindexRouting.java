
package org.elasticsearch.document.multiple.reindex_on_server;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class ReindexRouting  implements XContentable<ReindexRouting> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    
  }

  @Override
  public ReindexRouting fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReindexRouting.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ReindexRouting, Void> PARSER =
    new ObjectParser<>(ReindexRouting.class.getName(), false, ReindexRouting::new);

  static {
    
  }

}
