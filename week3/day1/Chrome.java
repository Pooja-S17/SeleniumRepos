package week3.day1;

public class Chrome extends BrowserGp {

	
	public void openIncognito() {
		System.out.println("openincognito");
	}
	public void clearcache() {
		System.out.println("clearcache");
		
	}
	public static void main(String[] args) {
		Chrome Chromebrowser = new Chrome();
		System.out.println("Browser name:"+Chromebrowser.browsername);
		System.out.println("Browser verison:"+Chromebrowser.browserversion);
		
		Chromebrowser.openURL();
        Chromebrowser.openIncognito();
        Chromebrowser.clearcache();
        Chromebrowser.navigateBack();
	}
	
	
}
