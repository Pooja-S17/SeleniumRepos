package week4.day1;
import java.util.LinkedHashSet;
import java.util.Set;
public class LearnSet {

	public static void main(String[] args) {
		String name = "google";
		char[] charArray = name.toCharArray();
		Set<Character> uniq = new LinkedHashSet<Character>();
		
		for(Character ch : charArray) {
			uniq.add(ch);			
		}
		System.out.println(uniq);
	}
}
