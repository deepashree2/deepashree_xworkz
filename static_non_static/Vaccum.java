package deepashree_xworkz;

public class Vaccum {
	static String type;
	double price;
	
	static {
		System.out.println("static runing...");
		type ="Stick";
	}
	
	Vaccum(){
		System.out.println("No-arguments...");
	}
	
	Vaccum(double price){
		this.price=price;
	}
	
	void Display()
	{
		System.out.println("vaccum type :"+Vaccum.type);
		System.out.println("vaccum price :"+price);
	}

}
