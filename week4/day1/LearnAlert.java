package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		driver.get("https://www.leafground.com/alert.xhtml");

		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("pooja");
		alert.accept();
		Thread.sleep(3000);
		
		
		
	WebElement text = 	driver.findElement(By.xpath("//span[@id='confirm_result']"));
	String fulltext = text.getText();
		System.out.println(fulltext);
	
		
	}

}
