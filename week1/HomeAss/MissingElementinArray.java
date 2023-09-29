package week1.HomeAss;

import java.util.Arrays;

public class MissingElementinArray {

	public static void main(String[] args) {
		int[] array = {1, 4, 3, 2, 8, 6, 7};
        
        Arrays.sort(array);
        
        int missing = 0;
        
        
        for (int i = array[0]; i <= array[array.length - 1]; i++) {
            
            if (Arrays.binarySearch(array, i) < 0) {
                missing = i;
                break; 
            }
        }
        System.out.println("Missing Element in Array: " + missing);
		
	}

}
