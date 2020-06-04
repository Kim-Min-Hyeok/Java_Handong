import java.util.Scanner;

public class CH04_MySummation {
	public static void main(String[] args) {
		int number;
		int sum=0;
		System.out.println("Please input a number:");
		Scanner keyboard = new Scanner (System.in);
		number = keyboard.nextInt();
		for(int i=1; i<=number; i++) {
			sum+=i;
		}
		System.out.println("The summation from 1 to "+number+" is");
		System.out.println(sum);
	}
}
