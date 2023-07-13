import java.util.Scanner;

public class SecLargestElement 
{
	public static void main(String[] args) 
	{

		int array[] = {13,34,56,54,76,23,67};
        int max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] > max) 
            {
            	SecMax = max;
                max = array[i];
            } else if (array[i] > SecMax && array[i] != max) {
            	SecMax = array[i];
            }
        }
        System.out.println("The second largest element is: " + SecMax);
	}
}
