"use strict";
exports.__esModule = true;
var readline = require("readline");
var runtimeVal = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
runtimeVal.question("Enter marks of subjects PHY BIO MATH WITH SPACES : ", function (answer) {
    var splitter = answer.split(" ");
    var phy = parseInt(splitter[0]);
    var math = parseInt(splitter[1]);
    var bio = parseInt(splitter[2]);
    resultShow(phy, math, bio);
    runtimeVal.close();
});
function resultShow(phy, math, bio) {
    var result = true;
    var total = phy + math + bio;
    if (total < 125) {
        result = false;
    }
    if (phy < 40) {
        result = false;
    }
    if (math < 40) {
        result = false;
    }
    if (bio < 40) {
        result = false;
    }
    //Test for result
    if (result == false) {
        console.log("Result:- Fail");
    }
    else {
        console.log("Result:-  Pass");
    }
}
