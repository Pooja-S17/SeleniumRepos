package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListFb {

	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //open app
		
		driver.manage().window().maximize(); 
		
		List<WebElement> images = driver.findElements(By.tagName("a")); //find total number of images in homepage
		int total =images.size();
		System.out.println("Total number of images:"+total);
		

		for(int i = 0;i<total;i++) {
			System.out.println(images.get(i).getText());
		}
		
		
		}
}