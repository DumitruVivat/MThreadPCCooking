package provider;

public class Bread extends AbstractBread {
	
	private String type;
	private Integer  id;
    private BreadFactory manufacturer;
	
	//HW2
	//* refactor Bread Class
	// + add manufacturer -> Factory
	// * refactor Factory class
	// add itself - > manufacturer
	
	protected Bread(String type,Integer id) {
		this.manufacturer = new BreadFactory();
		this.type = type;
		this.id = id;
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bread  (" + id + ")   [" + type + "] "+ manufacturer;
	}
	
	

}
