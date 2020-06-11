import java.io.*;
import java.util.Scanner;
public class CH10_Grader {
	String name;
	String scoreLine;	
	String StudentNum;
public static void run(String fName, String ofName) 
{
	
	Scanner inputStream = null;
	PrintWriter outputStream = null;
	try
	{
		inputStream = new Scanner(new File(fName));
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Error opening the file "+fName);
		System.exit(0);
	}

	String line = inputStream.nextLine();
	int i=0;
	String [] info = new String [8];
	while(inputStream.hasNextLine())
	{
		info[i] = inputStream.nextLine();
		i++;
	}
	inputStream.close();
	
	try
	{
		outputStream = new PrintWriter(new FileOutputStream(ofName));
	}
	catch(FileNotFoundException e)
	{
		System.out.println("Error opening the file "+fName);
		System.exit(0);
	}
	outputStream.println(line);
	float average = 0;
	float totalScore=0;
	float [] subjectAverage = new float[4];
	String [][] ary = new String [8][6];
	for(int p=0; p<info.length; p++) 
	{
		
		outputStream.print(info[p]);
		ary[p] = info[p].split(",");
		for(int q=2; q<ary[0].length; q++)
		{
			totalScore += Float.parseFloat(ary[p][q]);
			average = totalScore/(ary[p].length-2);
			subjectAverage[q-2]+=Float.parseFloat(ary[p][q]);
		}
		outputStream.println(","+average);
		totalScore = 0;
	
	outputStream.print("Average,000000");
	}
	float totalAverage=0;
	for(int j=0; j<subjectAverage.length; j++) 
	{
		outputStream.print(","+subjectAverage[j]/info.length);
		totalAverage+=subjectAverage[j];
	}
	outputStream.print(","+totalAverage/(ary[0].length-2)/info.length);
	outputStream.close();
}

}
