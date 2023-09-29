package week1.HomeAss;

public class Fibonacci {

	public static void main(String[] args) {
		int i = 1,n=10,first = 0,second = 1;
		System.out.println("Fibonacci series of"+n+"terms:");
		
		while(i<n) {
			System.out.println(first);
			int next = first + second ;
			first = second ;
			second = next;
			i++;
		}
		
	}
}
