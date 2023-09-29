package week3.day2HomeAss;

public class ReverseOddPosition {

	public static void main(String[] args) {
		
		        String input = "I am a software tester";
		        String[] split = input.split(" ");
		        
		        for (int i = 0; i < split.length; i++) {
		            if (i % 2 != 0) { 
		                 char[] charArray = split[i].toCharArray();
		                for (int j = charArray.length - 1; j >= 0; j--) {
		                    System.out.print(charArray[j]);
		                }
		            } else {
		                System.out.print(split[i]);
		            }
		            
		            if (i <split.length - 1) {
		                System.out.print(" ");
		            }
		        }
		    }
	
}
