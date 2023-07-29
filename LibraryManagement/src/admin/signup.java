package admin;

import java.util.Scanner;

public class signup {
	private String Mainid="123";
	private String Mainpass="123";
	
	public void setMainid(String mainid) {
		Mainid = mainid;
	}

	public void setMainpass(String mainpass) {
		Mainpass = mainpass;
	}

	public String getMainid() {
		return Mainid;
	}

	public String getMainpass() {
		return Mainpass;
	}

	void newsignup() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter New id: ");
        String newId = sc.nextLine();
        setMainid(newId);

        System.out.println("Enter New password: ");
        String newPass = sc.nextLine();
        setMainpass(newPass);
        
        System.out.println("You have signed up successfully!");
        Thread.sleep(1000);
        
	}

}
