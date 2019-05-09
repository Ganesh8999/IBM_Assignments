import java.util.Scanner;

class CheckPalindrome{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String reverse="", string;

		System.out.println("Enter the string");

		string = sc.nextLine();

		int strLength = string.length();

		for (int i = strLength-1;i >= 0 ;i--) {

			reverse = reverse+string.charAt(i);

		}

		if(string.equals(reverse)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String isn't palindrome");
		}
	}

	
}