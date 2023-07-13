import java.util.Scanner;

public class checkChar {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if (ch >= 'a' && ch <= 'z') {
	            System.out.println("The character is in lowercase.");
	        } else if (ch >= 'A' && ch <= 'Z') {
	            System.out.println("The character is in uppercase.");
	        } else {
	            System.out.println("Invalid input.");
	        }
	}
}
