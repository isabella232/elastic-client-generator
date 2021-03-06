
package org.elasticsearch.x_pack.watcher.input;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum HttpInputMethod implements XContentable<HttpInputMethod> {
  Head("head"),
    Get("get"),
    Post("post"),
    Put("put"),
    Delete("delete");
  private final String textRepresentation;

  private HttpInputMethod(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public HttpInputMethod fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, HttpInputMethod, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "head": return HttpInputMethod.Head;
      case "get": return HttpInputMethod.Get;
      case "post": return HttpInputMethod.Post;
      case "put": return HttpInputMethod.Put;
      case "delete": return HttpInputMethod.Delete;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, HttpInputMethod.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
