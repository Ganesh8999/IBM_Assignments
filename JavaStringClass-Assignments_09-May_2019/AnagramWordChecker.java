import java.util.Scanner;
import java.util.Arrays;


class AnagramWordChecker{

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		String firstString = sc.nextLine();

		System.out.println("Enter the second string ");

		String secondString = sc.nextLine();

		String s1 = firstString.replace(" ","");
		String s2 = secondString.replace(" ","");

		AnagramWordChecker awch = new AnagramWordChecker();
		
		awch.anagramWordChecker(s1, s2);

	}

	public void anagramWordChecker(String str1,String str2){

		char []s1 = str1.toCharArray();
		char []s2 = str2.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);



		String sortedS1 = new String(s1);
		String sortedS2 = new String(s2);

		boolean flag = false;

		if(sortedS1.length() == sortedS2.length()){

			for(int i = 0; i < sortedS1.length();i++){

				if(sortedS1.charAt(i) == sortedS2.charAt(i)){

					flag = true;
					continue;
				}else{

					flag = false;
					break;
				}


			}


		}

		if(flag == false){
			System.out.println("Not an Anagram");
		}
		else{
			System.out.println("Yes it's an Anagram");
		}
	}
}







