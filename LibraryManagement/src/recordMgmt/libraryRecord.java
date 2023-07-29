package recordMgmt;

import java.util.Scanner;
import admin.master;

public class libraryRecord implements student, book{
	Scanner sc = new Scanner(System.in);
	@Override
	public void bookPanel() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		master master = new master();
		while(true)
		{
			System.out.println("\n==>BOOK PANEL<==");
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
		System.out.println("\n<<BOOK RECORD>>");
		for (int i = 0 ; i<3 ; i++) {
			System.out.println("Book Name : "+ bookName[i]);
		}
		
	}

	@Override
	public void studentPanel() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		master master = new master();
		while(true)
		{
			System.out.println("\n==>STUDENT PANEL<==");
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
		System.out.println("\n<<STUDENT RECORD>>");
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll no : "+ studID[i] + " Name : " + studName[i]);
		}
		
	}
	
	public void recordPanel() throws InterruptedException
	{
		while(true)
		{
			System.out.println("\n==>RECORD PANEL<==");
			System.out.println("1..> ISSUE BOOK");
			System.out.println("2..> RETURN BOOK");
			System.out.println("3..> VIEW ISSUED BOOK ");
			System.out.println("4..<<BACK<<");
			System.out.println("Enter your prefrance");
			int choice = sc.nextInt();
			switch(choice) 
			{
				case 1:
				{
					issueBook();
					break;
				}
				case 2:
				{
					returnBook();
					break;
				}
				case 3:
				{
					viewIssuedBook();
					break;
				}
				case 4:
				{
					master.adminPanel();
					break;
					
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}
		
	}
	
	
	public void issueBook() 
	{
		System.out.println("<< Issueing A book >>");
		Scanner sc = new Scanner(System.in);
		viewstud();
		System.out.println("Select rollno of student");
		int selectedID = sc.nextInt();
		
		viewBook();
		System.out.println("Select book for issue");
		sc.nextLine();
		String selectedBook = sc.nextLine();
		System.out.println(selectedBook);
		
		for(int i=0;i<5;i++)
		{
			if(studID[i]==selectedID)
			{
				issuedBook[i] = selectedBook;
				System.out.println("Book issued Succesfully");
			}
		}
		
	}

	void returnBook() {
		System.out.println("<< Returning A book >>");
		viewIssuedBook();
		System.out.println("Select id of stud to return ");
		int selectedID = sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(studID[i]==selectedID)
			{
				issuedBook[i] = null;
				System.out.println("Book return Succesfully");
			}
		}
		
	}
	
	void viewIssuedBook() {
		System.out.println("<< Issued Book Record >>");
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll no : "+ studID[i] 
					+ " Name : " + studName[i] 
					+ "BOOK : "+ issuedBook[i]);
		}
	}

}
