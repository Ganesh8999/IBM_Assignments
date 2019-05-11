import java.util.Scanner;

class SecondMostFrequentCharacter{

	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");

		String string = sc.nextLine();

		
		
		SecondMostFrequentCharacter smfchar = new SecondMostFrequentCharacter();

		char character= smfchar.secondMostFrequentCharacter(string);

		System.out.println("This is given string "+string);

		if(character != '\0'){

			System.out.println("The second most character is "+character);
		}else{
			System.out.println("There is no second most character in given string");
		}

		
	}

	public char secondMostFrequentCharacter(String str1){


		int[] count = new int[NO_OF_CHARS]; 

		for (int i = 0;i < str1.length();i++ ) {

			(count[str1.charAt(i)]) ++;

		}

		int count_first = 0,count_second = 0;

		for (int i = 0;i < NO_OF_CHARS ; i++ ) {

			if(count[i] > count[count_first]){

				count_second = count_first;
				count_first = i;
			}else if(count[i] > count[count_second] && count[i] != count_first){

				count_second = i;
			}
			
		}

		return (char)count_second;
		
	}
}