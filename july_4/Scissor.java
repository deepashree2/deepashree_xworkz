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
		System.out.println("brand :"+brand);
	}
	Scissor(String brand,String color){
		System.out.println("brand is :"+brand);
		System.out.println("brand is :"+color);
	}
	
	Scissor(String type, String usage,char size){
		System.out.println("type is :"+type);
		System.out.println("usage is :"+usage);
		System.out.println("size :"+size);
		
	}
	
	Scissor(char size1, double price){
		System.out.println("size :"+size1);
		System.out.println("price :"+price);
		this.size=size1;
	}
	
	Scissor(double price1, String material){
		System.out.println("material :"+ material);
		System.out.println("price :"+price1);
		this.price=price1;
	}
	
	Scissor(String brand1,String color1,String type1,String usage1,char size2,double price2,String material1){
		
		System.out.println("brand is :"+brand1);
		System.out.println("brand is :"+color1);
		System.out.println("type is :"+type1);
		System.out.println("usage is :"+usage1);
		System.out.println("size :"+size2);
		System.out.println("price :"+price2);
		System.out.println("material :"+ material1);
		this.brand=brand1;
		this.color=color1;
		this.type=type1;
		this.usage=usage1;
		this.size=size2;
		this.price=price2;
		this.material=material1;
	}
}


class ScissorRunner{
	public static void main(String[] args){
	System.out.println("ScissorRunner is running.....");
	Scissor ref = new Scissor();
	Scissor ref1 = new Scissor("Joewell");
	Scissor ref2 = new Scissor("Hikari", "Black");
	Scissor ref3 = new Scissor("ikea", "cloth cutting", 'C');
	Scissor ref4 = new Scissor('A', 550.00);
	Scissor ref5 = new Scissor("steel");
	Scissor ref6 = new Scissor("Jaguar", "White", "RS pro", "cloth cutting", 'B', 560.00, "steel");
	}
}



