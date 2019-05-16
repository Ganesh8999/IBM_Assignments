import java.io.*;



class  FileProgram{

	

	public static void main(String[] args) {

		try{

			FileReader fr = new FileReader("source.txt");		
			BufferedReader br = new BufferedReader(fr);

			FileWriter fw = new FileWriter("target.txt");
			BufferedWriter bw = new BufferedWriter(fw);



			CopyDataThread cdt = new CopyDataThread(br,bw);
			cdt.start();

		}catch(IOException ioe){

			ioe.printStackTrace();
		}	

		}
}