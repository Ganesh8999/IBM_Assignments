class AddFloatNumsFromCmd{

	public static void main(String[] args) {

		

		float result = 0;

		try{

			if(args.length > 1){

				for (int i = 0; i <= args.length -1 ;i++) {

					
					result +=  Float.parseFloat(args[i]);

				}
				
				String formattedString = String.format("%.02f",result);
				System.out.println("Addition is :- "+formattedString);

			}else{
				System.out.println("At least two numbers must be passed ");

			}

			

		}

		catch( Exception e){

			e.printStackTrace();

		}

	}
}