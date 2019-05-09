import java.util.Scanner;

class FindCharacterInString{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");

		String str = sc.nextLine();

		System.out.println("Enter the index no to get Character");
		int index = sc.nextInt();

		
		FindCharacterInString fcis = new FindCharacterInString();
		System.out.println("Character at index  "+index+ " is "+fcis.findCharByIndex(str,index));

	}

	public char findCharByIndex(String str, int index){


		char character = str.charAt(index);

		return  character;
	}
}