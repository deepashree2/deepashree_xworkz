package deepashree_xworkz;

public class Submarine {
	static String color;
	double price;
	
	static {
		System.out.println("static is block..");
		color = "black";
	}
	
	Submarine(){
		System.out.println("Noarguments..");
	}
	
	Submarine(double price){
		this.price=price;
	}
	
	void Display() {
		System.out.println("color :"+Submarine.color);
		System.out.println("price :"+price);
	}

}
