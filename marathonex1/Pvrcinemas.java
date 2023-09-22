package marathonex1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pvrcinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		 
		driver.get("https://www.pvrcinemas.com/"); //load url
		
		driver.findElement(By.xpath("//span[@Class='icon-glow cursor_pointer']")).click();
		
		WebElement movieLibraryLink = driver.findElement(By.xpath("//a[text()='Movie Library']"));
        movieLibraryLink.click();
		
        //select city genre language
        WebElement Dropdown1 = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genre = new Select(Dropdown1);     
		genre.selectByVisibleText("ANIMATION");
		
		WebElement Dropdown2 = driver.findElement(By.xpath("//select[@name='lang']"));	
		Select language = new Select(Dropdown2);
		language.selectByVisibleText("ENGLISH");
        
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//option[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//option[text()='PVR Theyagaraja Thiruvanmiyur Chennai']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@Class='pvr-datepicker']")).click();
		driver.findElement(By.xpath("(//span[text()='29'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='timings']")).click();
		driver.findElement(By.xpath("//option[text()='06:00 PM - 09:00 PM']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("noOfTickets")).sendKeys("3");	
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Arsh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("poojasri9344@gmail.com");	
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9344053019");
		Thread.sleep(2000);
		
		WebElement option = driver.findElement(By.xpath("//select[@name='food']"));
		Select fb = new Select(option);     
		fb.selectByVisibleText("Yes");
		
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("NIL");
		driver.findElement(By.xpath("//label[@Class='custom-control custom-radio']")).click();
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(10000);
		

		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		String title = driver.getTitle();
		
		String actual = "Movie Library";
		
		System.out.println(title);
		
		if (title.equals(actual)) {
			System.out.println("Title Retrieved");
			
		} else {
			System.out.println("Title not Retrieved");

		}

		driver.close();
		
	}

}
