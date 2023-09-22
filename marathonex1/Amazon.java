package marathonex1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		 
		driver.get("https://www.amazon.in/"); //load url
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Bags for b");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@Class='s-suggestion-container'])[1]")).click();
		
		//printing total number of results
		
		List<WebElement> images = driver.findElements(By.tagName("img")); 
		System.out.println("Total number of images:"+images.size());
		WebElement result = driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']/parent::div"));
	    String fulltext =	result.getText();
		System.out.println(fulltext);
		
	
		 driver.findElement(By.xpath("(//li[@Class='a-spacing-micro'])[6]")).click();
		 
		 //sortby
		
		 WebElement sortDropdown = driver.findElement(By.xpath("//span[text()='Sort by:'] "));
	     sortDropdown.click();
	     WebElement newArrivalsOption = driver.findElement(By.xpath("(//a[text()='Newest Arrivals'])"));
	     newArrivalsOption.click();
	     
	     WebElement result1 = driver.findElement(By.xpath("//span[text()='RON Laptop Backpack 01 BLACK']"));
		 String fulltext1 =	result1.getText();
		 System.out.println(fulltext1);
			
		 
	     WebElement result2 = driver.findElement(By.xpath("(//span[@Class='a-price a-text-price']//span)[1]"));
		 String fulltext2 =	result2.getText();
		 System.out.println(fulltext2);
			
	   
	     	String title = driver.getTitle();
			
			String actual = "Amazon.in : bags for boys";
			
			System.out.println(title);
			
			if (title.equals(actual)) {
				System.out.println("Title retrieved");
				
			} else {
				System.out.println("Title not retrieved");

			}

	}
	
}
