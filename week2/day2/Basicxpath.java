package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicxpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();    //to launch driver
		
		driver.get("http://leaftaps.com/opentaps/control/main");    //load the url
		
		driver.manage().window().maximize();// to maximize screen
		
		
		}

}
