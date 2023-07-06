class Pot{
	
	String type;
	String shape;
	String color;
	double price;
	boolean quality;
	int ph;
	String makeInBy;
	String texture;
	
	Pot(String type, String shape, String color, double price, boolean quality, int ph,String makeInBy,String texture){
		System.out.println("Pot running with its properties");
		this.type=type;
		this.shape=shape;
		this.color=color;
		this.price=price;
		this.quality=quality;
		this.ph=ph;
		this.makeInBy=makeInBy;
		this.texture=texture;
	}
}

