
public class CH08_ClassFriend extends CH08_SchoolFriend{
	private String whatFriend_;
	public CH08_ClassFriend(String friendInfo1, String friendInfo2) {
		super(friendInfo1);
		whatFriend_ = friendInfo2;
	}
	public void whatfriend() {
		System.out.println("We are friends");
		System.out.println(super.getWhatfr());
		System.out.println(whatFriend_);
	}

}
