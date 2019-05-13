import java.util.Scanner;


class FibonacciSeriesWithReursion{  

 static int a=1,b=1,c=0;  

 public static void main(String args[]){    

  FibonacciSeriesWithReursion fswr = new FibonacciSeriesWithReursion();
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the no ");
  c = sc.nextInt();

  System.out.print(a+" "+b);    
  fswr.fibonacci(c-2);   
}    




public void fibonacci(int num){   

  if(num>0){    
   c = a + b;    
   a = b;    
   b = c;    
   System.out.print(" "+c);   
   fibonacci(num-1);    
 }      

 
}

}  