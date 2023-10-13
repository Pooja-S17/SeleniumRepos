package week5.day2HomeAss;



import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificMethod;

public class EditLead extends ProjectSpecificMethod{
	
	

	@DataProvider(name = "fetchData")
	public String[][] sendData(){
		String[][] data = new String[2][2];
		data[0][0] = "100";
		data[0][1] = "CTS";
				
		data[0][0] = "101";
		data[0][1] = "ZOHO";
			
		return data;
		
	}
	
	@Test(dataProvider = "fetchData")
	public void editTest(String phonenum, String compname){
			
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys();
		driver.findElement(By.name("submitButton")).click();
	//	driver.close();
}
}
