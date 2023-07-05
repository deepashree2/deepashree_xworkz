class Fish{
	
	String name;
	String type;
	double price;
	String location;
	
	Fish(){
	System.out.println("Fish no argument status");
	}
	
	Fish(String name){
		System.out.println("Running with fish name...");
	    this.name=name;
		
	}
	
	Fish(String name, String type, double price){
		System.out.println("Fish Running with name type and price..");
		this.name=name;
		this.type=type;
		this.price=price1;
	}
	
	Fish(String name, String type, double price, String location){
	System.out.println("Fish running with name type price location");
	this.name=name;
	this.type=type;
	this.price=price;
	this.location=location;
	}
}


