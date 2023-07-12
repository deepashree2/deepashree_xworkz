package deepashree_xworkz;

public class EngineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EngineRunner running..");
		
		Engine ref = new  Engine();
		Engine ref1 = new  Engine(true);
		ref1.Display();
		Engine ref2 = new  Engine(false);
		ref2.Display();

	}

}
