package recordMgmt;

public interface book {
	static String[] bookName = new String[3];
	void bookPanel() throws InterruptedException;
	void addBook();
	void viewBook();
}
