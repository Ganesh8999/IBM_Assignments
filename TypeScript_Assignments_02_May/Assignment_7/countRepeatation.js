"use strict";
exports.__esModule = true;
var readline = require("readline");
var r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
r1.question("enter string ", function (answer) {
    var char = answer.split('');
    var count = 0;
    for (var i = 0; i < char.length; i++) {
        if (char[i] == 'a' || char[i] == 'e' || char[i] == 'i' || char[i] == 'o' || char[i] == 'u') {
            count++;
        }
    }
    console.log(count);
    r1.close();
});
