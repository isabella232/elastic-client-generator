
package org.elasticsearch.analysis.token_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.analysis.token_filters.*;

public class ElisionTokenFilter extends TokenFilterBase implements XContentable<ElisionTokenFilter> {
  
  static final ParseField ARTICLES = new ParseField("articles");
  private List<String> _articles;
  public List<String> getArticles() { return this._articles; }
  public ElisionTokenFilter setArticles(List<String> val) { this._articles = val; return this; }

  static final ParseField ARTICLES_CASE = new ParseField("articles_case");
  private Boolean _articlesCase;
  public Boolean getArticlesCase() { return this._articlesCase; }
  public ElisionTokenFilter setArticlesCase(Boolean val) { this._articlesCase = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_articles != null) {
      builder.array(ARTICLES.getPreferredName(), _articles);
    }
    if (_articlesCase != null) {
      builder.field(ARTICLES_CASE.getPreferredName(), _articlesCase);
    }
  }

  @Override
  public ElisionTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ElisionTokenFilter.PARSER.apply(parser, null);
  }

  public static final ObjectParser<ElisionTokenFilter, Void> PARSER =
    new ObjectParser<>(ElisionTokenFilter.class.getName(), false, ElisionTokenFilter::new);

  static {
    PARSER.declareStringArray(ElisionTokenFilter::setArticles, ARTICLES);
    PARSER.declareBoolean(ElisionTokenFilter::setArticlesCase, ARTICLES_CASE);
  }

}
