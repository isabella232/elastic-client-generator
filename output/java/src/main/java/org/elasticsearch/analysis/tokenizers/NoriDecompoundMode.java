
package org.elasticsearch.analysis.tokenizers;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum NoriDecompoundMode implements XContentable<NoriDecompoundMode> {
  Discard("discard"),
    None("none"),
    Mixed("mixed");
  private final String textRepresentation;

  private NoriDecompoundMode(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public NoriDecompoundMode fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, NoriDecompoundMode, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "discard": return NoriDecompoundMode.Discard;
      case "none": return NoriDecompoundMode.None;
      case "mixed": return NoriDecompoundMode.Mixed;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, NoriDecompoundMode.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
