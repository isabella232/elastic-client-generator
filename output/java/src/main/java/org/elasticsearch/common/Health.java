
package org.elasticsearch.common;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum Health implements XContentable<Health> {
  Green("green"),
    Yellow("yellow"),
    Red("red");
  private final String textRepresentation;

  private Health(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public Health fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, Health, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "green": return Health.Green;
      case "yellow": return Health.Yellow;
      case "red": return Health.Red;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, Health.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
