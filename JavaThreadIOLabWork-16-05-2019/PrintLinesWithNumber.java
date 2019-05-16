import java.io.*;

class PrintLinesWithNumber{
	

	public static void main(String[] args) {

		try{

			FileReader fr = new FileReader("Ganesh.txt");


			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();
			
			int count = 1;
			while(line != null){

				System.out.println("Line No :- "+ count +" " +line);
				count++;
				line = br.readLine();
			}

			br.close();    
			fr.close();    

		}
		catch(IOException io){

			io.printStackTrace();
		}

	}
}
