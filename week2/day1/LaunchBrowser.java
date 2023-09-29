package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();    //to launch driver
		
		driver.get("http://www.facebook.com");    //load the url
		
		driver.manage().window().maximize();// to maximize screen
		
		//driver.close(); //to close browser when done
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("poojasri9344@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("poojashresh03");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	//	driver.findElement(By.linkText("Find your account and log in.")).click();
		String actual = "Facebook – log in or sign up";
		
		String title = driver.getTitle();
		System.out.println(title);
		//compare string
		if(title.equals(actual))
		{
			System.out.println("login succes");
		}
		else {
			System.out.println("login failed");
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}


}
