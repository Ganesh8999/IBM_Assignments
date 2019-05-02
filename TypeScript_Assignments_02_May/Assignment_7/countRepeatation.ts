import * as readline from 'readline';

let r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });


  r1.question("enter string ",(answer) => {
    
    let char = answer.split('');
    
    let count: number = 0;
    for(let i =0; i < char.length; i++){

        if (char[i]== 'a' ||char[i]== 'e' || char[i]== 'i' || char[i]== 'o' || char[i]== 'u') {
            count++;
        }
    }
    console.log(count);

    r1.close();
    
    
  });