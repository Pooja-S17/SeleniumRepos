package week4.HomeAss;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		driver.get("https://buythevalue.in/");
		
		driver.findElement(By.xpath("(//a[@Class='grid-image'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("wk_zipcode")).sendKeys("600041");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[@class='success-message show-cart']//a)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}
}
