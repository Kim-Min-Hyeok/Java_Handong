
public class CH09_SpeedLim {
	private int limit;
	private int speed;
	public CH09_SpeedLim(int lim, int sp) {
		limit = lim;
		speed = sp;
	}
	public void SpeedWarning() {
		try {
			if(speed>limit) 
				throw new Exception();
			System.out.println("You are a law abiding\ncitizen!");
		}
		catch(Exception e) {
			System.out.println("Speed Limit "+limit+"km exceeded!\nYou are being fined.");
		}
		System.out.println("Your current speed: "+speed);
	}
}
