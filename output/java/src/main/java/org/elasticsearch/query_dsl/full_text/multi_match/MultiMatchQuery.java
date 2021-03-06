
package org.elasticsearch.query_dsl.full_text.multi_match;

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
import org.elasticsearch.common_options.minimum_should_match.*;
import org.elasticsearch.query_dsl.*;
import org.elasticsearch.query_dsl.full_text.multi_match.*;
import org.elasticsearch.query_dsl.abstractions.query.*;

public class MultiMatchQuery extends QueryBase implements XContentable<MultiMatchQuery> {
  
  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public MultiMatchQuery setAnalyzer(String val) { this._analyzer = val; return this; }

  static final ParseField AUTO_GENERATE_SYNONYMS_PHRASE_QUERY = new ParseField("auto_generate_synonyms_phrase_query");
  private Boolean _autoGenerateSynonymsPhraseQuery;
  public Boolean getAutoGenerateSynonymsPhraseQuery() { return this._autoGenerateSynonymsPhraseQuery; }
  public MultiMatchQuery setAutoGenerateSynonymsPhraseQuery(Boolean val) { this._autoGenerateSynonymsPhraseQuery = val; return this; }

  static final ParseField CUTOFF_FREQUENCY = new ParseField("cutoff_frequency");
  private double _cutoffFrequency;
  private boolean _cutoffFrequency$isSet;
  public double getCutoffFrequency() { return this._cutoffFrequency; }
  public MultiMatchQuery setCutoffFrequency(double val) {
    this._cutoffFrequency = val;
    _cutoffFrequency$isSet = true;
    return this;
  }

  static final ParseField FIELDS = new ParseField("fields");
  private List<String> _fields;
  public List<String> getFields() { return this._fields; }
  public MultiMatchQuery setFields(List<String> val) { this._fields = val; return this; }

  static final ParseField FUZZINESS = new ParseField("fuzziness");
  private Fuzziness _fuzziness;
  public Fuzziness getFuzziness() { return this._fuzziness; }
  public MultiMatchQuery setFuzziness(Fuzziness val) { this._fuzziness = val; return this; }

  static final ParseField FUZZY_REWRITE = new ParseField("fuzzy_rewrite");
  private String _fuzzyRewrite;
  public String getFuzzyRewrite() { return this._fuzzyRewrite; }
  public MultiMatchQuery setFuzzyRewrite(String val) { this._fuzzyRewrite = val; return this; }

  static final ParseField FUZZY_TRANSPOSITIONS = new ParseField("fuzzy_transpositions");
  private Boolean _fuzzyTranspositions;
  public Boolean getFuzzyTranspositions() { return this._fuzzyTranspositions; }
  public MultiMatchQuery setFuzzyTranspositions(Boolean val) { this._fuzzyTranspositions = val; return this; }

  static final ParseField LENIENT = new ParseField("lenient");
  private Boolean _lenient;
  public Boolean getLenient() { return this._lenient; }
  public MultiMatchQuery setLenient(Boolean val) { this._lenient = val; return this; }

  static final ParseField MAX_EXPANSIONS = new ParseField("max_expansions");
  private int _maxExpansions;
  private boolean _maxExpansions$isSet;
  public int getMaxExpansions() { return this._maxExpansions; }
  public MultiMatchQuery setMaxExpansions(int val) {
    this._maxExpansions = val;
    _maxExpansions$isSet = true;
    return this;
  }

  static final ParseField MINIMUM_SHOULD_MATCH = new ParseField("minimum_should_match");
  private MinimumShouldMatch _minimumShouldMatch;
  public MinimumShouldMatch getMinimumShouldMatch() { return this._minimumShouldMatch; }
  public MultiMatchQuery setMinimumShouldMatch(MinimumShouldMatch val) { this._minimumShouldMatch = val; return this; }

  static final ParseField OPERATOR = new ParseField("operator");
  private Operator _operator;
  public Operator getOperator() { return this._operator; }
  public MultiMatchQuery setOperator(Operator val) { this._operator = val; return this; }

  static final ParseField PREFIX_LENGTH = new ParseField("prefix_length");
  private int _prefixLength;
  private boolean _prefixLength$isSet;
  public int getPrefixLength() { return this._prefixLength; }
  public MultiMatchQuery setPrefixLength(int val) {
    this._prefixLength = val;
    _prefixLength$isSet = true;
    return this;
  }

  static final ParseField QUERY = new ParseField("query");
  private String _query;
  public String getQuery() { return this._query; }
  public MultiMatchQuery setQuery(String val) { this._query = val; return this; }

  static final ParseField SLOP = new ParseField("slop");
  private int _slop;
  private boolean _slop$isSet;
  public int getSlop() { return this._slop; }
  public MultiMatchQuery setSlop(int val) {
    this._slop = val;
    _slop$isSet = true;
    return this;
  }

  static final ParseField TIE_BREAKER = new ParseField("tie_breaker");
  private double _tieBreaker;
  private boolean _tieBreaker$isSet;
  public double getTieBreaker() { return this._tieBreaker; }
  public MultiMatchQuery setTieBreaker(double val) {
    this._tieBreaker = val;
    _tieBreaker$isSet = true;
    return this;
  }

  static final ParseField TYPE = new ParseField("type");
  private TextQueryType _type;
  public TextQueryType getType() { return this._type; }
  public MultiMatchQuery setType(TextQueryType val) { this._type = val; return this; }

  static final ParseField USE_DIS_MAX = new ParseField("use_dis_max");
  private Boolean _useDisMax;
  public Boolean getUseDisMax() { return this._useDisMax; }
  public MultiMatchQuery setUseDisMax(Boolean val) { this._useDisMax = val; return this; }

