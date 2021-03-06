
package org.elasticsearch.x_pack.ilm.get_status;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum LifecycleOperationMode implements XContentable<LifecycleOperationMode> {
  Running("RUNNING"),
    Stopping("STOPPING"),
    Stopped("STOPPED");
  private final String textRepresentation;

  private LifecycleOperationMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public LifecycleOperationMode fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, LifecycleOperationMode, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "RUNNING": return LifecycleOperationMode.Running;
      case "STOPPING": return LifecycleOperationMode.Stopping;
      case "STOPPED": return LifecycleOperationMode.Stopped;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, LifecycleOperationMode.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
