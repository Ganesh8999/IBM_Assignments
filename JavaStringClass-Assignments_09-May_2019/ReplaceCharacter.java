import java.util.Scanner;

class ReplaceCharacter{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		String firstString = sc.nextLine();

		System.out.println("Enter the unwanted Character");
		String secondString = sc.nextLine();

		System.out.println("Enter the new Character for replacing unwanted Character");
		String newCharacter = sc.nextLine();

		
		ReplaceCharacter replaceChar = new ReplaceCharacter();

		String replacedChar = replaceChar.replaceCharacter(firstString,secondString,newCharacter);

		System.out.println(replacedChar);
		

	}

	public String replaceCharacter(String str1, String str2,String str3){


		String newString = str1.replace("r","t");
		

		return newString ;
		
	}
}