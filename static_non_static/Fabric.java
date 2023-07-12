package deepashree_xworkz;

public class Fabric {
	static String strength;
	double price;
	
	static{
	System.out.println("Running static block......");
	strength = "Good";
	}
	
	Fabric(){
		System.out.println("No arguments...");	
	}
	
	
	Fabric(double price){
		this.price=price;
	}
	
	void Display() {
		System.out.println("Strength :" + Fabric.strength);
		System.out.println("price :" +price );
	}
	
}
