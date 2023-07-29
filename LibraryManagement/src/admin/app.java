package admin;

import java.util.Scanner;

public class app {
	static void display() throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		login login  =  new login();
		
		while(true)
		{
			System.out.println("Library Management");
			System.out.println("1..> LOGIN");
			System.out.println("2..> SIGNUP");
			System.out.println("3..X EXIT");
			System.out.println("Enter your prefrance");
			int choice = sc.nextInt();
			switch (choice) 
			{
				case 1: 
				{
					login.newlogin();
					break;
				}
				case 2:
				{
					login.newsignup();
					break;
				}
				case 3 :
				{
					System.exit(0);
					break;
				}
				default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
		
	public static void main(String[] args) throws InterruptedException
	{
		display();
	}
}
