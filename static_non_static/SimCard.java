package deepashree_xworkz;

public class SimCard {
	static String size;
	String brand;
	
	static {
		System.out.println("static is block..");
		size = "small";
	}
	
	SimCard(){
		System.out.println("Noarguments..");
	}
	
	SimCard(String brand){
		this.brand=brand;
	}
	
	void Display() {
		System.out.println("size :"+SimCard.size);
		System.out.println("brand :"+ brand );
	}
}
