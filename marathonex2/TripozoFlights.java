package marathonex2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripozoFlights {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		 
		driver.get("https://www.tripozo.com/"); //load url
		
		driver.findElement(By.xpath("//span[@class='ant-menu-title-content']//a")).click();
		driver.findElement(By.xpath("//input[@class='ant-select-selection-search-input']")).sendKeys("MAA");
		driver.findElement(By.xpath("//span[text()='Chennai International Airport']")).click();
		
		driver.findElement(By.xpath("(//input[@class='ant-select-selection-search-input'])[2]")).sendKeys("GOX");
		driver.findElement(By.xpath("//span[text()='New Goa Manohar International Airport']")).click();
		
		driver.findElement(By.xpath("//input[@class='ant-input']")).click();
		driver.findElement(By.xpath("(//span[text()='10']/following::input)[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'fs11 mgu2')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/p[1]/label[1]/span[1]/input[1]")).click();
		Thread.sleep(2000);
		
		String airline = driver.findElement(By.xpath("//p[@class='price-type']")).getText();
		if (airline.contains("Air India")) {
			System.out.println("displayed all selected Air India Flights");
		}
		else {
			System.out.println("not displayed");
		}
		driver.findElement(By.xpath("//button[text()='Choose']")).click();
		
		String refunds = driver.findElement(By.xpath("//span[@class='ant-tag ant-tag-green']")).getText();
		if ( refunds.contains("Refundable")) {
			System.out.println("The selected flight is Refundable");
		}
		else {
			System.out.println("The selected flight is not Refundable");
		}
		
		driver.findElement(By.xpath("//span[contains(@class,'blocklink blnk-small')]")).click();
		
        File scr1 = driver.getScreenshotAs(OutputType.FILE);       
        File des1=new File("./snaps/img1.png");
        FileUtils.copyFile(scr1, des1);  
		//driver.findElement(By.xpath("//button[@class='ant-drawer-close']")).click();
		
        driver.findElement(By.xpath("(//span[contains(@class,'blocklink blnk-small')])[2]")).click();

        File scr2 = driver.getScreenshotAs(OutputType.FILE);       
        File des2 = new File("./snaps/img1.png");
        FileUtils.copyFile(scr2, des2);  
    	//driver.findElement(By.xpath("//button[@class='ant-drawer-close']")).click();
	}
}
