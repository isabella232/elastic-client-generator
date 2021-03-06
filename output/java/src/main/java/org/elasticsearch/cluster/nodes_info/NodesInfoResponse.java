
package org.elasticsearch.cluster.nodes_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.cluster.nodes_info.*;
import org.elasticsearch.cluster.*;
import org.elasticsearch.common_abstractions.response.*;

public class NodesInfoResponse extends NodesResponseBase implements XContentable<NodesInfoResponse> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public NodesInfoResponse setClusterName(String val) { this._clusterName = val; return this; }

  static final ParseField NODES = new ParseField("nodes");
  private NamedContainer<String, NodeInfo> _nodes;
  public NamedContainer<String, NodeInfo> getNodes() { return this._nodes; }
  public NodesInfoResponse setNodes(NamedContainer<String, NodeInfo> val) { this._nodes = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_clusterName != null) {
      builder.field(CLUSTER_NAME.getPreferredName(), _clusterName);
    }
    if (_nodes != null) {
      builder.field(NODES.getPreferredName());
      _nodes.toXContent(builder, params);
    }
  }

  @Override
  public NodesInfoResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodesInfoResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<NodesInfoResponse, Void> PARSER =
    new ObjectParser<>(NodesInfoResponse.class.getName(), false, NodesInfoResponse::new);

  static {
    PARSER.declareString(NodesInfoResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareObject(NodesInfoResponse::setNodes, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> NodeInfo.PARSER.apply(pp, null)), NODES);
  }

}
