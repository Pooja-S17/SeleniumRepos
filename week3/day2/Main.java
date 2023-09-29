package week3.day2;

public class Main {
	public static void main(String[] args) {
		
		 String value = "TestLeaf";
	        char targetChar = 'e';
	        int count = 0;
	       
	        char[] charArray = value.toCharArray();	          
	        for (char c : charArray) {	           
	        	if (c == targetChar) {
	                count++; 
	            }
	        }
	       
	        System.out.println("count of '" + targetChar + "' is: " + count);
	    }
	}