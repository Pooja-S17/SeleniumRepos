package week5.day1HomeAss;

import org.testng.annotations.*;

public class ProjectSpecificMethod {
	String url;
	String username;
	String password;
	@BeforeMethod
	void precondition() {
		this.url = "www.amazon.com";
		this.username = "pooja";
		this.password = "abc@123" ;
		System.out.println("preconditon:\nurl:"+url+",username:"+username+",password:"+password);
	}
	@AfterMethod
	void postcondition() {
		System.out.println("postcondition: closing browser");
	}
	
}
