package week3.day2HomeAss;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
			
	 int[] numbers = {1, 2, 3, 4, 10, 6, 8};
      
     Arrays.sort(numbers);
         
     for (int i = 0; i < numbers.length - 1; i++) {
     // Checking in the sequence of numbers
     if (numbers[i] + 1 != numbers[i + 1]) {
     // Printing missing numbers between the current and next element
      for (int j = numbers[i] + 1; j < numbers[i + 1]; j++) {
                 System.out.println("Missing number: " + j);
             }
         }
     }
}
}
