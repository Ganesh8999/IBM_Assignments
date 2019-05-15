import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;


public class SalaryChecker {
	

  public static void main (String[] args)
  {	
   Scanner sc = new Scanner(System.in);	
   double salary = 0;


   System.out.println("Enter the salary ");
   salary = sc.nextDouble();

   SalaryChecker sck = new SalaryChecker();

   try{

         sck.checkSalary(salary);

     
  }catch(EmployeeException e){

    System.out.println(e.getMessage());
  }

}

public void checkSalary(double salary) throws EmployeeException{
 if(salary < 3000)
         throw new EmployeeException("Your Salary is less than 3000");
 else if(salary >= 3000)
        System.out.println("Salary is nice ");

}


}


