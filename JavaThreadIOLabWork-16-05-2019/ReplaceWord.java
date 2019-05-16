import java.util.Scanner;
import java.io.*;

class ReplaceWord{
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the word which you want to replace ");
		String originalWord = sc.nextLine();

		System.out.println("Enter the word to replacing word ");
		String rword = sc.nextLine();

		ReplaceWord rw = new ReplaceWord();

		rw.replaceWord(originalWord,rword);


	}


	public void replaceWord(String ostr,String rstr){


		try{

			FileReader fr = new FileReader("Ganesh.txt");

			BufferedReader br = new BufferedReader(fr);

			String line;

			String string = "";

			while ((line = br.readLine()) != null) {

				line = line.replaceAll(ostr,rstr);
				string = string + line + "\n";
				
			}
			br.close();
			FileWriter fw = new FileWriter("Ganesh.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(string);

			
			bw.flush();
			bw.close();
			

			System.out.println("Replace Done ");


		}catch(IOException io){

			io.printStackTrace();
		}




	}

}