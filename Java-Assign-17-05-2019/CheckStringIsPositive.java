import java.util.*;


class CheckStringIsPositive{


	public static void main(String[] args) {


		String again;

		do{

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the String ");

			String string = sc.next();

			CheckStringIsPositive csip = new CheckStringIsPositive();
			boolean check = csip.checkPositivity(string);

			if(check == true)
				System.out.println("String is positive ");
			else
				System.out.println("String isn't positive ");	



			System.out.println("Do you want to continue the process  press Y");
			again = sc.next();


		}while(again.equalsIgnoreCase("y"));



	}


	public boolean checkPositivity(String str){


		

		for (int i = 1 ; i < str.length();i++ ) {

			if(( str.charAt(i)) < str.charAt(i-1)){

				return  false;
			}
			

		}
		return true;
	}
	


}