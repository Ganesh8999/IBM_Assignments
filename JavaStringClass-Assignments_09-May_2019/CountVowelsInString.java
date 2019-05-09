import java.util.Scanner;

class CountVowelsInString{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String string;

		int count = 0;


		System.out.println("Enter the string");

		string = sc.nextLine();

		for (int i = 0;i < string.length() ;i++) {
			
			if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){

				count++;
			}

		}
		System.out.println("vowels "+ count);

		
	}

	
}