package week4.day1;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandlle {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();  //maximize window
	driver.get("https://www.irctc.co.in/");
	Dimension resolution = new Dimension(1600, 900);
    driver.manage().window().setSize(resolution);
	driver.findElement(By.linkText("FLIGHTS")).click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles+" "+driver.getTitle());
	
	List<String> windows = new ArrayList<String>(windowHandles);
	driver.switchTo().window(windows.get(0));
	System.out.println(driver.getTitle());
	driver.close();
	
	
}
}
