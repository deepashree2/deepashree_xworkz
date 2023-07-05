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
		System.out.println("Kebab running with name...");
		this.name=name;
	}
	
	Kebab(String name,double price){
		System.out.println("Kebab running with name and price...");
		this.name=name;
		this.price=price;
	}
	
	Kebab(String name, double price, String hotelName, int noOfPieces)
	{
		System.out.println("Kebab running with name, price, hotelName and no of pieces...");
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.noOfPieces=noOfPieces;
		
	}
		Kebab(String name, double price, String hotelName, int noOfPieces, boolean takeway){
		System.out.println("Kebab running with name, price, hotelName  no of pieces and takeway...");
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.noOfPieces=noOfPieces;
		this.takeway=takeway;
		}
}
	
