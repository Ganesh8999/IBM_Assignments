import java.util.Scanner;

class DisplayInitialsOfName{


	// Java program to print initials of a name
	
	static void printInitials(String name) 
	{ 
		if (name.length() == 0) 
			return; 

		
		System.out.print(Character.toUpperCase( 
			name.charAt(0))); 

		// Traverse rest of the string and 
		// print the characters after spaces. 
		for (int i = 1; i < name.length() - 1; i++) 
			if (name.charAt(i) == ' ') 
				System.out.print("" + Character.toUpperCase( 
										name.charAt(i + 1))); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the full name ");
		String name = sc.nextLine(); 
		printInitials(name); 
	} 
} 


