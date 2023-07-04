class Kebab{
	String name;
	double price;
	String hotelName;
	int  noOfPieces;
	boolean takeway;
	
	Kebab(){
	System.out.println("Kebab running with no arguments...");
	}
	
	Kebab(String name){
		System.out.println("name is :"+name);
	}
	
	Kebab(String name1,double price1){
		System.out.println("name is :"+name1);
		System.out.println("price :"+price1);
		this.name=name1;
		this.price=price1;
	}
	
	Kebab(String name, double price, String hotelName, int noOfPieces)
	{
		System.out.println("name is :"+name);
		System.out.println("price is :"+price);
		System.out.println("hotel Name is :"+ hotelName);
		System.out.println("Number of Pieces :"+noOfPieces);
		
	}
		Kebab(String name1, double price1, String hotelName1, int noOfPieces1, boolean takeway1){
		System.out.println("name is :"+name1);
		System.out.println("price is :"+price1);
		System.out.println("hotel Name is :"+ hotelName1);
		System.out.println("Number of Pieces :"+noOfPieces1);
		System.out.println("takeway :"+takeway1);
		this.name=name1;
		this.price=price1;
		this.hotelName=hotelName1;
		this.noOfPieces=noOfPieces1;
		this.takeway=takeway1;
		}
}
	
class KebabRunner{
		public static void main(String[] args){
			System.out.println("KebabRunner is runing...");
			Kebab ref =new Kebab();
			Kebab ref1 =new Kebab("Chiken");
			Kebab ref2 = new Kebab("Mutton",200.00);
			Kebab ref3= new Kebab("Mashrum", 50.00, "Udupi hotel", 8);
			Kebab ref4= new Kebab("Chiken", 100.00, "empire", 6, true);
		}
}