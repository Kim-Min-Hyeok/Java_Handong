import java.util.*;
public class CH05_MyCalculator2 {

	private int a;
	private int b;
	
	public void getinput() {
		printmenu();
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Type 1st Num: ");
		a = keyboard.nextInt();
		System.out.print("Type 2nd Num: ");
		b = keyboard.nextInt();
	}
	
	public void printresult() {
		System.out.println("a + b = " + addition());
		System.out.println("a - b = " + subtraction());
		System.out.println("a * b = " + multiplication());
		System.out.println("a / b = " + division());
	}

	private void printmenu() {
		System.out.println("*** CHO5_MyCalculator2 ***");
	}
	
	private double addition() {
		return a+b;
	}
	
	private double subtraction() {
		return a-b;
	}
	
	private double multiplication() {
		return a*b;
	}
	
	private double division() {
		return a/b;
	}
}
