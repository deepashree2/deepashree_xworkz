class Stove{
	
	String type;
	String shape;
	String color;
	double price;
	boolean quality;
	int capacity;
	String makeInBy;
	String materialUse;
	
	Stove(String type, String shape, String color, double price, boolean quality, int capacity, String makeInBy, String materialUse){
		System.out.println("Stove running with its properties");
		this.type=type;
		this.shape=shape;
		this.color=color;
		this.price=price;
		this.quality=quality;
		this.capacity=capacity;
		this.makeInBy=makeInBy;
		this.materialUse=materialUse;
	}
}

