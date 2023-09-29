package week2.HomeAss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		
		WebElement select = driver.findElement(By.name("industryEnumId"));
		
		Select opt=new Select(select);
		
		opt.selectByIndex(2);
		
		WebElement select1 = driver.findElement(By.name("ownershipEnumId"));
		
		Select opt1=new Select(select1);
		
		opt1.selectByVisibleText("S-Corporation");
		
		WebElement select2 = driver.findElement(By.name("dataSourceId"));
		
		Select opt2=new Select(select2);
		
		opt2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement select3 = driver.findElement(By.id("marketingCampaignId"));
		
		Select opt3=new Select(select3);
		
		opt3.selectByIndex(7);
		
		WebElement select4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select opt4=new Select(select4);
		
		opt4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(10000);
		
		driver.close();

	}
}
