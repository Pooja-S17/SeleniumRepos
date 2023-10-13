package week5.day2HomeAss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day1.ProjectSpecificMethod;


public class CreateLead extends ProjectSpecificMethod{
	
	@DataProvider(name = "fetchData", indices = {0,2})
	public String[][] sendData(){
		String[][] data = new String[3][3];
		data[0][0] = "Testleaf";
		data[0][1] = "dilip";
		data[0][2] = "v";
		
		data[0][0] = "Testleaf";
		data[0][1] = "gokul";
		data[0][2] = "v";
		
		data[0][0] = "Testleaf";
		data[0][1] = "muthu";
		data[0][2] = "v";
		
		return data;
		
	}
	
@Test(dataProvider = "fetchData")
	public void createTest(String comName, String fName, String lName) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("comName");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lName");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
}
}


