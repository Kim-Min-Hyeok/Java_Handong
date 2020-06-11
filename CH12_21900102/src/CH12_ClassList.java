import java.util.ArrayList;

public class CH12_ClassList {
	ArrayList <String> list = new ArrayList <String>();
	public void add(String line) {
		list.add(line);
	}
	public void Print() {
		System.out.println("\nList of classes");
		int listSize = list.size();
		for(int i = 1; i<=listSize; i++) {
			System.out.println("class " + i +": " + list.get(i-1));
		}
	}
}
