package recordMgmt;

public interface student {
	static int[] studID = new int[5];
	static String[] studName = new String[5];
	static String[] issueBook = new String[5];
	void studentPanel() throws InterruptedException;
	void addstud();
	void viewstud();
}
