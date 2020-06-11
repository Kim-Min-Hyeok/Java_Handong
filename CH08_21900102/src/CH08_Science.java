
public class CH08_Science extends CH08_Book {
	private	String Author;
	
	public CH08_Science(String book_name, String book_Author) {
		super(book_name);
		this.Author = book_Author;
	}
	public String toString() {
		return("Book Name: "+super.getName()+
			 "\nPublisher: "+this.Author);
	}
	public void print() {
		setId();
		System.out.println("<<<Science>>>");
		System.out.println("Id: "+super.getId());
		System.out.println(this.toString());
	}
}
