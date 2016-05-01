var FunLibrary = (function(){
	var whatType = function(obj)
	{
		var type = toString.call(obj);
		return toString.call(obj).substring(8, type.length-1);
	}
	return{
		isArray:function(obj)
		{
			return whatType(obj)==="Array";	
		},
		isBoolean:function(obj)
		{
			return whatType(obj)==="Boolean";
		},
		isDate:function(obj)
		{
			return whatType(obj)==="Date";
		},
		isFunction:function(obj)
		{
			return whatType(obj)==="Function";
		},
		isNumber:function(obj)
		{
			return whatType(obj) === "Number";
		},
		isString:function(obj)
		{
			return whatType(obj)==="String";
		},
		isUndefined:function(obj)
		{
			return whatType(obj)==="Undefined";
		},
		isNull:function(obj)
		{
			return whatType(obj)==="Null";
		},
		isNan:function(obj)
		{
			return isNaN(obj);
		}
	}
})();
var myFunction = function(){
	var obj=5;
};
var obj = null;
var p;
var date = new Date('2/29/2014');
console.log(FunLibrary.isArray([1,2,3]));
console.log(FunLibrary.isNumber(5));
console.log(FunLibrary.isBoolean(5>4));
console.log(FunLibrary.isDate(date));
console.log(FunLibrary.isFunction(myFunction));
console.log(FunLibrary.isNan("Not a number!"));
console.log(FunLibrary.isNull(obj));
console.log(FunLibrary.isString("Hello!"));
console.log(FunLibrary.isUndefined(p));








