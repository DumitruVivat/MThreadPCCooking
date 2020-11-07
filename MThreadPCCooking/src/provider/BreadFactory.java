package provider;

//REFACTOR code - Design Pattern "Factory"
public class BreadFactory {

	private String name = "Franzeluta" ;
	// HW1.5
	// * add property  String name
	// * + toString()
	
	public static Integer counter = 0;

	public static AbstractBread createBread(String type) {
		return new Bread(type,++counter);
	}
	@Override
	public String toString() {
		return " Factory -> [" + name + "]";
	}
	
}
