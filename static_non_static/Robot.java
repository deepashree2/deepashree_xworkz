package deepashree_xworkz;

public class Robot {
	static String type;
	double price;
	
	static {
		System.out.println("static is block..");
		type = "human";
	}
	
	Robot(){
		System.out.println("Noarguments..");
	}
	
	Robot(double price){
		this.price=price;
	}
	
	void Display() {
		System.out.println("color :"+Robot.type);
		System.out.println("price :"+price);
	}

}
