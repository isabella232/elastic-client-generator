
package org.elasticsearch.cat.cat_segments;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.cat.cat_segments.*;
import org.elasticsearch.cat.*;
import org.elasticsearch.common_abstractions.response.*;

public class CatSegmentsResponse extends ResponseBase<CatSegmentsResponse> implements XContentable<CatSegmentsResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatSegmentsRecord> _records;
  public List<CatSegmentsRecord> getRecords() { return this._records; }
  public CatSegmentsResponse setRecords(List<CatSegmentsRecord> val) { this._records = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_records != null) {
      builder.array(RECORDS.getPreferredName(), _records);
    }
  }

  @Override
  public CatSegmentsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatSegmentsResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<CatSegmentsResponse, Void> PARSER =
    new ObjectParser<>(CatSegmentsResponse.class.getName(), false, CatSegmentsResponse::new);

  static {
    PARSER.declareObjectArray(CatSegmentsResponse::setRecords, (p, t) -> CatSegmentsRecord.PARSER.apply(p, t), RECORDS);
  }

}
