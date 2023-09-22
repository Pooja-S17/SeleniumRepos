package marathonex1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		 
		driver.get("https://www.abhibus.com/"); //load url
		
		driver.findElement(By.id("bus-link")).click();
		
	
	    driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	    
	    
	    driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
	    driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
	    driver.findElement(By.xpath("//span[@data-date='23']")).click();
	    
	    driver.findElement(By.xpath("//a[@Class='btn active text tertiary md active button'][1]")).click();
	    
        String bus_title = driver.findElement(By.xpath("//h5[@Class='title'][1]")).getText();
        System.out.println("First resulting bus:"+bus_title);
        
        driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
        
       driver.findElement(By.xpath("//button[@Class='btn bus-info-btn filled primary sm inactive button']")).click();
        
      //  driver.findElement(By.xpath("(//button[@Class='seat horizontal'])[5]")).click();
        
		driver.findElement(By.xpath("//span[text()='SL1']")).click();
		
        driver.findElement(By.xpath("(//input[@Class='primary  '])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@Class='primary  '])[2]")).click();
        Thread.sleep(1000);
        
        
		WebElement resultingseat = driver.findElement(By.xpath("(//div[@id='seat-availability-info']//h6)"));
		String available_seat = resultingseat.getText();
		System.out.println("seat count:"+ available_seat);
		
        
        
        //print selected seats and total fair
	//	driver.findElement(By.xpath("//span[text()='SL1']")).click();
		WebElement seat_selected =driver.findElement(By.xpath("//span[text()='Seat Selected :']/span"));
		String selected_seat = seat_selected.getText();
		System.out.println("selected seat:"+selected_seat);
		
	

		WebElement fare =  driver.findElement(By.xpath("//span[text()='Base Fare :']/span"));
		String bus_fare = fare.getText();
		System.out.println("Toatal fare:"+bus_fare);         
	

		String title = driver.getTitle();
		
		String actual = "Chennai to Bangalore Bus Ticket Booking at AbhiBus";
		
		System.out.println(title);
		
		if (title.equals(actual)) {
			System.out.println("Title retrieved");
			
		} else {
			System.out.println("Title not retrieved");

		}

	     
	     driver.close();
	     
	     
	     
	}

}
