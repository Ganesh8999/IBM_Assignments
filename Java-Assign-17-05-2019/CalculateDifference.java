import java.util.*;


class CalculateDifference{


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter the no ");


		int n = sc.nextInt();

		CalculateDifference cd = new CalculateDifference();

		int result = cd.calculateDifference(n);


		System.out.println("result is "+result);

	}


	public int calculateDifference(int num){

		int diff = 0;
		int square = 0;
		int incr = 0;

		for (int i = 0;i < num ; i++ ) {


				square = square + i*i;
			
		}

		for (int j = 0;j < num ; j++ ) {


				incr = incr + j;
			
		}

		 diff = square - (incr*incr);

		return diff;

	}
	


}