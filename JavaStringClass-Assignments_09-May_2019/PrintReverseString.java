import java.util.Scanner;

class PrintReverseString{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String reverse="",string;

		System.out.println("Enter the string");

		string = sc.nextLine();

		int strLength = string.length();

		for (int i = strLength-1;i >= 0 ;i--) {

			reverse = reverse+string.charAt(i);

		}

		System.out.println("Given String:- "+string +" Reverse string "+reverse);

		
	}

	
}