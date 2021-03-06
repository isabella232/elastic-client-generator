
package org.elasticsearch.x_pack.machine_learning.get_model_snapshots;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.job.process.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetModelSnapshotsResponse extends ResponseBase<GetModelSnapshotsResponse> implements XContentable<GetModelSnapshotsResponse> {
  
  static final ParseField COUNT = new ParseField("count");
  private long _count;
  private boolean _count$isSet;
  public long getCount() { return this._count; }
  public GetModelSnapshotsResponse setCount(long val) {
    this._count = val;
    _count$isSet = true;
    return this;
  }

  static final ParseField MODEL_SNAPSHOTS = new ParseField("model_snapshots");
  private List<ModelSnapshot> _modelSnapshots;
  public List<ModelSnapshot> getModelSnapshots() { return this._modelSnapshots; }
  public GetModelSnapshotsResponse setModelSnapshots(List<ModelSnapshot> val) { this._modelSnapshots = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_count$isSet) {
      builder.field(COUNT.getPreferredName(), _count);
    }
    if (_modelSnapshots != null) {
      builder.array(MODEL_SNAPSHOTS.getPreferredName(), _modelSnapshots);
    }
  }

  @Override
  public GetModelSnapshotsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetModelSnapshotsResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<GetModelSnapshotsResponse, Void> PARSER =
    new ObjectParser<>(GetModelSnapshotsResponse.class.getName(), false, GetModelSnapshotsResponse::new);

  static {
    PARSER.declareLong(GetModelSnapshotsResponse::setCount, COUNT);
    PARSER.declareObjectArray(GetModelSnapshotsResponse::setModelSnapshots, (p, t) -> ModelSnapshot.PARSER.apply(p, t), MODEL_SNAPSHOTS);
  }

}
