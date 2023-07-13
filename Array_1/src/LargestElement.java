
public class LargestElement {
	public static void main(String[] args) {
		int[] array = {9, 4, 6, 2, 7, 1, 5, 3, 8};

        int Max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }
        }

        System.out.println("The largest element is: " + Max);
	}
}
