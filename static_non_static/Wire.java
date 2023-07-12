package deepashree_xworkz;

public class Wire {
	static String type;
	String color;
	
	static{
	System.out.println("Running static block......");
	type = "aluminium";
	}
	
	Wire(){
		System.out.println("No-arguments...");
	}
	
	Wire(String color){
		this.color=color;
	}
	
	void Display() {
		System.out.println("type :" + Wire.type);
		System.out.println("color :" +color );
	}

}
