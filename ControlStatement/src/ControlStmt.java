public class ControlStmt {
    public static void main(String[] args) {
        int x = 5;
        
        System.out.println("If else ladder : ");
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }
        
        System.out.println();
        System.out.println("Switch case : ");
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("x is not 1, 2, or 3");
                break;
        }
        
        System.out.println();
        System.out.println("For loop : ");
        System.out.print("Printing Numbers from 1 to 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        
        
        System.out.println();
        System.out.println("While loop : ");
        int i = 1;
        System.out.print("printing Numbers from 1 to 5 : ");
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        System.out.println();
        System.out.println("Do While Loop : ");
        i = 1;
        System.out.print("printing Numbers from 1 to 5 : ");
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();
        
        System.out.println();
        System.out.println("For loop with jump stmt for X=3: ");
        System.out.print("printing Numbers from 1 to 5: ");
        for ( i = 1; i <= 5; i++) {
        	if(i==3) {
        		continue;
        	}
            System.out.print(i + " ");
        }
    }
}
