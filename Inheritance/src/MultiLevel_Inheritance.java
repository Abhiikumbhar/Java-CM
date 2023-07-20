class parent{
	void showParent()
	{
		System.out.println("this is Parent");
	}
}

class child extends parent{
	void showchild()
	{
		showParent();
		System.out.println("And this is child");
	}
}

class GrandChild extends child{
	void showGrandChild()
	{
		showchild();
		System.out.println("and this is grandChild");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) 
	{
		GrandChild GC =new GrandChild();
		GC.showGrandChild();
	}
}
