package week2.HomeAss;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
public class DeleteLead {

public static void main(String[] args) {
	

	EdgeDriver driver=new EdgeDriver();
	
	driver.get("http://leaftaps.com/opentaps/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Find Leads")).click();
	
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	driver.findElement(By.name("phoneNumber")).sendKeys("9789789789");
	
	driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
	
	driver.findElements(By.xpath("//div[@class='x-toolbar x-small-editor']")).clear();
	
}
	
}
