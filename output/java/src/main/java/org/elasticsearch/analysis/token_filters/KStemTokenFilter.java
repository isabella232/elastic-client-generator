
package org.elasticsearch.analysis.token_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.analysis.token_filters.*;

public class KStemTokenFilter extends TokenFilterBase implements XContentable<KStemTokenFilter> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    
  }

  @Override
  public KStemTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KStemTokenFilter.PARSER.apply(parser, null);
  }

  public static final ObjectParser<KStemTokenFilter, Void> PARSER =
    new ObjectParser<>(KStemTokenFilter.class.getName(), false, KStemTokenFilter::new);

  static {
    
  }

}
