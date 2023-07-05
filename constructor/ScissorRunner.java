class ScissorRunner{
	public static void main(String[] args){
		System.out.println("ScissorRunner is running.....");
		Scissor ref = new Scissor();
	
		Scissor ref1 = new Scissor("Joewell");
		System.out.println("brand :"+ref1.brand);
	
		Scissor ref2 = new Scissor("Hikari", "Black");
		System.out.println("brand is :"+ref2.brand);
		System.out.println("brand is :"+ref2.color);
		
		Scissor ref3 = new Scissor("ikea", "cloth cutting", 'C');
		System.out.println("type is :"+ref3.type);
		System.out.println("usage is :"+ref3.usage);
		System.out.println("size :"+ref3.size);
		
		Scissor ref4 = new Scissor('A', 550.00);
		System.out.println("size :"+ref4.size);
		System.out.println("price :"+ref4.price);
		
		Scissor ref5 = new Scissor("steel");
		System.out.println("material :"+ ref5.material);
		System.out.println("price :"+ref5.price);
		
		Scissor ref6 = new Scissor("Jaguar", "White", "RS pro", "cloth cutting", 'B', 560.00, "steel");
		System.out.println("brand is :"+ref6.brand);
		System.out.println("brand is :"+ref6.color);
		System.out.println("type is :"+ref6.type);
		System.out.println("usage is :"+ref6.usage);
		System.out.println("size :"+ref6.size);
		System.out.println("price :"+ref6.price);
		System.out.println("material :"+ ref6.material);
	}
}


