
public class CH06b_StrCalculator {
	private static double result;
	public static double operation(int a, char op, int b) {
		
		switch(op) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		default :
			break;
		}
		return result;	
	}
	
public static double operation(String A, char op, String B) {
		
		switch(op) {
		case '+':
			result = Double.parseDouble(A)+Double.parseDouble(B);
			break;
		case '-':
			result = Double.parseDouble(A)-Double.parseDouble(B);
			break;
		default :
			break;
		}
		return result;	
	}

public static double operation(double a, char op, double b) {
	
	switch(op) {
	case '+':
		result = a+b;
		break;
	case '-':
		result = a-b;
		break;
	default :
		break;
	}
	return result;	
}
}
