import java.util.Scanner;

class CompareTwoStringsLexicographically{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		String firstString = sc.nextLine();

		System.out.println("Enter the second string");
		String secondString = sc.nextLine();

		
		CompareTwoStringsLexicographically ctsl = new CompareTwoStringsLexicographically();
		int check = ctsl.compareStrings(firstString,secondString);

		if(check == 0){

			System.out.println("Strings are lexicographically equal");
		}else if(check < 0){

			System.out.println("Strings aren't equal");
		}else{

			System.out.println("Strings aren't equal");

		}

	}

	public int compareStrings(String str1, String str2){


			int var1 = str1.compareToIgnoreCase(str2);

			return var1;
		
	}
}