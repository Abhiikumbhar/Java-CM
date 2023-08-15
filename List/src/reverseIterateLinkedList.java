import java.util.Iterator;
import java.util.LinkedList;

public class reverseIterateLinkedList 
{
	 public static void main(String[] args) 
	 {
	    LinkedList<String> names = new LinkedList<>();
	    names.add("person 1");
	    names.add("person 2");
	    names.add("person 3");

	    System.out.println("using Iterator: ");
	    Iterator<String> itr = names.descendingIterator();
	    while (itr.hasNext()) 
	    {
	       String name = itr.next();
	       System.out.println(name);
	    }
	    
	    System.out.println();
	    System.out.println("using For Loop: ");
	    for (int i = names.size() - 1; i >= 0; i--) 
	    {
	       String name = names.get(i);
	       System.out.println(name);
	    }
	    
	 }
}