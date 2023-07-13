import java.util.Scanner;

public class StarPattern {
	
	void reverseStarStructure(int row)
	{
		for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	    
	}
	void starStructure(int row)
	{
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
            	System.out.print("* ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		StarPattern pattern = new StarPattern();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("Printing Star Pattern");
        pattern.starStructure(row);
        
        System.out.println("Printing Reverse Star Pattern");
        pattern.reverseStarStructure(row);
            
        }
    
}
