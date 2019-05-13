import java.util.Scanner;


public class ValidateAge
{
 public static void main (String[] args)
 {	
   Scanner sc = new Scanner(System.in);	
   int age = 0;


   System.out.println("Enter the age ");
   age = sc.nextInt();


   try{

     if(age < 18){
      throw new AgeException();
    }else{
      System.out.println("Eligible for voting ");
    }

  } 
  catch( AgeException ae){

    System.out.println("You are't elegible for voting ");


  }

}
}

class AgeException extends Exception{


}