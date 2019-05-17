import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Iterator;

class SortByUsinghHashMap{
	

		public static void main(String[] args) {
			
			HashMap mp = new HashMap();

			mp.put("Ganesh",12343);
			mp.put("Akash",12432);
			mp.put("Naina",46456);
			mp.put("DIvya",13234);
			mp.put("Naveen",34252);
			mp.put("Ankit",64321);
			mp.put("Sanket",98655);
			mp.put("Mangesh",45647);
			mp.put("Hello",64564);

			List listOfValues = SortByUsinghHashMap.getValues(mp);
		
			Iterator iterate = listOfValues.iterator();

			while(iterate.hasNext()){
				System.out.println("value  "+iterate.next());
			}
		}

		public static List getValues(HashMap map){


				Set set = map.entrySet();

				ArrayList  list = new ArrayList();

				for (Object obj : set) {

					Map.Entry mpEntry = (Map.Entry)obj;

					list.add(mpEntry.getValue());
					
				}

				Collections.sort(list);
				return list;






		}

}