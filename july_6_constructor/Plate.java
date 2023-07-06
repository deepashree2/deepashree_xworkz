class Plate{
	
	String type;
	String shape;
	String color;
	double price;
	boolean quality;
	int quantity;
	String makeInBy;
	String materialUse;
	
	Plate(String type, String shape, String color, double price, boolean quality, int quantity,String makeInBy,String materialUse){
		System.out.println("Plate running with its properties");
		this.type=type;
		this.shape=shape;
		this.color=color;
		this.price=price;
		this.quality=quality;
		this.quantity=quantity;
		this.makeInBy=makeInBy;
		this.materialUse=materialUse;
	}
}

