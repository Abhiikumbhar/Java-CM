import java.util.Arrays;

public class SumOfTwoArray 
{
	public static void main(String[] args) 
	{
		 	int[] array1 = {1,2,3,4,5,6,7};
	        int[] array2 = {0,0,2,1,3,5,2};

	        int[] SumOfArray = new int[array1.length];

	        for (int i = 0; i < array1.length; i++) 
	        {
	            SumOfArray[i] = array1[i] + array2[i];
	        }

	        System.out.println("Array 1: " + Arrays.toString(array1));
	        System.out.println("Array 2: " + Arrays.toString(array2));
	        System.out.println("Sum of two Array: " + Arrays.toString(SumOfArray));
	}
}

/*
OUTPUT

Array 1: [1, 2, 3, 4, 5, 6, 7]
Array 2: [0, 0, 2, 1, 3, 5, 2]
Sum of two Array: [1, 2, 5, 5, 8, 11, 9]
*/