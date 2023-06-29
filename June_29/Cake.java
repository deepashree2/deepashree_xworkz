class Cake{
	
	String flavour = "Vanela";
	int kg = 3;
	int price;
	String colorOfCake;
	
	
	Cake(){
		System.out.println("Cake has so many types");
	}

}


class CakeRunner{
	public static void main(String[] args){
		System.out.println("Cake is Runnig");
		Cake ref = new Cake();
		
		System.out.println(ref.flavour);
		System.out.println(ref.kg);
		System.out.println(ref.price);
		System.out.println(ref.colorOfCake);
		
	}
}