package admin;

import java.util.Scanner;

public class login extends signup 
{
	void newlogin() throws InterruptedException
	{
		Scanner sc= new Scanner(System.in);
		master master = new master();
		app app =new app();
		
		System.out.println("Enter id : ");
		String id = sc.nextLine();
		
		System.out.println("Enter Password : ");
		String pass = sc.nextLine();
		
		String Mid = getMainid();
		String Mpass = getMainpass();
		
		
		if(Mid.equals(id) && Mpass.equals(pass))
		{
			System.out.println("Password Match");
			Thread.sleep(100);
			master.adminPanel();
			
		} 
		else {
			System.out.println("Wrong Password");
			Thread.sleep(100);
			app.display();
		}
	}
}
