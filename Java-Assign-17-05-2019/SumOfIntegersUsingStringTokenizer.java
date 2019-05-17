import java.util.*;


class SumOfIntegersUsingStringTokenizer{
	


public static void main(String[] args) {
	String again;

	do{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to add");

		String string = sc.next();

		int result = 0;



			try{

			StringTokenizer stz = new StringTokenizer(string,"dlim");

			while(stz.hasMoreTokens()){

				int number= 0;

				number = Integer.parseInt(stz.nextToken(","));

				result +=  number;
			}


			System.out.println(" Result is "+ result);
			}catch(NumberFormatException nfe){

				System.out.println("Please enter number with , between them");
			}

			System.out.println("Do you want to continue the process  press Y");
			again = sc.next();

		
	}while(again.equalsIgnoreCase("y"));




}
	
}