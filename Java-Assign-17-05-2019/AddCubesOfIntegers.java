import java.util.*;


class AddCubesOfIntegers{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number ");


		int number = sc.nextInt();

		

		int len = Integer.toString(number).length();

		int[] iarray = new int[len];

		for (int index = 0; index < len; index++) {
			iarray[index] = number % 10;
			number /= 10;
		}

		int sum = 0;
		for (int i=0;i < iarray.length ;i++ ) {

			sum +=  (iarray[i] * iarray[i] * iarray[i]);

			
		}
		
		System.out.println(sum);

	}

} 

