import java.util.*;
import java.io.*;



class CharacterCountAndAddInHashMap{
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String again;
		do{
			System.out.println("Enter the String ");
			String string = sc.next();

				// converting given array to String
			char[] stringArray = string.toCharArray();
		HashMap<Character,Integer> map = countCharacter(stringArray);

			//print countCharMap
		for (Map.Entry  entry : map.entrySet() ) {

			System.out.print( "{ `"+entry.getKey()+"` : "+entry.getValue()+"  }");
		}



			System.out.println("Do you want to continue the process  press Y");
			again = sc.next();


		}while(again.equalsIgnoreCase("y"));



	}
	public static HashMap<Character,Integer> countCharacter(char[] ch){

		HashMap<Character,Integer> countCharmap = new HashMap<>();



		for (char c : ch) {

			if(countCharmap.containsKey(c)){

					// if char is present in countCharMap increase count by 1
				countCharmap.put(c,countCharmap.get(c)+1);
				
				
			}else{

					// if char is not present
					// put this char into countCharMap with 1 as its value
				countCharmap.put(c,1);
			}

		}

		return countCharmap;
	}

}