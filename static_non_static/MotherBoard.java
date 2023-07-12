package deepashree_xworkz;

public class MotherBoard {
	static int numCPU;
	boolean power;
	
	static {
		System.out.println("static is block..");
		numCPU = 1;
	}
	
	MotherBoard(){
		System.out.println("Noarguments..");
	}
	
	MotherBoard(boolean power){
		this.power=power;
	}
	
	void Display() {
		System.out.println("numCPU :"+MotherBoard.numCPU);
		System.out.println("power :"+power);
	}


}
