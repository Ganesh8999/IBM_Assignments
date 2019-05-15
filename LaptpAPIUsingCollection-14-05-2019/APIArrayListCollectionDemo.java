
import java.util.ArrayList;



public class APIArrayListCollectionDemo{
	public static void main(String[] args){
        java.util.Scanner scan = new java.util.Scanner(System.in);


        DatabaseOperations op = new DatabaseOperations();
		ArrayList list = new ArrayList();
        Laptop lapy = new Laptop("HPX1", 2, 1000, "HP");

		
		list.add(new Laptop("HPEY", 8, 1000, "HP"));
		list.add(new Laptop("APR", 12, 250, "Apple"));
		list.add(new Laptop("LNT", 6, 1000, "Lenovo"));
        list.add(lapy);

        
        System.out.println("1 : Add new Laptop \n 2 : Fecth Laptop details \n 3 : Search  Laptop \n 4 : Remove Laptop details \n 5 : Update Laptop Details");
        
        
        try{
        	String option = scan.nextLine();
        	try{
        		int input = Integer.parseInt(option);
        		op.selectOperations(input, list);
        	}catch(NumberFormatException nfe){
                throw new NoInputException("Don't keep it null");
            }
        	       	
        }
        catch(InputInvalidException iie){
            iie.printStackTrace();
        }
        catch(NoInputException nie){
            nie.printStackTrace();
        }
	}
}