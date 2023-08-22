package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class lessThanInTreeSet {

	public static void main(String[] args) {
		Set<Integer> Tset = new TreeSet<>();
	    Tset.add(1);
	    Tset.add(2);
	    Tset.add(3);
	    Tset.add(4);
	    Tset.add(5);
	    Tset.add(6);
	    Tset.add(7);
	    Tset.add(8);
	    Tset.add(9);

	    List<Integer> list = new ArrayList<>();

	    for (Integer num : Tset) 
	    {
	      if (num <= 7) {
	        list.add(num);
	      }
	    }

	    System.out.println(list);
	}
}
