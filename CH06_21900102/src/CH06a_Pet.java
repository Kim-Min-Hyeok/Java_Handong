
public class CH06a_Pet {
	private String name;
	private int age;
	private double weight;
	
public CH06a_Pet(String initialName, int initialAge, double initialWeight) {
	name = initialName;
	if((initialAge < 0) || (initialWeight < 0)) {
		System.out.println("Error: Negative age or weight.");
	}else {
		age = initialAge;
		weight = initialWeight;
	}
}
public CH06a_Pet(String initialName) {
	name = initialName;
}
public CH06a_Pet(int initialAge) {
	if(initialAge < 0) {
		System.out.println("Error: Negative age.");
	}else {
		age = initialAge;
	}
	name = "No name yet";
}
public CH06a_Pet(double initialWeight) {
	if(initialWeight < 0) {
		System.out.println("Error: Negative weight.");
	}else {
		weight = initialWeight;
	}
	name = "No name yet";
}
public CH06a_Pet() {
	name = "No name yet";
	age = 0;
	weight = 0;
}
public String getName() {return name;}
public int getAge()	{return age;}
public double getWeight() {return weight;}
public void writeOutput() {
	System.out.println("Name: "+ name);
	System.out.println("Age: " + age + " years" );
	System.out.println("Weight: " + weight +" pounds");
}
}