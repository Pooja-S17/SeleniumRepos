package week3.day2HomeAss;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		//checking the length of two strings are equal or not
		if(text1.length() == text2.length()) {
			System.out.println("continue");
		}
		else {
			System.out.println("Lengths mismatch,Strings are not anagram");
		}
		//converting string -> charArray
		char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();
        
        //sorting charArray
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
	}
}
