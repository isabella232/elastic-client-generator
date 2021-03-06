
package org.elasticsearch.x_pack.machine_learning.forecast_job;

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

public class ForecastJobResponse extends AcknowledgedResponseBase implements XContentable<ForecastJobResponse> {
  
  static final ParseField FORECAST_ID = new ParseField("forecast_id");
  private String _forecastId;
  public String getForecastId() { return this._forecastId; }
  public ForecastJobResponse setForecastId(String val) { this._forecastId = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_forecastId != null) {
      builder.field(FORECAST_ID.getPreferredName(), _forecastId);
    }
  }

  @Override
  public ForecastJobResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ForecastJobResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ForecastJobResponse, Void> PARSER =
    new ObjectParser<>(ForecastJobResponse.class.getName(), false, ForecastJobResponse::new);

  static {
    PARSER.declareString(ForecastJobResponse::setForecastId, FORECAST_ID);
  }

}
