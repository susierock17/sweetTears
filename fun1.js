var FunLibrary = (function(){
	var isType = function(obj,Type)
	{
		return (obj instanceof Type) + " " + "type";
	}
	return{
		isArray:function(obj)
		{
			return isType(obj,Array);	
		},
		isBoolean:function(obj)
		{
			return isType(obj,Boolean);
		},
		isDate:function(obj)
		{
			return isType(obj,Date);
		},
		isFunction:function(obj)
		{
			return isType(obj,Function);
		},
		isNumber:function(obj)
		{
			return isType(obj,Number);
		},
		isString:function(obj)
		{
			return isType(obj,String);
		},
		isUndefined:function(obj)
		{
			return obj===undefined;
		},
		isNull:function(obj)
		{
			return (obj===null);
		},
		isNan:function(obj)
		{
			return isNaN(obj);
		}
	}
})();
var number = new Number(2);
console.log(FunLibrary.isNumber(number));









