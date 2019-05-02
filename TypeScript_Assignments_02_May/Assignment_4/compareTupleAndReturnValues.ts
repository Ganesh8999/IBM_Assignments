var cityTuple = {
	"1": "Banglore",
	"2": "Delhi",
	"3": "Pune",
	"4": "Mumbai",
}

function findValueInTuple(val: string): string	{
	for(var i in cityTuple)	{
		if(i == val)	{
			return `${i}: ${cityTuple[i]}`;
		}
	}
	return "Nothing is found!";
}

console.log(findValueInTuple("1"));
console.log(findValueInTuple("5"));
