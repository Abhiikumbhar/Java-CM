class rectangle 
{
	private int Length;
	private int Breadth;
	
	public rectangle(int length, int breadth) {
		super();
		Length = length;
		Breadth = breadth;
	}

	public int getLength() {
		return Length;
	}
	
	public void setLength(int length) {
		Length = length;
	}
	
	public int getBreadth() {
		return Breadth;
	}
	
	public void setBreadth(int breadth) {
		Breadth = breadth;
	}
	
	
}
public class RectangleTest 
{ 
	public static void main(String[] args)
	{ 
        rectangle rt = new rectangle(20,30); 
		int lth = rt.getLength(); 
		int bth = rt.getBreadth(); 
		int Area = lth * bth; 
		System.out.println("Area: " +Area); 
		rt.setLength(50); 
		rt.setBreadth(60); 
		int ln = rt.getLength(); 
		int br = rt.getBreadth(); 
		int newArea = ln * br; 
		System.out.println("New area: " +newArea); 
 } 
}