import java.util.Scanner;


class PrintPrimeNumbers
{
   public static void main (String[] args)
   {	
   		Scanner sc = new Scanner(System.in);	
       int i =0;
       int num =0,c=0;
       
       String  primes = "";

       System.out.println("Enter the no ");
       c = sc.nextInt();


       for (i = 1; i <= c; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     
	     primes = primes + i + " ";
	  }	
       }	
       System.out.println("Prime numbers are :");
       System.out.println(primes);
   }
}