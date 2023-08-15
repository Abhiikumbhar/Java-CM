
import java.util.ArrayList;

public class copyArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("type 1");
		list.add("type 2");
		list.add("type 3");
		list.add("type 4");
		list.add("type 5");
		list.add("type 6");

	    ArrayList<String> list2 = new ArrayList<>();

	    for (String item : list) 
	    {
	        list2.add(item);
	    }

	    System.out.println(list2);
	}
}
