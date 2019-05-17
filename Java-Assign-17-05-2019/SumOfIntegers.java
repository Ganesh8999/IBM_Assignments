import java.util.*;


class SumOfIntegersUsingStringTokenizer{
	


public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to add");

		String string = sc.next

		int result = 0;


			StringTokenizer stz = new StringTokenizer(string,"delim");

			while(stz.hasMoreTokens()){

				int number= 0;

				number = Integer.parseInt(stz.nextToken());

				result = result + number;
			}


			System.out.println(" Result is "+ result);
		




}
	
}