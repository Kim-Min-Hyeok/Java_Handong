
@SuppressWarnings("serial")
public class CH09_MyException extends Exception{
	private String Error = "String should not includ\nspecial character $.";
	
	public CH09_MyException() {
		super();
	}
	public String toString() {
		return Error;
	}
}
