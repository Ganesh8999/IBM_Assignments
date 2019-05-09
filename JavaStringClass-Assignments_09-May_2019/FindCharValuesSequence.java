import java.util.Scanner;

class FindCharValuesSequence{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		String firstString = sc.nextLine();

		System.out.println("Enter the second string");
		String secondString = sc.nextLine();

		
		FindCharValuesSequence fcvs = new FindCharValuesSequence();

		boolean check = fcvs.findCharValueSequence(firstString,secondString);


		if(check == true){

			System.out.println( firstString+ "  contains the --> "+ secondString + "    word");
		}else{

			System.out.println(firstString+ " doesn't contains the --> "+ secondString + "  word");

		}

	}

	public boolean findCharValueSequence(String str1, String str2){


			boolean check = str1.contains(str2);

			return check ;
		
	}
}