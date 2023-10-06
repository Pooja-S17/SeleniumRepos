package week4.HomeAss;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//div[@class='crmsfa']//img[1]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Thread.sleep(1000);	
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));			
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		Thread.sleep(1000);
		driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();	
		List<String> windows1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		driver.switchTo().window(windows.get(0));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
	}
}
