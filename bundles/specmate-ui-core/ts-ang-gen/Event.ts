	import { EInt,EString,EBoolean } from '../support/gentypes';
	import { Proxy } from '../support/Proxy';
	import { SpecmateObject } from '../support/SpecmateObject';
	import { IObjectMetaData } from '../support/IObjectMetaData';
	import { DEFAULT_SOURCE } from '../support/ISourcedValue';

	export class Event  extends SpecmateObject {
		// Attributes
		private _id:EString;
		private _name:EString;
		private _description:EString;
		private _x:EInt;
		private _y:EInt;
		private _isRoot:EBoolean;
		private _operation:Operation;
		private _invert:EBoolean;

		// References
		public annotations:Proxy[];
		public predecessors:Proxy[];
		public successors:Proxy[];
		public causes:Proxy[];
		public effects:Proxy[];


		get id() : EString{
			return this._id;
		}

		set id(value : EString){
			this._id=value;
			this.appendToLog(DEFAULT_SOURCE);
		}
		get name() : EString{
			return this._name;
		}

		set name(value : EString){
			this._name=value;
			this.appendToLog(DEFAULT_SOURCE);
		}
		get description() : EString{
			return this._description;
		}

		set description(value : EString){
			this._description=value;
			this.appendToLog(DEFAULT_SOURCE);
		}
		get x() : EInt{
			return this._x;
		}

		set x(value : EInt){
			this._x=+value;
			this.appendToLog(DEFAULT_SOURCE);
		}
		get y() : EInt{
			return this._y;
		}

		set y(value : EInt){
			this._y=+value;
			this.appendToLog(DEFAULT_SOURCE);
		}
		get isRoot() : EBoolean{
			return this._isRoot;
		}

		set isRoot(value : EBoolean){
			this._isRoot=value;
			this.appendToLog(DEFAULT_SOURCE);
		}
		get operation() : Operation{
			return this._operation;
		}

		set operation(value : Operation){
			this._operation=value;
			this.appendToLog(DEFAULT_SOURCE);
		}
		get invert() : EBoolean{
			return this._invert;
		}

		set invert(value : EBoolean){
			this._invert=value;
			this.appendToLog(DEFAULT_SOURCE);
		}


		_get(feature: string): any {
			switch (feature) {
				case "id":
					return this.id;
				case "name":
					return this.name;
				case "description":
					return this.description;
				case "x":
					return this.x;
				case "y":
					return this.y;
				case "isRoot":
					return this.isRoot;
				case "operation":
					return this.operation;
				case "invert":
					return this.invert;
				case "annotations":
					return this.annotations;
				case "predecessors":
					return this.predecessors;
				case "successors":
					return this.successors;
				case "causes":
					return this.causes;
				case "effects":
					return this.effects;
				default: throw new Error("Feature not defined:"+feature);
			}
		}

		_set(feature: string, value: any, source?:string) {
			switch (feature) {
				case "id":
					this.id=<EString>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				case "name":
					this.name=<EString>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				case "description":
					this.description=<EString>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				case "x":
					this.x=<EInt>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				case "y":
					this.y=<EInt>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				case "isRoot":
					this.isRoot=<EBoolean>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				case "operation":
					this.operation=<Operation>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				case "invert":
					this.invert=<EBoolean>value;
					if(source){
						this.appendToLog(source);
					}
					break;
				default:
                    throw new Error("Feature not defined or not writable: " + feature);
			}
		}

		_getMetaData(): IObjectMetaData {
			return <IObjectMetaData>{
	            get className(): string {
	                return "Event";
	            },
	            get attributes(): string[] {
	                return ["id","name","description","x","y","isRoot","operation","invert"];
	            },
	            get nsUri(): string {
	                return "http://allianz.com/20151023_05/model/requirements";
	            },
	            get references(): string[] {
	                return ["predecessors","successors"];
	            }
            };
        }

		_getId():string {
			return this.id;
		}
	}

