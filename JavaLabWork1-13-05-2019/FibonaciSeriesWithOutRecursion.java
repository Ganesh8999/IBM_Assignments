import java.util.Scanner;




class FibonaciSeriesWithOutRecursion {

static int a = 1,b=1,c=0,input;

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no ");
		 input = sc.nextInt();
		
		
		System.out.print(a+ " "+b);

		for (int i = 2;i < input ; ++i) {
			
			c =a+b;
			System.out.print(" "+c);

			a = b;
			b = c;

			
		}

	}
	
}