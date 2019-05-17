import java.text.ParseException;
import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;



public class DifferenceBetweenTwoDates{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter start date in yyyy-mm-dd format :");

		String str1 = sc.next();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");



			    Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 

                String strDate = dateFormat.format(date);  
               // System.out.println("Converted String: " + strDate);  


		try{

			Date start = format.parse(str1);
			Date end    = format.parse(strDate);

			long diiffInMilliSeconds = end.getTime() - start.getTime();

			System.out.println(diiffInMilliSeconds);

			long seconds = (diiffInMilliSeconds / 1000) % 60;
             
            long minutes = (diiffInMilliSeconds / (1000 * 60)) % 60;
             
            long hours = (diiffInMilliSeconds / (1000 * 60 * 60)) % 24;
             
            long days = (diiffInMilliSeconds / (1000 * 60 * 60 * 24)) % 365;
             
            long years =  (diiffInMilliSeconds / (1000l * 60 * 60 * 24 * 365));

            System.out.println("Difference Between dates is  ");
             
            System.out.println(years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");



		}catch(ParseException pe){

			System.out.println("Please provide correct date format" + pe.getMessage());
		}

	}
}