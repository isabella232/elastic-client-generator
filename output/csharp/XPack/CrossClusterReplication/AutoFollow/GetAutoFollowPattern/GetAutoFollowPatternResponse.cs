using Nest.XPack;
using Nest.CommonAbstractions;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.XPack {

	public class GetAutoFollowPatternResponse : IResponse {
		
		[DataMember(Name="patterns")]
		public IDictionary<string, AutoFollowPattern> Patterns { get; set; }

	}
}
