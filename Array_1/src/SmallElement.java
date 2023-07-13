
public class SmallElement {
public static void main(String[] args) {
	 int[] array = {9, 4, 6, 2, 7, 1, 5, 3, 8};

     int min = array[0]; 

     for (int i = 1; i < array.length; i++) {
         if (array[i] < min) {
             min = array[i];
         }
     }

     System.out.println("The Minimun number is: " + min);
}
}
