import java.util.Scanner;

public class CheckFreqOfElement 
{
	  int checkFreq(int arr[], int ele)
	  {
		  int frequency = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == ele) {
	                frequency++;
	            }
	        }
	        return frequency;
	  }
	  public static void main(String[] args) 
	  {
		  	CheckFreqOfElement chk_obj = new CheckFreqOfElement();
	        Scanner SC = new Scanner(System.in);
	        System.out.println("Enter element: ");
	        int[] arr = new int[5];
	        for (int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = SC.nextInt();
	        }	        
	        for (int i : arr) {
	        	System.out.println("The frequency of " + arr[i] + " is " + chk_obj.checkFreq(arr, arr[i]));
			}
	        
	    }
}