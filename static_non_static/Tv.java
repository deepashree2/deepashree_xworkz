package deepashree_xworkz;

public class Tv {
	static String brand;
	double price;
	
	static{
	System.out.println("Running static block......");
	brand = "Sony";
	}
	
	Tv(){
		System.out.println("No-argument..");
	}
	
	Tv(double price){
		this.price=price;
	}
	
	void Display() {
		System.out.println("brand :" + Tv.brand);
		System.out.println("price :" +price );
	}

}
