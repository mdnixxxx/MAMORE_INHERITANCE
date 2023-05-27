package individualact;

public class U_2_Spy_Plane extends ToyotaVIOS{

	int wingspan = 104;
	
	void fly() {
		System.out.println("The plane is flying.");
	}
	
	@Override
	void stop() {
		System.out.println("The plane landed safely.");
	}
}
