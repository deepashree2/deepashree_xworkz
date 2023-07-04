class Fish{
	
	String name;
	String type;
	double price;
	String location;
	
	Fish(){
	System.out.println("Fish no argument status");
	}
	
	Fish(String name){
	System.out.println("Fish name is: " +name);
	}
	
	Fish(String name1, String type1, double price1){
	System.out.println("Fish name is :"+name1);
	System.out.println("Fish type is :"+type1);
	System.out.println("The price is :"+price1);
	this.name=name1;
	this.price=price1;
	}
	
	Fish(String name2, String type2, double price2, String location){
	System.out.println("Fish name is :"+name2);
	System.out.println("Fish type is :"+type2);
	System.out.println("The price is :"+price2);
	System.out.println("Location is :" +location);
	this.name=name2;
	this.type=type2;
	this.price=price2;
	}
}


class FishRunner{
	public static void main(String[] args){
		System.out.println("FishRunner is running....");
		Fish ref = new Fish();
		Fish ref1 = new Fish("Patlak");
		Fish ref2 = new Fish("jelebi", "Big", 100.00);
		Fish ref3 = new Fish("jelebi", "Big", 100.00, "Hassan");
	}
}