import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Enter marks of subjects PHY BIO MATH WITH SPACES : ",
	(answer)=>	{
		let splitter = answer.split(" ");
		let phy = parseInt(splitter[0]);
		let math = parseInt(splitter[1]);
		let bio = parseInt(splitter[2]);

		resultShow(phy, math, bio);
		runtimeVal.close();
	}
);

function resultShow(phy?: number, math?: number, bio?: number)	{
	
	let result: boolean = true;
	let total: number = phy + math + bio;
	if(total < 125)	{
		result = false;
	}
	if (phy < 40)	{
		result = false;
	}
	if (math < 40)	{
		result = false;
	}
	if (bio < 40)	{
		result = false;
	}

	//Test for result
	if(result == false)	{
		console.log("Result:- Fail");
	}
	else	{
		console.log("Result:-  Pass");
	}
}