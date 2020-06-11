
public class CH08_Book {
	private	String name;
	private static int id=0;
	
	public CH08_Book(String book_name) {
		name = book_name;
	}
	public String getName() {
		return name;
	}
	public void setname(String book_name) {
		name = book_name;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		id++;
	}
	public String toString() {
		return("Book Name: "+name);
	}
	public void print() {
		setId();
		System.out.println("<<<BOOK>>>");
		System.out.println("Id: "+id);
		System.out.println(this.toString());
	}
}
