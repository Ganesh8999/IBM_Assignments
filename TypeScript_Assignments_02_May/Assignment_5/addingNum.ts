function addNumbers(){

    let totalNum : number = 100;
    let sum :number = 0;
    for (let index = 1; index <= totalNum; index++) {
       
        sum = sum + totalNum;
    }
       return  sum;
    }
    
    let result: number = addNumbers();
    
    console.log(result);