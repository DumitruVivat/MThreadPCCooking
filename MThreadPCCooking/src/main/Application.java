package main;
import provider.AbstractBread;
import provider.BreadFactory;
import provider.Store;

public class Application {

	public static void main(String[] args) {
		BreadFactory centralFactory = new BreadFactory();
		BreadFactory secondaryFactory = new BreadFactory();
		

		Store piataCentrala = new Store();
		
		piataCentrala.getBread(centralFactory);
		piataCentrala.getBread(centralFactory);
		piataCentrala.getBread(secondaryFactory);
		piataCentrala.getBread(centralFactory);
		piataCentrala.getBread(secondaryFactory);
		piataCentrala.getBread(secondaryFactory);
		
		//HW1
		// * abstraction
		// * naming convention
		// * access - cannot create bread outside the factory
		
//		Bread hacked = new Bread("Bread",-1000);
		System.out.println( piataCentrala.count());
		for (AbstractBread bread : piataCentrala.getReserve()) {
			System.out.println( bread);
		}

	}

}
