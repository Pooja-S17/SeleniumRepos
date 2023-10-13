package marathonex2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatcliq {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();  //maximize window
		
		driver.get("https://www.tatacliq.com"); //load url
		
	     driver.findElement(By.id("wzrk-cancel")).click();
	  
		 WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(brands).click().perform();
	     WebElement watchesSubMenu = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
	     actions.moveToElement(watchesSubMenu).click().perform();
	     
	    driver.findElement(By.xpath("//div[text()='Featured brands']/following-sibling::div")).click();
	     
	    Select sortByDropdown = new Select(driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']//select[1]")));
        sortByDropdown.selectByVisibleText("New Arrivals");
	     
        WebElement categories = driver.findElement(By.xpath("//div[text()='Category']"));
		actions.moveToElement(categories).perform();
		
		driver.findElement(By.xpath("//div[@class='CheckBox__base']")).click();
		 Thread.sleep(2000);
		 List<WebElement> brandElements = driver.findElements(By.xpath("//h3[@class='ProductDescription__boldText']"));
		 System.out.println("List of Prices:");
		 for (WebElement brandElement : brandElements) {
		        System.out.println(brandElement.getText());
		    }
		 Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
						
		WebElement cartIcon = driver.findElement(By.xpath("//span[text()='1']"));
        System.out.println("Cart Count: " + cartIcon.getText());

       //Click on cart
        cartIcon.click();

        File scr4 = driver.getScreenshotAs(OutputType.FILE);       
        File des4 = new File("./snaps/img3.png");
        FileUtils.copyFile(scr4, des4); 
        
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList<String>(windowHandles);
    	driver.switchTo().window(windows.get(0));
            
        }
	}

