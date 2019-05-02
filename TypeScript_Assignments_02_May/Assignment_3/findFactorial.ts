import * as readline from 'readline';

let r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  
  r1.question("enter number",(answer) => {
      var n = parseInt(answer);
      var fact = 1;
      for(var i =1;i <= n;i++){
          fact = fact *i;
      }
      console.log("factorial is "+ fact);
      r1.close();

  });

