
package org.elasticsearch.cat.cat_repositories;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.cat.*;

public class CatRepositoriesRecord extends ICatRecord implements XContentable<CatRepositoriesRecord> {
  
  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public CatRepositoriesRecord setId(String val) { this._id = val; return this; }

  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public CatRepositoriesRecord setType(String val) { this._type = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_id != null) {
      builder.field(ID.getPreferredName(), _id);
    }
    if (_type != null) {
      builder.field(TYPE.getPreferredName(), _type);
    }
  }

  @Override
  public CatRepositoriesRecord fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatRepositoriesRecord.PARSER.apply(parser, null);
  }

  public static final ObjectParser<CatRepositoriesRecord, Void> PARSER =
    new ObjectParser<>(CatRepositoriesRecord.class.getName(), false, CatRepositoriesRecord::new);

  static {
    PARSER.declareString(CatRepositoriesRecord::setId, ID);
    PARSER.declareString(CatRepositoriesRecord::setType, TYPE);
  }

}
