
package org.elasticsearch.x_pack.machine_learning.revert_model_snapshot;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.x_pack.machine_learning.job.process.*;
import org.elasticsearch.common_abstractions.response.*;

public class RevertModelSnapshotResponse extends ResponseBase<RevertModelSnapshotResponse> implements XContentable<RevertModelSnapshotResponse> {
  
  static final ParseField MODEL = new ParseField("model");
  private ModelSnapshot _model;
  public ModelSnapshot getModel() { return this._model; }
  public RevertModelSnapshotResponse setModel(ModelSnapshot val) { this._model = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_model != null) {
      builder.field(MODEL.getPreferredName());
      _model.toXContent(builder, params);
    }
  }

  @Override
  public RevertModelSnapshotResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RevertModelSnapshotResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<RevertModelSnapshotResponse, Void> PARSER =
    new ObjectParser<>(RevertModelSnapshotResponse.class.getName(), false, RevertModelSnapshotResponse::new);

  static {
    PARSER.declareObject(RevertModelSnapshotResponse::setModel, (p, t) -> ModelSnapshot.PARSER.apply(p, t), MODEL);
  }

}
