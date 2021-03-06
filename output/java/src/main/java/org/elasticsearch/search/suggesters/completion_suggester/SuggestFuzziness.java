
package org.elasticsearch.search.suggesters.completion_suggester;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;

public class SuggestFuzziness  implements XContentable<SuggestFuzziness> {
  
  static final ParseField FUZZINESS = new ParseField("fuzziness");
  private Fuzziness _fuzziness;
  public Fuzziness getFuzziness() { return this._fuzziness; }
  public SuggestFuzziness setFuzziness(Fuzziness val) { this._fuzziness = val; return this; }

  static final ParseField MIN_LENGTH = new ParseField("min_length");
  private int _minLength;
  private boolean _minLength$isSet;
  public int getMinLength() { return this._minLength; }
  public SuggestFuzziness setMinLength(int val) {
    this._minLength = val;
    _minLength$isSet = true;
    return this;
  }

  static final ParseField PREFIX_LENGTH = new ParseField("prefix_length");
  private int _prefixLength;
  private boolean _prefixLength$isSet;
  public int getPrefixLength() { return this._prefixLength; }
  public SuggestFuzziness setPrefixLength(int val) {
    this._prefixLength = val;
    _prefixLength$isSet = true;
    return this;
  }

  static final ParseField TRANSPOSITIONS = new ParseField("transpositions");
  private Boolean _transpositions;
  public Boolean getTranspositions() { return this._transpositions; }
  public SuggestFuzziness setTranspositions(Boolean val) { this._transpositions = val; return this; }

  static final ParseField UNICODE_AWARE = new ParseField("unicode_aware");
  private Boolean _unicodeAware;
  public Boolean getUnicodeAware() { return this._unicodeAware; }
  public SuggestFuzziness setUnicodeAware(Boolean val) { this._unicodeAware = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    
    if (_fuzziness != null) {
      builder.field(FUZZINESS.getPreferredName());
      _fuzziness.toXContent(builder, params);
    }
    if (_minLength$isSet) {
      builder.field(MIN_LENGTH.getPreferredName(), _minLength);
    }
    if (_prefixLength$isSet) {
      builder.field(PREFIX_LENGTH.getPreferredName(), _prefixLength);
    }
    if (_transpositions != null) {
      builder.field(TRANSPOSITIONS.getPreferredName(), _transpositions);
    }
    if (_unicodeAware != null) {
      builder.field(UNICODE_AWARE.getPreferredName(), _unicodeAware);
    }
  }

  @Override
  public SuggestFuzziness fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SuggestFuzziness.PARSER.apply(parser, null);
  }

  public static final ObjectParser<SuggestFuzziness, Void> PARSER =
    new ObjectParser<>(SuggestFuzziness.class.getName(), false, SuggestFuzziness::new);

  static {
    PARSER.declareObject(SuggestFuzziness::setFuzziness, (p, t) -> Fuzziness.PARSER.apply(p, t), FUZZINESS);
    PARSER.declareInt(SuggestFuzziness::setMinLength, MIN_LENGTH);
    PARSER.declareInt(SuggestFuzziness::setPrefixLength, PREFIX_LENGTH);
    PARSER.declareBoolean(SuggestFuzziness::setTranspositions, TRANSPOSITIONS);
    PARSER.declareBoolean(SuggestFuzziness::setUnicodeAware, UNICODE_AWARE);
  }

}
