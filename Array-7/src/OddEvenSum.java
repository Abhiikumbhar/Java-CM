import java.util.Scanner;

public class OddEvenSum 
{
	public static void main(String[] args) 
	{
		Scanner SC = new Scanner(System.in);
		int numbers[]=new int[7];
		System.out.println("Enter the elements:");

        for (int i = 0; i < numbers.length ; i++) 
        {
            numbers[i] = SC.nextInt();
        }

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int number : numbers)
        {
            if (number % 2 == 0) 
            {
            	sumOfEven += number;
            } 
            else 
            {
            	sumOfOdd += number;
            }
        }

        System.out.println("Sum of even no: " + sumOfEven);
        System.out.println("Sum of odd no: " + sumOfOdd);
	
	}
}

/*
OUTPUT

Enter the elements:
1
2
3
4
5
6
7
Sum of even no: 12
Sum of odd no: 16 */


