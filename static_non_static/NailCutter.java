package deepashree_xworkz;

public class NailCutter {
	static String color;
	double price;
	
	static{
	System.out.println("Running static block......");
	color = "pink";
	}
	
	NailCutter(){
		System.out.println("No-arguments...");
	}
	
	NailCutter(double price){
		this.price=price;
	}
	
	void Display() {
		System.out.println("color :" + NailCutter.color);
		System.out.println("price :" +price );
	}

}
