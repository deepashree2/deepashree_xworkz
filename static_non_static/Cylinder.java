package deepashree_xworkz;

public class Cylinder {
	static String shape;
	String brand;
	
	static{
		System.out.println("Static block.....");
		shape = "Cylindrical";
		
		
	}
	
	Cylinder(){
		System.out.println("no arguments..");
		
		}
		
	Cylinder(String brand) {
		
		this.brand=brand;
		
	}
	
	void Display() {
		System.out.println("Brand :"+brand);
		System.out.println("Shape :"+Cylinder.shape);
	}
	

}
