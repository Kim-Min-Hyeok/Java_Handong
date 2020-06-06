
public class CH06b_EnumTest {
	public static void main(String[]args) {
		CH06b_Suit fri = CH06b_Suit.FRI;
		System.out.println("s.ordinal()=" + fri.ordinal());
		System.out.println("s.compareTo(Suit.WED)="+fri.compareTo(CH06b_Suit.WED));
		System.out.println("s.toString()="+fri.toString());
		System.out.println("s.getColor() = "+fri.getColor());
		CH06b_Suit mon = CH06b_Suit.MON;
		CH06b_Suit tue = CH06b_Suit.TUE;
		CH06b_Suit wed = CH06b_Suit.WED;
		CH06b_Suit thu = CH06b_Suit.THU;
		CH06b_Suit sat = CH06b_Suit.SAT;
		CH06b_Suit sun = CH06b_Suit.SUN;
		for (CH06b_Suit Suit : CH06b_Suit.values()) {
			System.out.println(Suit+ " " + Suit.getColor());
		}
	}
}