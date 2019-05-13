import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;


public class SalaryChecker {
	

	 public static void main (String[] args)
 {	
   Scanner sc = new Scanner(System.in);	
   double salary = 0;


   System.out.println("Enter the salary ");
   salary = sc.nextDouble();


   try{

     if(salary < 3000){
      throw new EmployeeException();
    }else if(salary > 3000){
      System.out.println("Your salary is greater than 3000 ");
    }
    else{
    	System.out.println("Your salary is 3000 ");
    }

  } 
  catch( EmployeeException ae){

    System.out.println(" Your Salary is less than 3000 ");


  }

}
}

