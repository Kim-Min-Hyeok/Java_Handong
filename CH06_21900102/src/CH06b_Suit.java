
public enum CH06b_Suit {
MON ("red"), TUE ("orange"), WED ("yellow"), THU ("green"), FRI ("blue"), SAT ("indigo"), SUN ("purple");
	
	private final String color;
	private CH06b_Suit (String suitColor) {
		color = suitColor;
	}
	
	public String getColor() {
		return color;
	}
}
