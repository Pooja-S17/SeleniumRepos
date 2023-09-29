package week3.day2HomeAss;

public class RemoveDuplicateWords {

	 public static void main(String[] args) {
	        String input = "We learn Java basics as part of java sessions in java week1";
	        String[] words = input.split(" ");
	        int count = 0;
	        
	        for (int i = 0; i < words.length - 1; i++) {
	            if (!words[i].equals("")) {
	                for (int j = i + 1; j < words.length; j++) {
	                    if (words[i].equalsIgnoreCase(words[j])) {
	                        words[j] = ""; // Replace duplicate with empty string
	                        count++;
	                    }
	                }
	            }
	        }

	        for (String word : words) {
	            if (!word.equals("")) {
	                System.out.print(word + " ");
	            }
	        }
	        
	        
	 }
}