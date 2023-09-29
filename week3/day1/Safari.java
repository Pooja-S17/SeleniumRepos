package week3.day1;

public class Safari extends Edge {

	public void readerMode() {
		System.out.println("readerMode");
	}
	public void fullScreenMode() {
		System.out.println("fullScreenMode");
		
	}
	public static void main(String[] args) {
		Safari cbs = new Safari();
		System.out.println("Browsername:"+ cbs.browsername);
		System.out.println("Browserversion:"+cbs.browserversion);
		cbs.navigateBack();
		cbs.openURL();
		cbs.openIncognito();
		cbs.closeBrowser();
		cbs.takeSnap();
		cbs.clearCookies();
		cbs.readerMode();
		cbs.fullScreenMode();
	}
		
	}


