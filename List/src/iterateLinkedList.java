import java.util.Iterator;
import java.util.LinkedList;

public class iterateLinkedList
{
   public static void main(String[] args) 
   {
	   LinkedList<String> list = new LinkedList<>();
       list.add("Type 1");
       list.add("Type 2");
       list.add("Type 3");
       
       System.out.println("Using Iterator: ");
       Iterator<String> itr = list.iterator();
       while (itr.hasNext()) 
       {
           String str = itr.next();
           System.out.print(str+"--");
       }
       
       
       System.out.println();
       System.out.println("Using for each Loop: ");
       for (String name : list) 
       {
           System.out.print(name+"--");
       }
   }
}