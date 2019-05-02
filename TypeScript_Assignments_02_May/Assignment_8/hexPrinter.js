"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Enter decimal number : ", function (answer) {
    var num = parseInt(answer);
    var hexNumber = num.toString(16);
    console.log(hexNumber);
    runtimeVal.close();
});
