var _: _.LoDashStatic = require('lodash');

module Domain {
  export class Type
  {
    constructor(public name: string) {}
    nullable: boolean;
  }
  export class Array
  {
    type = new Type("array");
    of: Type|Array|Map;
  }
  export class Map
  {
    type = new Type("map");
    key: Type|Array|Map;
    value: Type|Array|Map;
    array: boolean;
  }

  export class TypeDeclaration
  {
    constructor(public name: string) {}
  }

  export class Interface extends TypeDeclaration
  {
    public properties: InterfaceProperty[] = [];
  }

  export class InterfaceProperty
  {
    constructor(public name: string) {}
    typeString: string;
    type: Type|Array|Map;
  }

  export class Enum extends TypeDeclaration
  {
    constructor(public name: string, public flags : boolean = false) { super(name) }
    members: EnumMember[] = [];
  }

  export class EnumMember
  {
    constructor(public name: string) {}
  }

  export class Endpoint
  {
    name: string;
    documentation: string;
    bodyDocumentation: string;
    methods: string[];
    url: Route;

    constructor(file: string)
    {
      var json = require(file.replace(/\.\//, "./../"));
      this.name = _(json).keys().first();
      var data = json[this.name];
      this.documentation = data.documentation;
      this.methods = data.methods;
      this.bodyDocumentation  = data.body;
      if(!data.url) console.log(this.name);
      this.url = new Route(data.url);
    }
  }

  export class Route
  {
    path: string;
    paths: string[];
    parts: RoutePart[];

    constructor (data: any)
    {
      this.path = data.path;
      this.paths = data.paths;
      this.parts = _(data.parts).map((v, k)=>new RoutePart(v, k)).value();
    }
  }

  export class RoutePart
  {
    name: string;
    type: string;
    description: string;
    required: boolean;

    constructor (name: string, data: any)
    {
      this.name = name;
      this.type = data.type;
      this.description = data.description;
      this.required = !!data.required;
    }
  }

}
export = Domain;