
public class CH06a_Neo {
	private static int howmany=0;
	private String EmoticonStyle;
	
	public CH06a_Neo(String Style) {
		EmoticonStyle = Style;
		howmany++;
	}
	public static int gethowmany(){
		return howmany;
	}
	public void EmoticonStyle() {
		System.out.println("Neo is " + EmoticonStyle +".");
	}
}
