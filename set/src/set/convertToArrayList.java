package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class convertToArrayList {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		 set.add(10);
		 set.add(20);
		 set.add(30);
		 set.add(40);
		 set.add(50);
		 
	    ArrayList<Integer> list = new ArrayList<>(set);

	    System.out.println(list);
	}
}
