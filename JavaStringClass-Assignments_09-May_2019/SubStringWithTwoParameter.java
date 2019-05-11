import java.util.Scanner;

class SubStringWithTwoParameter{

	static String string;
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		string = sc.nextLine();

		System.out.println("Enter the start index ");

		int sIndex = sc.nextInt();

		System.out.println("Enter the end index ");

		int eIndex = sc.nextInt();

		
		
		SubStringWithTwoParameter sswtp = new SubStringWithTwoParameter();
		
		sswtp.subString(sIndex,eIndex);

	}

	public void subString(int start,int end){

		
		for (int i = start; i < string.length(); i++) {

			if(i < end)
				System.out.print(string.charAt(i));
			
			
		}

		

	}
}



