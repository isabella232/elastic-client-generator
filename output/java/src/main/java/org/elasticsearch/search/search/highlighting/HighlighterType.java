
package org.elasticsearch.search.search.highlighting;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum HighlighterType implements XContentable<HighlighterType> {
  Plain("plain"),
    Fvh("fvh"),
    Unified("unified");
  private final String textRepresentation;

  private HighlighterType(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public HighlighterType fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, HighlighterType, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "plain": return HighlighterType.Plain;
      case "fvh": return HighlighterType.Fvh;
      case "unified": return HighlighterType.Unified;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, HighlighterType.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
