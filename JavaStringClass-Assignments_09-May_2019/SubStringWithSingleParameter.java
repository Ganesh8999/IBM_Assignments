import java.util.Scanner;

class SubStringWithSingleParameter{

	static String string;
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		string = sc.nextLine();

		System.out.println("Enter the start index ");

		int index = sc.nextInt();

		
		
		SubStringWithSingleParameter sswsp = new SubStringWithSingleParameter();
		
		sswsp.subString(index);

	}

	public void subString(int index){

		char []chars = {};
		int j = 0;
		int var = index;

		for (int i=var; i < string.length(); i++) {

			System.out.print(string.charAt(i));

		}
	}

}

