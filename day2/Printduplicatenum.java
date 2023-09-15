package week1.day2;

import java.util.Arrays;

public class Printduplicatenum {
	static int i = 0;
	
	public static void main(String[] args) {
		int[] num = {1,2,8,44,66,5,9,5,2};
		for (int i = 0;i<num.length;i++)
		{
			for(int j = i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
					
				System.out.println("duplicate values:"+num[j]);
			}
		}
		
		System.out.println("*********");
		
		// using 1 for loop
		
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i]==num[i+1])
				System.out.println("duplicate values:"+num[i+1]);
		}
	}
	

}
