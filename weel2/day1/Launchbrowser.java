package weel2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();    //to launch driver
		
		driver.get("http://www.facebook.com");    //load the url
		
		driver.manage().window().maximize();// to maximize screen
		
		//driver.close(); //to close browser when done
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
	}

}
