package provider;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
    public static final Integer MAX_BREAD = 5;
	private List<AbstractBread> reserve;
	
	public Store() {
		reserve = new ArrayList<>();
	}
	public void getBread(BreadFactory factory) {
		if(count() < MAX_BREAD) {
		AbstractBread bread = BreadFactory.createBread("Chisinau");
		reserve.add(bread);
		}
	}
	public List<AbstractBread> getReserve() {
		return reserve;
	}
	public Integer count() {
		return reserve.size();
	}
}
