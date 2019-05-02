import * as readline from 'readline';

let r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });


  r1.question("enter number ",(answer) => {

    var n = answer;

    var splitted = n.split('');

    var sum = 0;
    for (let index = 0; index < splitted.length; index++) {
        
     sum += + splitted[index];
        
    }
    console.log(sum);

    r1.close();
    


  });