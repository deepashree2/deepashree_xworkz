package deepashree_xworkz;

public class NumberPlate {
		static String color;
		String plateNum;
		
		static {
			System.out.println("static is block..");
			color = "white";
		}
		
		NumberPlate(){
			System.out.println("Noarguments..");
		}
		
		NumberPlate(String plateNum){
			this.plateNum=plateNum;
		}
		
		void Display() {
			System.out.println("color :"+color);
			System.out.println("plateNum :"+plateNum);
		}
}
