
public class CH08_SchoolFriend extends CH08_Friend{
	private String whatFriend;
	public CH08_SchoolFriend(String friendInfo) {
		whatFriend = friendInfo;
	}
	public void whatfriend() {
		System.out.println("We are friends");
		System.out.println(whatFriend);
	}
	public String getWhatfr() {
		return whatFriend;
	}

}
