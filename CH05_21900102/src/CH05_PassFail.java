
public class CH05_PassFail {
	private String name;
	private int score;
	
	public void writeoutput() {
		String grade;
		if(score >50)
			grade = "pass";
		else
			grade = "fail";
		System.out.println(name + ": "+ score + ": " + grade);
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setdata(String s_name, int s_score) {
		name = s_name;
		score = s_score;
	}
	
	public Boolean equals(CH05_PassFail in_object) {
		return((this.name.equalsIgnoreCase(in_object.name))&&
				(this.score == in_object.score));
	}

	public void copyFrom(CH05_PassFail in_object) {
		name = in_object.name;
		score = in_object.score;
	}
	
	public static void identifyOrSameValue(CH05_PassFail student1, CH05_PassFail student2) {
		if(student1!=student2) 
			System.out.println("Student1 and Student2 are different object, different Hashcode");
		else
			System.out.println("Student1 and Student2 are Same object, Same Hashcode");
			
		if(student1.equals(student2)==true)
			System.out.println("Student1 and Student2 have Same state, Same value of instance variable");
		else
			System.out.println("Student1 and Student2 have different value of instance variable");
	}
}
