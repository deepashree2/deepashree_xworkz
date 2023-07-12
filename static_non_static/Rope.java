package deepashree_xworkz;

public class Rope {
	static int length;
	double price;
	
	static{
	System.out.println("Running static block......");
	length = 90;
	}
	
	Rope(){
		System.out.println("No-arguments..");
	}
	
	Rope(double price){
		this.price=price;
	}
	
	void Display() {
		System.out.println("length :" + Rope.length);
		System.out.println("price :" +price );
	}

		
}
