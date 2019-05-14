public class DatabaseOperations{
    java.util.Scanner sc = new java.util.Scanner(System.in);


	void selectOperations(int select, java.util.ArrayList list){
	    
	  String string = "";
	  do{
	    
        switch(select){
        	case 1: newLaptopDetails(list);
        	        break;

        	case 2: fecthLaptopDetails(list);
        	        break; 

        	case 3: searchLaptopsDetails(list);
        	        break; 

        	case 4: removeLaptop(list);
        	        break; 

        	case 5: updateLaptop(list);
        	        break; 

        	default: System.out.println("Wrong input !!! Please select option any one from 1 to 5"); 
        }
      
        System.out.println("Do you want to continue the process ? \n Press Y/N");
        string = sc.next();
        
        if(string.equalsIgnoreCase("Y")){
          System.out.println("1 : Add new Laptop \n 2 : Fecth Laptop details \n 3 : Search  Laptop \n 4 : Remove Laptop details \n 5 : Update Laptop Details");
          select = sc.nextInt(); 
          
        }
        
        if(!string.equalsIgnoreCase("Y") && !string.equalsIgnoreCase("N")){
        	System.out.println("Please enter only Y/N");
        	System.out.println("Do you want to continue the process ? \n Press Y/N");
            string = sc.next();
        }
        
      }while(!string.equalsIgnoreCase("N"));
    }

	void newLaptopDetails(java.util.ArrayList list){
        
        System.out.println("Enter Laptop ID: ");
        String lid = sc.nextLine();
        System.out.println("Enter Ram Capacity: ");
        int rCapacity = sc.nextInt();
        System.out.println("Enter HDD Capacity: ");
        int hddCapacity = sc.nextInt();
        System.out.println("Enter Brand Name: ");
        String brandName = sc.next();
        
        
        Laptop lapy = new Laptop(lid, rCapacity, hddCapacity, brandName);
        list.add(lapy);
        System.out.println("Laptop with Laptop ID " + lapy.getLaptopID() + " stored ");
	}

	void fecthLaptopDetails(java.util.ArrayList list){
		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	void searchLaptopsDetails(java.util.ArrayList list){
		System.out.println("1 : Find by Laptop ID \n 2 : Find by RAM Capacity \n 3 : Find by HDD Capacity \n  4 : Find  by Brand");
        int input = sc.nextInt();
        
        switch(input){
        	case 1: findUsingLaptopID(list);
        	        break;

        	case 2: findByUsingRAM(list);
        	        break;

        	case 3: findByHDD(list);
        	        break;

        	case 4: findByBrand(list);
        	        break;

        	default: System.out.println("Invalid Choice! Try Again.");
        } 
	}

	void findUsingLaptopID(java.util.ArrayList list){
	   
       System.out.println("Enter the Laptop ID: ");
       String lID = sc.next();
       for (Object obj : list) {
       	 if(((Laptop)obj).getLaptopID().equals(lID))
       	 	System.out.println("\n" + obj);
       }
	}

	void findByUsingRAM(java.util.ArrayList list){
	   
       System.out.println("Enter RAM Capacity: ");
       int ram = sc.nextInt();
       for (Object obj : list) {
       	 if(((Laptop)obj).getRamCapacity() == ram)
       	 	System.out.println("\n" + obj);
       }
	}

	void findByHDD(java.util.ArrayList list){
	   
       System.out.println("Enter HDD Capacity: ");
       int hdd = sc.nextInt();
       for (Object obj : list) {
       	 if(((Laptop)obj).getHddCapacity() == hdd)
       	 	System.out.println("\n" + obj);
       }
	}

	void findByBrand(java.util.ArrayList list){
       
       System.out.println("Enter Brand Name: ");
       String brandName = sc.next();

       for (Object obj : list) {
       	 if(((Laptop)obj).getBrandName().equalsIgnoreCase(brandName))
       	 	System.out.println("\n" + obj);
       }
	}

	void removeLaptop(java.util.ArrayList list){
		
		System.out.println("Enter Laptop ID: ");
        sc.nextLine();
        String lID = sc.nextLine();
        int sequence = 0;
        for (Object obj : list ) {
        	if(((Laptop)obj).getLaptopID().equalsIgnoreCase(lID)){
        	   sequence = list.indexOf(obj);
               break;
        	}
        }

        list.remove(sequence);
        System.out.println("Laptop ID " + lID + " removed");
	}

	void updateLaptop(java.util.ArrayList list){
		System.out.println("Enter Laptop ID to update  ");
		String lID = sc.next();
		int sequence = 0;
        for (Object obj : list ) {
        	if(((Laptop)obj).getLaptopID().equalsIgnoreCase(lID)){
        	   sequence = list.indexOf(obj);
               break;
        	}
        }
        if(sequence == 0)
        	System.out.println("Invalid input ");
        else{
           Laptop lapy = (Laptop)list.get(sequence);
           System.out.println("1 : Update Ram Capacity \n 2 : Update HDD Capacity \n  3 : Update Brand Name \n");
           int option = sc.nextInt();
           switch(option){
           	
           	   case 1: updateRAM(list, sequence, lapy);
           	           break;
   
           	   case 2: updateHDD(list, sequence, lapy);
           	           break;
   
           	   case 3: updateBrandName(list, sequence, lapy);
           	           break;
   
           	   default: System.out.println("Invalid input");
        	        
           } 
       }
	}

	void updateRAM(java.util.ArrayList list, int sequence, Laptop lapy){
       System.out.println("Enter new RAM Capacity : ");
       int newRAM = sc.nextInt();
       lapy.setRamCapacity(newRAM);
       System.out.println("RAM Updated ");
	}

	void updateHDD(java.util.ArrayList list, int sequence, Laptop lapy){
       System.out.println("Enter new HDD Capacity: ");
       int newHDD = sc.nextInt();
       lapy.setHddCapacity(newHDD);
       System.out.println("HDD Updated!");
	}

	void updateBrandName(java.util.ArrayList list, int sequence, Laptop lapy){
      System.out.println("Enter Brand Name: ");
       String newBrand = sc.next();
       lapy.setBrand(newBrand);
       System.out.println("Brand Updated !");
	}   
}


class InputInvalidException extends Exception{
   InputInvalidException(String string){
      super(string);
   }
}


class NoInputException extends Exception{
   NoInputException(String string){
      super(string);
   }
}
