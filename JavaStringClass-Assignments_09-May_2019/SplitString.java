import java.util.Scanner;

class SplitString{

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  string");

		String mainString = sc.nextLine();

		System.out.println("Enter the split string ");

		String splitStr = sc.nextLine();

		
		SplitString sps = new SplitString();
		
		sps.splitString( mainString, splitStr);

	}

	public void splitString(String str1,String str2){

		String s1 = null;

		for (int i = 0;i < str1.length() ;i++ ) {

			if(str1.contains(str2)){

				s1 = str1.replace(str2,"\n");
			}

			
			
		}
		System.out.println(s1);

		

	}
}



