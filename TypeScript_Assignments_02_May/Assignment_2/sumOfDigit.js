"use strict";
exports.__esModule = true;
var readline = require("readline");
var r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
r1.question("enter number ", function (answer) {
    var n = answer;
    var splitted = n.split('');
    var sum = 0;
    for (var index = 0; index < splitted.length; index++) {
        sum += +splitted[index];
    }
    console.log(sum);
    r1.close();
});
