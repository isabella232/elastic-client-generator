
package org.elasticsearch.aggregations.pipeline.moving_average.models;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


public class MovingAverageModel  implements XContentable<MovingAverageModel> {
  
  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public MovingAverageModel setName(String val) { this._name = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_name != null) {
      builder.field(NAME.getPreferredName(), _name);
    }
  }

  @Override
  public MovingAverageModel fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MovingAverageModel.PARSER.apply(parser, null);
  }

  public static final ObjectParser<MovingAverageModel, Void> PARSER =
    new ObjectParser<>(MovingAverageModel.class.getName(), false, MovingAverageModel::new);

  static {
    PARSER.declareString(MovingAverageModel::setName, NAME);
  }

}
