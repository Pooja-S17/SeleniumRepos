package week3.day2HomeAss;

import java.util.Arrays;


public class PrintSecondLargest {

	public static void main(String[] args) {
		int[] array =  {3, 2, 11, 4, 6, 7};
		System.out.println("Original array: " + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));
		
		if (array.length >= 2) {
            int secondLargest = array[array.length - 2];
            System.out.println("Second largest number: " + secondLargest);
        } else {
            System.out.println("Loop Terminated");
        }
	}
}
