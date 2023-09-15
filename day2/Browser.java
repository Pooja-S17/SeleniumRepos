package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched succefuly:"+browserName);
		return browserName;
	}
	public void loadurl() {
	System.out.println("Application is loaded sucesfully");
	}
	


public static void main(String args[]) {
	Browser details = new Browser();
	details.launchBrowser("firefox");
	details.loadurl();
}
}