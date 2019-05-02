import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Enter decimal number : ",
	(answer)=>	{
        
        var num = parseInt(answer);
        var hexNumber = num.toString(16);

        console.log(hexNumber);
        

		runtimeVal.close();
	}
);