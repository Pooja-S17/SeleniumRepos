package week3.day2HomeAss;

import java.util.ArrayList;
import java.util.List;
public class Intersection {
  
	public static void main(String[] args) {
		int array1[] = {3, 2, 11, 4, 6, 7};
	    int array2[] = {1, 2, 8, 4, 9, 7};
	    
	   /* method 1 
	    for(int i = 0;i<array1.length;i++) {
	    	for(int j = 0;j<array2.length;j++) {
	    		if(array1[i] == array2[j]) {
	    			System.out.println("Intersection ofArrays:"+array1[i]);
	    		}
	    	}
	    }  */
	    
	    //method 2
	    List<Integer> list1 = new ArrayList<Integer>();
        for (int num : array1) {
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<Integer>();
        for (int num : array2) {
            list2.add(num);
        }
       
        System.out.print("Intersection of arrays:\n");
        for (int num : list1) {
            if (list2.contains(num)) {
                System.out.println(num + " ");
	    
	}
        
}
        
}
}

