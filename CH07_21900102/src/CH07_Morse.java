
public class CH07_Morse {
	private static String[] morse = {"o-", "-ooo", "-o-o", "-oo", "o", 
			"oo-o", "--o", "oooo","oo", "o---",
			"-o-", "o-oo", "--", "-o", "---",
			"o--o", "--o-", "o-o", "ooo", "-",
			"oo-", "ooo-", "o--", "-oo-", "-o--", "--oo"
			};	
	public static String convert(String word) {
		String Morse = "";
			for(int i=0; i<word.length(); i++) {
				Morse += morse[(int)word.charAt(i)-(int)'A'];
		}
		return Morse;
	}
}
