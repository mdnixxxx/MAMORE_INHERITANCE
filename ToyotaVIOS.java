package individualact;

public class ToyotaVIOS extends Vehicles {

	String tireType = "All-season Tires";
	
	void drive() {
		System.out.println("The car is moving.");
	}
	
	@Override
	void stop() {
		System.out.println("The car arrived to its destination.");
	}
}
