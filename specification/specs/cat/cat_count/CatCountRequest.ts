@rest_spec_name("cat.count")
class CatCountRequest extends RequestBase {
  query_parameters: {
    format: string;
    headers: string[];
    help: boolean;
    local: boolean;
    master_timeout: Time;
    sort_by_columns: string[];
    verbose: boolean;
  }
  body: {
  }
}
