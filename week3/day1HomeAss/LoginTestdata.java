package week3.day1HomeAss;

public class LoginTestdata extends Testdata{
	public void enterUsername() {
		System.out.println("username");
	}
	public void enterPassword() {
		System.out.println("password");
	}
	public static void main(String args[]) {
		LoginTestdata td = new LoginTestdata();
		System.out.println("enter username:"+td.username1);
		System.out.println("enter password:"+td.password1);
		td.enterCredentials();
		td.navigateToHomePage();
		td.enterUsername();
		td.enterPassword();
		
		
	}
	

}
