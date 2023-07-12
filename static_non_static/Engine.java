package deepashree_xworkz;

public class Engine {
	static String type;
	boolean exhaust;
	
	static{
	System.out.println("Running static block......");
	type = "oil engine";
	}
	
	Engine(){
		System.out.println("no arguments..");
		
		}
		
	
	Engine(boolean exhaust){
		this.exhaust=exhaust;
	}
	
	void Display() {
		System.out.println("Strength :" + Engine.type);
		System.out.println("exhaust :" +exhaust );
	}
}
