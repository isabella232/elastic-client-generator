
package org.elasticsearch.query_dsl;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum Operator implements XContentable<Operator> {
  And("and"),
    Or("or"),
    And("AND"),
    Or("OR");
  private final String textRepresentation;

  private Operator(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public Operator fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, Operator, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "and": return Operator.And;
      case "or": return Operator.Or;
      case "AND": return Operator.And;
      case "OR": return Operator.Or;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, Operator.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
