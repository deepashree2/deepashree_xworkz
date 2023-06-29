class VegPuff{
	
	String avialability = "Bakery";
	int calories = 300;
	int price;
	String colorOfVegPuff;
	
	
	VegPuff(){
		System.out.println("VegPuff is so spicy");
	}

}


class VegPuffRunner{
	public static void main(String[] args){
		System.out.println("VegPuff is Runnig");
		VegPuff ref = new VegPuff();
		
		System.out.println(ref.avialability);
		System.out.println(ref.calories);
		System.out.println(ref.price);
		System.out.println(ref.colorOfVegPuff);
		
	}
}