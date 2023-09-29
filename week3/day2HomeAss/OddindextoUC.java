package week3.day2HomeAss;

public class OddindextoUC {
	public static void main(String args[]){
		String input = "changeme";
		for(int i = 0; i <input.length();i++) {
			if(i % 2 ==0 ) {
				System.out.print(input.charAt(i));
			}
			else {
				System.out.print(input.toUpperCase().charAt(i));
			}
		}	
	
}
	}