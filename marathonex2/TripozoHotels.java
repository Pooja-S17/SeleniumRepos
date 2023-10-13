package marathonex2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TripozoHotels {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		 
		driver.get("https://www.tripozo.com/"); //load url
		
		driver.findElement(By.xpath("(//span[@class='ant-menu-title-content']//a)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ant-select-selection-search-input']")).sendKeys("Goa");
		driver.findElement(By.xpath("(//div[contains(@class,'airport_name f-vcenter')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Check-In & Check-Out Date']/following::input")).click();
		driver.findElement(By.xpath("//div[text()='13']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Check-In & Check-Out Date']/following::input)[2]")).click();
		driver.findElement(By.xpath("//div[text()='14']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Search']")).click();
		Thread.sleep(2000);
		Actions obj = new Actions(driver);
		WebElement Amenities = driver.findElement(By.xpath("//span[text()=' Amenities']"));
		obj.moveToElement(Amenities).perform();
		driver.findElement(By.xpath("//input[@class='ant-checkbox-input']")).click();
		driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/p[7]/label[1]/span[1]/input[1]")).click();
		WebElement Parking = driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/p[10]/label[1]/span[1]/input[1]"));
		obj.moveToElement(Parking).perform();
		WebElement Restaurant =	driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/p[11]/label[1]/span[1]/input[1]"));
		obj.moveToElement(Restaurant).perform();
		
		WebElement StarRtaing = driver.findElement(By.xpath("//span[text()=' Star Rating']"));
		obj.moveToElement(StarRtaing).perform();
		driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[6]/label[1]/span[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Choose']")).click();
		
		WebElement Checkin = driver.findElement(By.xpath("//p[text()='13 Oct 2023']"));
		System.out.println(Checkin.getText());
		
		WebElement viewroom = driver.findElement(By.xpath("//button[text()='View Rooms']"));
		obj.moveToElement(viewroom).perform();
		
		//WebElement chooseroom = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default']//span"));
		//obj.moveToElement(chooseroom).perform();
		
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default']//span")).click();
		
		//WebElement roomamenities = driver.findElement(By.xpath("(//span[contains(@class,'blocklink blnk-small')])[3]"));
		//obj.moveToElement(roomamenities).perform();
		
	    WebElement roomamenities =	driver.findElement(By.xpath("(//span[@class='blocklink blnk-small blnkB rnd5 pdlr5 pointer'])[1]"));
		
        File scr3 = roomamenities.getScreenshotAs(OutputType.FILE);       
        File des3 = new File("./snaps/img2.png");
        FileUtils.copyFile(scr3, des3); 
	}

}
