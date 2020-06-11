import java.util.*;
public class CH11_Palindrome_main {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String line = keyboard.nextLine();
	Boolean check = recursion(line, 0, line.length()-1);
	if(check == true) System.out.println(line+" is a palindrom.");
	else System.out.println(line+" is  not a palindrom");
	}
	public static Boolean recursion(String line, int p, int q) {
		if(p>=q) return true;
		char a = line.charAt(p);
		char b = line.charAt(q);
	if(a==b || (a-'a'+'A')==b || a==(b-'b'+'B')) recursion(line, p+1, q-1);
	else return false;
	return true;
	}
}