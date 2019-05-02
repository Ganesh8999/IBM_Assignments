"use strict";
exports.__esModule = true;
var readline = require("readline");
var r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
r1.question("enter number", function (answer) {
    var n = parseInt(answer);
    var fact = 1;
    for (var i = 1; i <= n; i++) {
        fact = fact * i;
    }
    console.log("factorial is " + fact);
    r1.close();
});
