package week3.day2HomeAss;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String args[]) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();  //maximize window
	
	 
	driver.get("https://www.ajio.com/"); //load url
	driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@Class='ic-search']")).click();
	
	driver.findElement(By.xpath("(//div[@Class='facet-linkhead'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@Class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	Thread.sleep(2000);
	
	//printing total products count on page
	String images_count = driver.findElement(By.xpath("//div[@class='length']")).getText();
			
	System.out.println("Total number of images:"+images_count);
	
	//list of brand is products displayed an print the list
    List<WebElement> brandElements = driver.findElements(By.xpath("//div[@class='brand']"));
    System.out.println("List of brands:");
    for (WebElement brandElement : brandElements) {
        System.out.println(brandElement.getText());
    }
    Thread.sleep(3000);
   // Get the list of product names
    List<WebElement> productElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
    System.out.println("\nList of Bag names:");
    for (WebElement productElement : productElements) {
        System.out.println(productElement.getText());
    }
    
   
	
	
}
}
