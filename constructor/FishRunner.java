class FishRunner{
	public static void main(String[] args){
		System.out.println("FishRunner is running....");
		Fish ref = new Fish();
		
		Fish ref1 = new Fish("Patlak");
		System.out.println("Fish name is"+ref1.name);
		
		Fish ref2 = new Fish("jelebi", "Big", 100.00);
		System.out.println("Fish name is"+ ref2.name);
		System.out.println("Fish type is :"+ref2.type);
		System.out.println("The price is :"+ref2.price);
		
		Fish ref3 = new Fish("jelebi", "Big", 100.00, "Hassan");
		System.out.println("Fish name is :"+ref3.name);
		System.out.println("Fish type is :"+ref3.type);
		System.out.println("The price is :"+ref3.price);
		System.out.println("Location is :" +ref3.location);
	}
}