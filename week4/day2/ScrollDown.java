package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {


	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		driver.get("https://www.amazon.in/");

		WebElement findElement = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		Actions obj = new Actions(driver);
		obj.scrollToElement(findElement).perform();
		
		String text = findElement.getText();
        System.out.println("Conditions of Use and Sale: " + text);
   /*     
        //step-1-snap
        File scr = user.getScreenshotAs(OutputType.FILE);
        
        //step-2-folder
        File des=new File("./snaps/img1.png");
        
        //step3
        FileUtils.copyFile(scr, des);  */
		
	}

}

