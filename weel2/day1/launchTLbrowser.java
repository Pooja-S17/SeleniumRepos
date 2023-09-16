package weel2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchTLbrowser {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();    //to launch driver
		
		driver.get("http://leaftaps.com/opentaps/control/main");    //load the url
		
		driver.manage().window().maximize();// to maximize screen
		
		//driver.close(); //to close browser when done
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//step1 locator dropdown webelement
		//ctrl+2,l -> return type -> web element
		WebElement select = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//step 2 create obj for select class
		
		Select opt = new Select(select);
		
	
		
		opt.selectByIndex(4);

		WebElement select1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select opt1=new Select(select1);
		
		opt1.selectByVisibleText("Automobile");
		
		WebElement select2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select opt2=new Select(select2);
		
		opt2.selectByValue("OWN_CCORP");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jadzz");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("deli");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("verse");
		

		driver.findElement(By.className("smallSubmit")).click();
	}

}
