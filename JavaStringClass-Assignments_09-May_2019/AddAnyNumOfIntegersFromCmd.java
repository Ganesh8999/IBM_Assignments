class AddAnyNumOfIntegersFromCmd{

	public static void main(String[] args) {

		

		int result = 0;

		try{

			if(args.length > 1){

			for (int i = 0; i <= args.length -1 ;i++) {

              
				result = result + Integer.parseInt(args[i]);

			}
			System.out.println(result);
		}else{
						System.out.println("At least two numbers must be passed ");

		}

			

		}

		catch( Exception e){

			e.printStackTrace();

		}

	}
}