import java.util.*;
public class CH03_MyCompareTo {
	public static void main(String[] args) {
		String s1;
		String s2;
		String yesno;
		do {
		System.out.println("Please input two words:");
		
		Scanner keyboard = new Scanner (System.in);
		s1 = keyboard.next();
		s2 = keyboard.next();
		
		if(s1.compareTo(s2)<0) {
			System.out.println(s1+" is before "+s2);
		}else if(s1.compareTo(s2)>0) {
			System.out.println(s1+" is after "+s2);
		}else { //s1.compareTo(s2)==0
			System.out.println( s1+" equals "+s2);
		}System.out.println("Want to end the program??\nEnter y for yes or n for no.");
		yesno = keyboard.next();
		}while(yesno.equals("y"));
		System.out.println("end the program!!");
		System.exit(0);
	}
}
