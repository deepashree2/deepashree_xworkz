package deepashree_xworkz;

public class ContactLens {
	static double price;
	boolean vision;
	
	static{
	System.out.println("Running static block......");
	price = 500.00;
	}
	
	ContactLens(){
	System.out.println("no arguments..");
	
	}
	
	ContactLens(boolean vision){
		this.vision=vision;
	}
	
	void Display() {
		System.out.println("Strength :" + ContactLens.price);
		System.out.println("exhaust :" +vision );
	}

}
