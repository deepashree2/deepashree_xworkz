package deepashree_xworkz;

public class Train {
	static int numSeats;
	int length;
	
	static {
		System.out.println("static is block..");
		numSeats = 600;
	}
	
	Train(){
		System.out.println("Noarguments..");
	}
	
	Train(int length){
		this.length=length;
	}
	
	void Display() {
		System.out.println("numSeats :"+Train.numSeats);
		System.out.println("length :"+ length );

	}
}
