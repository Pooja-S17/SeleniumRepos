package week3.day1;

public class Reversestring {
	public static void main(String args[]) {
	String companyname = "Test Leaf";
	char[] charArray = companyname.toCharArray();
	
	for(int i = charArray.length -1;i>=0;i--) {
		System.out.print(charArray[i]);
		
	}
}
}