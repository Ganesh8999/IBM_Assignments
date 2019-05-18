import java.util.*;
import java.io.*;



class StringArrayManipulator{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String again;
		
		do{

			System.out.println("Enter the string");
			String strArray = sc.nextLine();

			String[] splittedArray = strArray.split(" ");

			StringArrayManipulator sam = new StringArrayManipulator();

			sam.stringArrayManipulator(splittedArray);

			System.out.println("Do you want to continue the process  press Y");
			again = sc.nextLine();


		}while(again.equalsIgnoreCase("Y"));



	}
	public  void stringArrayManipulator(String[] string){

		ArrayList<String> listOfString = new ArrayList<>(Arrays.asList(string));

		Collections.sort(listOfString);

		//System.out.println(listOfString);

		int sizeOfList = listOfString.size();



		if(sizeOfList%2 == 0){

			for (int i = 0; i <  sizeOfList/2 ;i++ ) {

				listOfString.set(i,(listOfString.get(i).toUpperCase()));


				for (int j=(sizeOfList/2)+1; j < sizeOfList ; j++ ) {

					listOfString.set(i,(listOfString.get(i).toLowerCase()));
					
				}

				
			}




		}else {


			for (int i = 0; i <  sizeOfList/2 +1 ;i++ ) {

				listOfString.set(i,(listOfString.get(i).toUpperCase()));


				for (int j=(sizeOfList/2)+2; j < sizeOfList ; j++ ) {

					listOfString.set(j,(listOfString.get(i).toLowerCase()));
					
				}
				
			}

		}

		

		System.out.println(listOfString);
		


	}

}

