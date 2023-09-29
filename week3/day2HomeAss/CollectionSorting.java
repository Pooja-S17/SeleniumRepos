package week3.day2HomeAss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	
	public static void main(String[] args) {
		String[] a =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		
		// Create a List and add elements from the array
        List<String> list = new ArrayList<>();
        for (String element : a) {
            list.add(element);
        }
		Collections.reverse(list);
		
		System.out.println("Reversed Collection:");
        for (String element : list) {
            System.out.println(element);
        }
      
	}

}
