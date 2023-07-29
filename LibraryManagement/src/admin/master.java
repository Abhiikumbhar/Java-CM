package admin;

import java.util.Scanner;

import recordMgmt.libraryRecord;

public class master {
	public static void adminPanel() throws InterruptedException
	{
		Scanner sc =new Scanner(System.in);
		libraryRecord lib = new libraryRecord();
		app app =new app();
		while(true) {
			
			System.out.println("\nADMIN PANEL");
			System.out.println("1..> STUDENT RECOERD");
			System.out.println("2..> BOOK RECOERD");
			System.out.println("3..> MANAGE BOOKS");
			System.out.println("4..<<BACK<<");
			System.out.println("Enter your prefrance");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					lib.studentPanel();
					break;
				}
				case 2:
				{
					lib.bookPanel();
					break;
				}
				case 3:
				{
					
				}
				case 4:
				{
					app.display();
					break;
	
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
}
