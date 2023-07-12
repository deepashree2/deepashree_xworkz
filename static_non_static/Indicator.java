package deepashree_xworkz;

public class Indicator {

		static String size;
		int volts;
		
		static{
		System.out.println("Running static block......");
		size = "small";
		}
		
		Indicator(){
			System.out.println("no arguments..");
		}
		
		
		Indicator(int volts){
			this.volts=volts;
		}
		
		void Display() {
			System.out.println("size :" + Indicator.size);
			System.out.println("volts :" +volts );
			
			
		}


}
