class Oil{
	
	String oilName;
	String Qualilty;
	int Quantity;
	double price;
	int productId;
	
	Oil(){
		System.out.println("Running with no arguments....");
	}
	
	Oil(String oilName, String Qualilty, int Quantity, double price, int productId){
		this.oilName=oilName;
		this.Qualilty=Qualilty;
		this.Quantity=Quantity;
		this.price=price;
		this.productId=productId;
	}
	
	void printInstanceVariables(){
		System.out.println("Name :"+this.oilName);
		System.out.println("Qualilty :"+this.Qualilty);
		System.out.println("Quantity :"+this.Quantity + "Liter");
		System.out.println("price :"+this.price);
		System.out.println("productId :"+this.productId);
		
	}
}

