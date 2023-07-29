package recordMgmt;

import java.util.Scanner;
import admin.master;

public class libraryRecord implements student, book{

	@Override
	public void bookPanel() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		master master = new master();
		while(true)
		{
			System.out.println("\nBOOK PANEL");
			System.out.println("1..> ADD BOOKS");
			System.out.println("2..> VIEW BOOKS");
			System.out.println("3..<<BACK<<");
			System.out.println("Enter your prefrance");
			int choice = sc.nextInt();
				switch (choice) {
				case 1: 
				{
					addBook();
					break;
				}
				case 2:
				{
					viewBook();
					break;
				}
				case 3:
				{
					master.adminPanel();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
		}
		
	}

	@Override
	public void addBook() {
		Scanner sc= new Scanner(System.in);

		System.out.println("Adding 3 Books into Record");
		for (int i=0;i<3;i++)
		{
			System.out.print("Enter Name of Book "+ (i+1) +" :");
			bookName[i]= sc.nextLine();			
		}
		
	}

	@Override
	public void viewBook() {
		System.out.println("BOOK RECORD");
		for (int i = 0 ; i<3 ; i++) {
			System.out.print("Book Name : "+ bookName[i]);
		}
		
	}

	@Override
	public void studentPanel() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		master master = new master();
		while(true)
		{
			System.out.println("\nSTUDENT PANEL");
			System.out.println("1..> ADD STUDENTS");
			System.out.println("2..> VIEW STUDENTS");
			System.out.println("3..<<BACK<<");
			System.out.println("Enter your prefrance");
			int choice = sc.nextInt();
				switch (choice) {
				case 1: 
				{
					addstud();
					break;
				}
				case 2:
				{
					viewstud();
					break;
				}
				case 3:
				{
					master.adminPanel();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
		}
		
	}

	@Override
	public void addstud() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adding Roll no & Name of % student\n");
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Roll no of "+ (i+1) + " student : ");
			studID[i] = sc.nextInt();
			
			System.out.print("Enter Name of "+ (i+1) + " student  : ");
			sc.nextLine();
			studName[i]= sc.nextLine();
		}
		System.out.println("Student data Added Succesfully");
		
	}

	@Override
	public void viewstud() {
		System.out.println("Student record ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll no : "+ studID[i] + " Name : " + studName[i]);
		}
		
	}

}
