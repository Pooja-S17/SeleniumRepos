package week3.day1;

public class MethodOL {
	
	public void reportStep() {
		System.out.println("Report Step");
	}
	public void reportStep(String msg, String status) {
        System.out.println("Step1:" + msg + ",status:" + status);
    }

    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("Step2:" + msg + ",status:" + status);
        if (snap) {
            System.out.println("Taking snapshot");
        }
    }

    public static void main(String[] args) {
        MethodOL reportUtil = new MethodOL();
        
        reportUtil.reportStep("Browser opened", "Passed");

        reportUtil.reportStep("Acess website", "Passed", true);

        reportUtil.reportStep("Not able to login", "Failed", false);
}
}