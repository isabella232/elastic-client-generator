using Nest.XPack;
using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.XPack {

	public class CcrFollowStats  {
		
		[DataMember(Name="indices")]
		public List<FollowIndexStats> Indices { get; set; }

	}
}
