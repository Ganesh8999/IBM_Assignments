import java.util.*;


public class JobSeekerValidation{


	public static void main(String[] args) {
		String again;

		do{


			Scanner sc = new Scanner(System.in);


			System.out.println("Enter the name  atleast 8 character and after name enter _job in last");

			String str = sc.next();


			if(str.length() > 8){


						if( (str.charAt(str.length()-1)) == 'b' && (str.charAt(str.length()-2) == 'o' && (str.charAt(str.length()-3)) == 'j' && (str.charAt(str.length()-4)) == '_' )){

							System.out.println("Name is valid for registration ");
						}else{

							System.out.println("Name is invalid for registration ");
						}




			}else{

				System.out.println("Name size must be 8");
			}
			System.out.println("Do you want to continue the process  press Y");
			again = sc.next();


		}while(again.equalsIgnoreCase("y"));


	}


}