package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetTraversal {

	public static void main(String[] args) {
		Set<String> hset=new HashSet<>();
        hset.add("Person 1");
        hset.add("Person 2");
        hset.add("Person 3");
        hset.add("Person 4");

        
        System.out.println("Traversal Using Iterator\n");
        Iterator<String> iterate = hset.iterator();
        while(iterate.hasNext())
        {
        	System.out.println(iterate.next());
        }
        
        System.out.println();
        System.out.println("Traversal Using For Each Loop:\n");
    
        for(String val:hset)
        {
        	System.out.println(val);
        }
	}
}
