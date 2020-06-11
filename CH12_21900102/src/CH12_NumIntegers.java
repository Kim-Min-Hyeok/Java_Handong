import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;

public class CH12_NumIntegers {

	HashSet<Integer> hashSet = new HashSet<Integer>();
	
	public void readdata(String file) {
		
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.out.println("There is no file!");
		}
		while(inputStream.hasNextInt()) {
			int num = inputStream.nextInt();
			hashSet.add(num);
		}	
	}
	
	public int getNumIntegers() {
		int n = 0;
		for(Object obj : hashSet.toArray()) {
			n++;
		}
		return n;
	}
	
	public void printIntegers() {
		for(Object obj : hashSet.toArray()) {
			Integer num = (Integer) obj;
			System.out.print(num.intValue()+ " ");
		}
	}

}
