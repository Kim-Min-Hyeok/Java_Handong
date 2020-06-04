import java.util.Scanner;
public class CH04_MyDrawing {

	public static void main(String[] args) {
		int number;
		int count=0;
		System.out.println("Please input a number:");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		for(int i=1; i<=number;) {
			if(count < i) {
				System.out.print("*");
				count++;
				continue;
			}
			if(count == i) {
				System.out.print("\n");
				i++;
				count = 0;
			}
		}
		for(int i=number; i>=1;) {
			if(count < i) {
				System.out.print("*");
				count++;
				continue;
			}
			if(count == i) {
				System.out.print("\n");
				i--;
				count = 0;
			}
		}
		}

}
