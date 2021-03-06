
package org.elasticsearch.mapping.types;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.mapping.types.*;

public class DocValuesPropertyBase extends CorePropertyBase implements XContentable<DocValuesPropertyBase> {
  
  static final ParseField DOC_VALUES = new ParseField("doc_values");
  private Boolean _docValues;
  public Boolean getDocValues() { return this._docValues; }
  public DocValuesPropertyBase setDocValues(Boolean val) { this._docValues = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_docValues != null) {
      builder.field(DOC_VALUES.getPreferredName(), _docValues);
    }
  }

  @Override
  public DocValuesPropertyBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DocValuesPropertyBase.PARSER.apply(parser, null);
  }

  public static final ObjectParser<DocValuesPropertyBase, Void> PARSER =
    new ObjectParser<>(DocValuesPropertyBase.class.getName(), false, DocValuesPropertyBase::new);

  static {
    PARSER.declareBoolean(DocValuesPropertyBase::setDocValues, DOC_VALUES);
  }

}
