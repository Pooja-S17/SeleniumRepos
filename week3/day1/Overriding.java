package week3.day1;

public class Overriding extends Subclass{
	
	public void college(int a) {
		System.out.println("Ethiraj college");
		System.out.println(a);
		
	}
	public static void main(String args[]) {
		Overriding Ex = new Overriding();
		Ex.college(3);
	}

}