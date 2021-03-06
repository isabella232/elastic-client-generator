using Nest.CommonAbstractions;
using Nest.Internal;
using Nest.Document;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.Document {

	public class TermVectorsResponse : IResponse {
		
		[DataMember(Name="found")]
		public bool Found { get; set; }


		[DataMember(Name="_id")]
		public string Id { get; set; }


		[DataMember(Name="_index")]
		public string Index { get; set; }


		[DataMember(Name="term_vectors")]
		public IDictionary<Field, TermVector> TermVectors { get; set; }


		[DataMember(Name="took")]
		public long Took { get; set; }


		[DataMember(Name="_type")]
		public string Type { get; set; }


		[DataMember(Name="_version")]
		public long Version { get; set; }

	}
}
