package week1.HomeAss;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array1 = {3, 9, 4, 6, 11, 13};
        int[] array2 = {1, 11, 8, 13, 9, 7};

        
        for (int i = 0; i < array1.length; i++) {
            
            for (int j = 0; j < array2.length; j++) {
                
                if (array1[i] == array2[j]) {
                    
                    System.out.println("Intersected Element: " + array1[i]);
                }
            }
        }
	}
}
