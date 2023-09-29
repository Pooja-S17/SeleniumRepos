package week3.day2ListHomeAss;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAmazon {

	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		 
		driver.get("https://www.amazon.in/"); //load url

		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Phones");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("(//div[@Class='s-suggestion-container'])[1]")).click();
		
		//find total phone on page
		List<WebElement> totalphone = driver.findElements(By.xpath("//span[@Class='a-price-whole']"));
		int total = totalphone.size();
		System.out.println("Total phones on page:"+total);
		
		//to get all price
		for(int i = 0;i<total;i++) {
			System.out.println(totalphone.get(i).getText());
		}  
		
		 List<Integer> phonePrices = new ArrayList<>();

	    // converting to integers   
	        for (WebElement price : totalphone) {
	            String priceText = price.getText().replace("₹", "").replace(",", "").trim();
	            int price1 = Integer.parseInt(priceText);
	            phonePrices.add(price1);
	        }
	        Collections.sort(phonePrices);
	        int lowestPrice = phonePrices.get(0);
	        System.out.println("The lowest price for a phone is :" + lowestPrice);
	        
		

		

	}
}
