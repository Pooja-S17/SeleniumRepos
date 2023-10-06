package week4.HomeAss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class Amazon {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximizing window
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("oneplus 9 pro");
		searchBox.submit();
		//prining price of first product
		WebElement Pricefp = driver.findElement(By.xpath("//span[text()='37,999']"));
		String productPrice = Pricefp.getText();
		System.out.println("Price of the first product: " + productPrice);

		//priting customer rating
		WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		String customerratings = ratings.getText();
		System.out.println("Number of Customer Ratings :" +customerratings);
		driver.findElement(By.xpath("//span[text()='(Refurbished) OnePlus 9 Pro 5G (Pine Green, 12GB RAM, 256GB Storage)']")).click();
		for (String obj : driver.getWindowHandles()) {
			driver.switchTo().window(obj);
		}

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		//taking snapshot
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./snaps/img1.png");
		FileUtils.copyFile(scr, des);

		WebElement AddToCart = driver.findElement(By.id("add-to-cart-button"));
		AddToCart.click();
		WebElement cartsubtotal = driver.findElement(By.xpath("//span[@id ='attach-accessory-cart-subtotal']"));
		String total = cartsubtotal.getText();
		String cartTotal = "SubTotal(1 item) :" +Pricefp;
		if (total.equals(cartTotal)){
			System.out.println("Cart total matches" +total);
	 
		}else {
			System.out.println("Cart total does not match" +total);
 
	 
 }
	Set<String> windowHandles = driver.getWindowHandles();

	List<String>windows = new ArrayList<String>(windowHandles);
	driver.switchTo().window(windows.get(1));
	
	driver.close();
	}

}
