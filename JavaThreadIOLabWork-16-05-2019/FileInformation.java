import java.io.*;
import java.util.Scanner;

class FileInformation{
	

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the file Name with extension");
		String fName = sc.nextLine();

		File file = new File(fName);

		if(file.exists() == true){

			System.out.println("File exists");



			if(file.canRead() == true){

				System.out.println(" Yes you can read this file");

				if(file.canWrite() == true){

					System.out.println(" Yes  can write in  this file");
				}else{

					System.out.println(" No you can't write in  this file");
				}
			}else{

				System.out.println("Sorry you  can't read this file");
			}



			System.out.println("File size is "+file.length()+"  bytes");

		}else{


			System.out.println("File not found ");
		}
	}

}