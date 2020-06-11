
public class CH08_History extends CH08_Book{
	private	String publisher;
	
	public CH08_History(String book_name, String book_publisher) {
		super(book_name);
		this.publisher = book_publisher;
	}
	public String toString() {
		return("Book Name: "+super.getName()+
			 "\nPublisher: "+this.publisher);
	}
	public void print() {
		setId();
		System.out.println("<<<History>>>");
		System.out.println("Id: "+super.getId());
		System.out.println(this.toString());
	}
}