  static final ParseField ZERO_TERMS_QUERY = new ParseField("zero_terms_query");
  private ZeroTermsQuery _zeroTermsQuery;
  public ZeroTermsQuery getZeroTermsQuery() { return this._zeroTermsQuery; }
  public MultiMatchQuery setZeroTermsQuery(ZeroTermsQuery val) { this._zeroTermsQuery = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_analyzer != null) {
      builder.field(ANALYZER.getPreferredName(), _analyzer);
    }
    if (_autoGenerateSynonymsPhraseQuery != null) {
      builder.field(AUTO_GENERATE_SYNONYMS_PHRASE_QUERY.getPreferredName(), _autoGenerateSynonymsPhraseQuery);
    }
    if (_cutoffFrequency$isSet) {
      builder.field(CUTOFF_FREQUENCY.getPreferredName(), _cutoffFrequency);
    }
    if (_fields != null) {
      builder.array(FIELDS.getPreferredName(), _fields);
    }
    if (_fuzziness != null) {
      builder.field(FUZZINESS.getPreferredName());
      _fuzziness.toXContent(builder, params);
    }
    if (_fuzzyRewrite != null) {
      builder.field(FUZZY_REWRITE.getPreferredName(), _fuzzyRewrite);
    }
    if (_fuzzyTranspositions != null) {
      builder.field(FUZZY_TRANSPOSITIONS.getPreferredName(), _fuzzyTranspositions);
    }
    if (_lenient != null) {
      builder.field(LENIENT.getPreferredName(), _lenient);
    }
    if (_maxExpansions$isSet) {
      builder.field(MAX_EXPANSIONS.getPreferredName(), _maxExpansions);
    }
    if (_minimumShouldMatch != null) {
      builder.field(MINIMUM_SHOULD_MATCH.getPreferredName());
      _minimumShouldMatch.toXContent(builder, params);
    }
    if (_operator != null) {
      builder.field(OPERATOR.getPreferredName());
      _operator.toXContent(builder, params);
    }
    if (_prefixLength$isSet) {
      builder.field(PREFIX_LENGTH.getPreferredName(), _prefixLength);
    }
    if (_query != null) {
      builder.field(QUERY.getPreferredName(), _query);
    }
    if (_slop$isSet) {
      builder.field(SLOP.getPreferredName(), _slop);
    }
    if (_tieBreaker$isSet) {
      builder.field(TIE_BREAKER.getPreferredName(), _tieBreaker);
    }
    if (_type != null) {
      builder.field(TYPE.getPreferredName());
      _type.toXContent(builder, params);
    }
    if (_useDisMax != null) {
      builder.field(USE_DIS_MAX.getPreferredName(), _useDisMax);
    }
    if (_zeroTermsQuery != null) {
      builder.field(ZERO_TERMS_QUERY.getPreferredName());
      _zeroTermsQuery.toXContent(builder, params);
    }
  }

  @Override
  public MultiMatchQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MultiMatchQuery.PARSER.apply(parser, null);
  }

  public static final ObjectParser<MultiMatchQuery, Void> PARSER =
    new ObjectParser<>(MultiMatchQuery.class.getName(), false, MultiMatchQuery::new);

  static {
    PARSER.declareString(MultiMatchQuery::setAnalyzer, ANALYZER);
    PARSER.declareBoolean(MultiMatchQuery::setAutoGenerateSynonymsPhraseQuery, AUTO_GENERATE_SYNONYMS_PHRASE_QUERY);
    PARSER.declareDouble(MultiMatchQuery::setCutoffFrequency, CUTOFF_FREQUENCY);
    PARSER.declareStringArray(MultiMatchQuery::setFields, FIELDS);
    PARSER.declareObject(MultiMatchQuery::setFuzziness, (p, t) -> Fuzziness.PARSER.apply(p, t), FUZZINESS);
    PARSER.declareString(MultiMatchQuery::setFuzzyRewrite, FUZZY_REWRITE);
    PARSER.declareBoolean(MultiMatchQuery::setFuzzyTranspositions, FUZZY_TRANSPOSITIONS);
    PARSER.declareBoolean(MultiMatchQuery::setLenient, LENIENT);
    PARSER.declareInt(MultiMatchQuery::setMaxExpansions, MAX_EXPANSIONS);
    PARSER.declareObject(MultiMatchQuery::setMinimumShouldMatch, (p, t) -> MinimumShouldMatch.PARSER.apply(p, t), MINIMUM_SHOULD_MATCH);
    PARSER.declareField(MultiMatchQuery::setOperator, (p, t) -> Operator.PARSER.apply(p), OPERATOR, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareInt(MultiMatchQuery::setPrefixLength, PREFIX_LENGTH);
    PARSER.declareString(MultiMatchQuery::setQuery, QUERY);
    PARSER.declareInt(MultiMatchQuery::setSlop, SLOP);
    PARSER.declareDouble(MultiMatchQuery::setTieBreaker, TIE_BREAKER);
    PARSER.declareField(MultiMatchQuery::setType, (p, t) -> TextQueryType.PARSER.apply(p), TYPE, ObjectParser.ValueType.STRING_OR_NULL);
    PARSER.declareBoolean(MultiMatchQuery::setUseDisMax, USE_DIS_MAX);
    PARSER.declareField(MultiMatchQuery::setZeroTermsQuery, (p, t) -> ZeroTermsQuery.PARSER.apply(p), ZERO_TERMS_QUERY, ObjectParser.ValueType.STRING_OR_NULL);
  }

}
