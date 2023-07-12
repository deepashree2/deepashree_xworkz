package deepashree_xworkz;

public class Printer {
	
	static String size;
	int wieght;
	
	static {
		System.out.println("static is block..");
		size = "Big";
	}
	
	Printer(){
		System.out.println("Noarguments..");
	}
	
	Printer(int wieght){
		this.wieght=wieght;
	}
	
	void Display() {
		System.out.println("size :"+Printer.size);
		System.out.println("wieght :"+ wieght +"kg");
	}


}
