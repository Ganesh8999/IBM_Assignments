import java.util.Scanner;


class MySplitMethodWorking{

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String string = sc.nextLine();

		System.out.println("Enter the separator symbol");
		String separator = sc.nextLine();

		MySplitMethodWorking mySplitter = new MySplitMethodWorking();
		mySplitter.mySplit(string,separator);



	}

	public void mySplit(String str1,String str2){

		String result = null;
		for (int i = 0;i < str1.length();i++ ) {


			result = str1.replace(" ", str2);

		} 

		System.out.println(str2 +"Given separator is used at the place of spaces "+result);



	}

	

}