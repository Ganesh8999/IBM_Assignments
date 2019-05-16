import java.io.*;


class DisplayDetailsOfFile {
	


	public static void main(String[] args) {
		

		
		try{

			FileReader fr = new FileReader("Ganesh.txt");
			FileReader fr2 = new FileReader("Ganesh.txt");
			FileReader fr3 = new FileReader("Ganesh.txt");



			BufferedReader br = new BufferedReader(fr);
			BufferedReader br2 = new BufferedReader(fr2);
			BufferedReader br3 = new BufferedReader(fr3);

			String line = br.readLine();
			String line2 = br3.readLine();
			
			int countLines = 0;
			int charCounter = 0;
			int wordCounter = 0;

			int i=0;
			char ch;
			String[] words= new String[]{};
			while(line != null){

				countLines++;
				line = br.readLine();

			}
			
			while((i=br2.read())!= -1){
				ch = (char)i;
				charCounter++;
				
			}
			while(line != null){

				line = br2.readLine();
				words = line.split(" ");

			}



			while (line2 != null) {
				String []parts = line2.split(" ");
				for( String w : parts)
				{
					wordCounter++;        
				}
				
				line2 = br3.readLine();
			}         
			
		System.out.println("No of lines in file "+countLines);
		System.out.println("No of Characters in a file "+ charCounter);
		System.out.println("No of Words in a file "+ wordCounter);



		br.close();    
		fr.close();

		br2.close();    
		fr2.close(); 

		br3.close();    
		fr3.close(); 


	}
	catch(IOException io){

		io.printStackTrace();
	}

}
}