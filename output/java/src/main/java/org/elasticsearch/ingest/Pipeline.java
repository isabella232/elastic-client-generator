
package org.elasticsearch.ingest;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.ingest.*;

public class Pipeline  implements XContentable<Pipeline> {
  
  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public Pipeline setDescription(String val) { this._description = val; return this; }

  static final ParseField ON_FAILURE = new ParseField("on_failure");
  private List<ProcessorContainer> _onFailure;
  public List<ProcessorContainer> getOnFailure() { return this._onFailure; }
  public Pipeline setOnFailure(List<ProcessorContainer> val) { this._onFailure = val; return this; }

  static final ParseField PROCESSORS = new ParseField("processors");
  private List<ProcessorContainer> _processors;
  public List<ProcessorContainer> getProcessors() { return this._processors; }
  public Pipeline setProcessors(List<ProcessorContainer> val) { this._processors = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_description != null) {
      builder.field(DESCRIPTION.getPreferredName(), _description);
    }
    if (_onFailure != null) {
      builder.array(ON_FAILURE.getPreferredName(), _onFailure);
    }
    if (_processors != null) {
      builder.array(PROCESSORS.getPreferredName(), _processors);
    }
  }

  @Override
  public Pipeline fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Pipeline.PARSER.apply(parser, null);
  }

  public static final ObjectParser<Pipeline, Void> PARSER =
    new ObjectParser<>(Pipeline.class.getName(), false, Pipeline::new);

  static {
    PARSER.declareString(Pipeline::setDescription, DESCRIPTION);
    PARSER.declareObjectArray(Pipeline::setOnFailure, (p, t) -> ProcessorContainer.PARSER.apply(p, t), ON_FAILURE);
    PARSER.declareObjectArray(Pipeline::setProcessors, (p, t) -> ProcessorContainer.PARSER.apply(p, t), PROCESSORS);
  }

}
