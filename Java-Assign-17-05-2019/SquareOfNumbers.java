import java.util.*;
import java.io.*;



class SquareOfNumbers{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String again;
		do{
			
			System.out.println("How many numbers want to add");
			int howMany = sc.nextInt();

			int[] intArray = new int[howMany];

			


			System.out.println("Do you want to continue the process  press Y");
			again = sc.next();


		}while(again.equalsIgnoreCase("y"));



	}
	public static HashMap<Integer,Integer>getSquares(Integer[] integer){


		return square;

	}

}