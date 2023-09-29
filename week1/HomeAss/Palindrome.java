package week1.HomeAss;

public class Palindrome {

	public static void main(String[] args) {
		String original = "racer";
		String reverse = "";
		
		original.toCharArray();
		
		for(int i = original.length()-1;i>=0;i--) {
			reverse = reverse +original.charAt(i);
			
		}
		if(original.equals(reverse)) {
			System.out.println("String is palindrome:"+original);
		}
		else {
			System.out.println("String is not palindrom");
		}
	}

}
