package week1.HomeAss;

public class Primenum {

	public static void main(String[] args) {
		int num = 1;
		boolean flag = false;
		for(int i =2; i<=num/2; i++)
		{
			if(num%1==0) {
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not a prime number");
	}
	
}
