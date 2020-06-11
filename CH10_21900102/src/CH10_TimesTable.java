import java.io.*;
public class CH10_TimesTable {

	public static void main(String[] args) {
		System.out.println("I am wrting the 3 times table...");
		String fileName = "ThreeTimesTable.txt";
		
		PrintWriter outputStream = null;
		try
		{
			outputStream = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file "+fileName);
			System.exit(0);
		}
		
		outputStream.println("3 times table\n");
		for(int i=1; i<=9; i++)
		{
			outputStream.println(i+" * 3 = "+i*3);
		}
		outputStream.close();
		System.out.println("3 times table was created in "+fileName);
	}

}
