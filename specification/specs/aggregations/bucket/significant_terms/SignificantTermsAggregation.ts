class SignificantTermsAggregation {
  background_filter: QueryContainer;
  chi_square: ChiSquareHeuristic;
  exclude: string | string[];
  execution_hint: TermsAggregationExecutionHint;
  field: Field;
  gnd: GoogleNormalizedDistanceHeuristic;
  include: string | string[];
  min_doc_count: long;
  mutual_information: MutualInformationHeuristic;
  percentage: PercentageScoreHeuristic;
  script_heuristic: ScriptedHeuristic;
  shard_min_doc_count: long;
  shard_size: integer;
  size: integer;
}
