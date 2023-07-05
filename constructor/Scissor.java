class Scissor{
	String brand;
	String color;
	String type;
	String usage;
	char size;
	double price;
	String material;
	
	Scissor(){
		System.out.println("Scissor is running......");
	}
	Scissor(String brand){
		System.out.println("Scissor is running with brand......");
		this.brand=brand;
	}
	Scissor(String brand,String color){
		System.out.println("Scissor is running with brand and color......");
		this.brand=brand;
		this.color=color;
	}
	
	Scissor(String type, String usage,char size){
			System.out.println("Scissor is running with brand color and size......");
			this.brand=brand;
			this.color=color;
			this.size=size;
	}
	
	Scissor(char size, double price){
		System.out.println("Scissor is running with size and price......");
		this.size=size;
		this.price=price;
	}
	
	Scissor(double price, String material){
		System.out.println("Scissor is running with price and material......");
		this.price=price;
		this.material=material;
	}
	
	Scissor(String brand,String color,String type,String usage,char size,double price,String material){
		
		System.out.println("Scissor is running with brand,color,type, usage, size, price,and material......");
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.usage=usage;
		this.size=size;
		this.price=price;
		this.material=material;
	}
}



