
package org.elasticsearch.mapping.types.geo.geo_shape;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum GeoOrientation implements XContentable<GeoOrientation> {
  ClockWise("ClockWise"),
    CounterClockWise("CounterClockWise");
  private final String textRepresentation;

  private GeoOrientation(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public GeoOrientation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, GeoOrientation, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "ClockWise": return GeoOrientation.ClockWise;
      case "CounterClockWise": return GeoOrientation.CounterClockWise;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, GeoOrientation.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
