package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class elementInHashSet {

	public static void main(String[] args) {
		Set<Integer> hset=new HashSet<>();
        hset.add(1);
        hset.add(2);
        hset.add(3);
        hset.add(4);

        
        boolean isavailable = hset.contains(3);
		System.out.println(isavailable);
		
		isavailable = hset.contains(7);
		System.out.println(isavailable);
	}
}
