using System;
using System.Collections.Generic;
using System.Runtime.Serialization;
namespace Nest.XPack {

	public class RealmInfo  {
		
		[DataMember(Name="name")]
		public string Name { get; set; }


		[DataMember(Name="type")]
		public string Type { get; set; }

	}
}
