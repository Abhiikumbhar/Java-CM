
import java.util.ArrayList;

public class SearchForExistingElement 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);


		int value = 5;

		boolean isExist = numbers.contains(value);

		if (isExist) 
		{
			System.out.println("The element exist in the ArrayList");
		} 
		else 
		{
			System.out.println("The element does not exist in the ArrayList");
		}
	}
}