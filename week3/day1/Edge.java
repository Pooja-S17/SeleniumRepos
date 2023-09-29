package week3.day1;

public class Edge extends Chrome {

	public void takeSnap() {
		System.out.println("takeSnap");
	}
	public void clearCookies() {
		System.out.println("clearCookies");
		
	}
	public static void main(String args) {
		Edge cb = new Edge();
		System.out.println("Browsername:"+cb.browsername);
		System.out.println("Browserversion:"+cb.browserversion);
		cb.navigateBack();
		cb.openURL();
		cb.openIncognito();
		cb.closeBrowser();
		cb.takeSnap();
		cb.clearCookies();
	}
}
