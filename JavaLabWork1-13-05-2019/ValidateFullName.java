import java.util.Scanner;


public class ValidateFUllName
{
 public static void main (String[] args)
 {	
   Scanner sc = new Scanner(System.in);	
   String name = "";
   String middleName = "";
   String lastName = "";



   System.out.println("Enter the name ");
   name = sc.nextLine();

   System.out.println("Enter the middleName ");
   middleName = sc.nextLine();

   System.out.println("Enter the lastName ");
   lastName = sc.nextLine();

   try{

     if(name.equals("") || middleName.equals("") || lastName.equals("")){
      throw new InvalidDataException();
    }else{
      System.out.println("Successfull registeration");
    }

  } 
  catch( InvalidDataException ide){

    System.out.println("Please Enter all details");


  }



}
}

class InvalidDataException extends Exception{

  /*InvalidDataException(){

    System.out.println("Please enter all details ");
  }
*/
}