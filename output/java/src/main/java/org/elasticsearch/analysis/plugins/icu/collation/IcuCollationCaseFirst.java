
package org.elasticsearch.analysis.plugins.icu.collation;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum IcuCollationCaseFirst implements XContentable<IcuCollationCaseFirst> {
  Lower("lower"),
    Upper("upper");
  private final String textRepresentation;

  private IcuCollationCaseFirst(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public IcuCollationCaseFirst fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, IcuCollationCaseFirst, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "lower": return IcuCollationCaseFirst.Lower;
      case "upper": return IcuCollationCaseFirst.Upper;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, IcuCollationCaseFirst.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
