import java.util.*;


class CalculateSum{


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("ENter the no ");


		int n = sc.nextInt();

		CalculateSum cs = new CalculateSum();

		int result = cs.calculateSum(n);


		System.out.println("result is "+result);

	}


	public int calculateSum(int num){

		int sum = 0;

		for (int i = 1;i < num ; i++ ) {


			if((i%3 == 0) || (i%5 == 0)){

				sum = sum + i;
			}
			
		}

		return sum;

	}
	


}