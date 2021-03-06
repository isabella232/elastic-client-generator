
package org.elasticsearch.x_pack.machine_learning.datafeed;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum ChunkingMode implements XContentable<ChunkingMode> {
  Auto("auto"),
    Manual("manual"),
    Off("off");
  private final String textRepresentation;

  private ChunkingMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public ChunkingMode fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, ChunkingMode, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "auto": return ChunkingMode.Auto;
      case "manual": return ChunkingMode.Manual;
      case "off": return ChunkingMode.Off;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, ChunkingMode.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
