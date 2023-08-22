package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class convertToArray {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
	    set.add(10);
	    set.add(20);
	    set.add(30);
	    set.add(40);
	    set.add(50);
	    
	    Integer[] array = set.toArray(new Integer[0]);
	    
	    System.out.println(Arrays.toString(array));
	}
}
