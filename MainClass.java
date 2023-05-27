package individualact;

import java.util.concurrent.TimeUnit;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
	//instantiation to include all the objects in the sub-classes, 
	//VEHICLES > TOYOTA_VIOS > U_2_SPY_PLANE > FANDANGOYACHT
		FandangoYacht obj = new FandangoYacht();
		
	//TOYOTA VIOS
		obj.speed = 160;
		obj.color = "Red";
		obj.price = 1500000;
		System.out.println("      TOYOTA VIOS     ");
		System.out.println("Car Tire Type: " +obj.tireType);
		System.out.println("Car Speed: " +obj.speed);
		System.out.println("Car Color: " +obj.color);
		System.out.println("Car Price: " +obj.price);
		
		obj.drive();
		TimeUnit.SECONDS.sleep(2);
		obj.stop();
		
		//preparing the next vehicle
		System.out.println("\nPreparing the next vehicle...");
		TimeUnit.SECONDS.sleep(2);
		
	//U_2_SPY_PLANE
		obj.speed = 840;
		obj.color = "White";
		obj.price = 63000000;
		System.out.println("\n     U_2_SPY_PLANE     ");
		System.out.println("Plane Wing Span: " +obj.wingspan);
		System.out.println("Plane Speed: " +obj.color);
		System.out.println("Plane Color: " +obj.color);
		System.out.println("Plane Price: " +obj.price);
		
		obj.fly();
		TimeUnit.SECONDS.sleep(2);
		obj.stop();
		
		//preparing the next vehicle
		System.out.println("\nPreparing the next vehicle...");
		TimeUnit.SECONDS.sleep(2);
		
	//FANDANGO YACHT
		obj.speed = 65;
		obj.color = "Metallic Gray";
		obj.price = 5000000;
		System.out.println("\n      FANDANGO YACHT     ");
		System.out.println("Yacht MainSail Color: " +obj.MainsailColor);
		System.out.println("Yacht Speed: " +obj.speed);
		System.out.println("Yacht Color: " +obj.color);
		System.out.println("Yacht Price: " +obj.price);
		
		obj.Float();
		TimeUnit.SECONDS.sleep(2);
		obj.stop();
		TimeUnit.SECONDS.sleep(1);
		
		//ending the code
		System.out.println("\nProgram ends here...");
	}

}
