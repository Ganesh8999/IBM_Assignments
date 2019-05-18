import java.util.*;
import java.io.*;



class SquareOfNumbers{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String again;
		do{

			ArrayList<Integer> list = new ArrayList<>();
			
			System.out.println("How many numbers want to add in array");

			int howMany = sc.nextInt();

			int[] intArray = new int[howMany];

			System.out.println("Enter numbers ");			

			for (int i=0 ;i < howMany ;i++) {


					intArray[i]=(sc.nextInt());
			}



			Map<Integer,Integer> map = getSquares(intArray);

			for (Map.Entry<Integer,Integer> entry : map.entrySet() ) {

				System.out.println("Key   "+entry.getKey()+"   "+entry.getValue());
				
			}



			System.out.println("Do you want to continue the process  press Y");
			again = sc.next();


		}while(again.equalsIgnoreCase("y"));



	}
	public static HashMap<Integer,Integer>getSquares(int[] integer){

		HashMap<Integer,Integer> map = new HashMap<>();


		ArrayList<Integer>  list = new ArrayList<>();

		for (Integer i  : integer ) {

				list.add(i);

		}


		for (Integer j : list) {

			map.put(j,(j*j));
			
		}
		return map;

	}

}