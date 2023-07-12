package deepashree_xworkz;

public class Coastal {
	static String state;
	boolean freshWater;
	
	static{
	System.out.println("Running static block......");
	state = "Liquid";
	}
	
	Coastal(){
		System.out.println("No arguments..");
	}
	
	Coastal(boolean freshWater){
		this.freshWater=freshWater;
	}
	
	void Display() {
		System.out.println("state :" + Coastal.state);
		System.out.println("freshWater :" +freshWater );
	}

}
