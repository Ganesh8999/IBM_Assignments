import java.util.*;


class SortIntegerArray{
	

	public static void main(String[] args) {

		int[] numbers={43,23,65,44,11,81}; 
		

		SortIntegerArray sia =  new SortIntegerArray(); 

		 int sorted  =  sia.getSorted(numbers); 



		 System.out.print(Arrays.toString(sorted));

	}

	
	public int[] getSorted(int num[]){
		int reverse = 0;
		int[] rev = new int[num.length];
		int j =0;

		for (int i = 0;i < num.length ;i++ ) {


			int n = num[i];

			while(n != 0)
			{
				reverse = reverse * 10;
				reverse = reverse + n%10;
				n = n/10;
			}


			rev[i] = reverse;
			reverse =0;
			
		}
		
			Arrays.sort(rev);
			

			return rev;
	}

} 

