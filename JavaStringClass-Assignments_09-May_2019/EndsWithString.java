import java.util.Scanner;

class EndsWithString{

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		String string = sc.nextLine();

		System.out.println("Enter the end string ");

		String endString = sc.nextLine();

		
		
		EndsWithString ews = new EndsWithString();

		boolean flag = ews.endingString(string,endString);
		if (flag == true) {
			System.out.println("String is "+string);
			System.out.println("String ending is matched with given string -->   "+endString);

		}else{
			System.out.println("String is "+string);
			System.out.println("String ending isn't matched with given string--> "+endString);

		}

		
	}

	public boolean endingString(String str1,String eString){

		boolean flag = false;

		int diff = str1.length() - eString.length();

		for ( int i = diff  ;i <= str1.length() - 1 ;i++ ) {

			for (int j = 0 ; j <= eString.length() -1 ;j++ ) {

				if (str1.charAt(i)== eString.charAt(j)) {
					flag =true;

				}else{
					flag = false;
				}

			}

		}
		
		return flag;
	}

}

