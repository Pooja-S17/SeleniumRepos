package week5.day1;

import org.testng.annotations.*;

public class LearnAnnotations {
	@Test
	void createlead() {
		System.out.println("---Create Lead---");
	}
	@Test
	void editlead() {
		System.out.println("---Edit Lead---");
	}
	@BeforeClass
	void beforeclass(){
		System.out.println("Before class");
	}
	@AfterClass
	void afterclass() {
		System.out.println("After class");
	}
	@BeforeMethod
	void beforemethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	void aftermethod() {
		System.out.println("After method");
	}
	@BeforeSuite
	void beforesuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	void aftersuite() {
		System.out.println("After suite");
	}
}
