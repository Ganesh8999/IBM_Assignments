import java.util.*;


class FindSecondSmallestElement{
	

	public static void main(String[] args) {

		int[] numbers={43,23,65,44,11,81}; 
		

		FindSecondSmallestElement sse =  new FindSecondSmallestElement(); 

		 int secondSmallest  =  sse.getSecondSmallest(numbers); 


		 System.out.println("Array numbers"+ Arrays.toString(numbers));
		 System.out.println("Second Smallest number is "+ secondSmallest);

	}

	
	public int getSecondSmallest(int num[]){

			Arrays.sort(num);
			
			int secondSmallest = num[1];
			return secondSmallest;
	}

} 

