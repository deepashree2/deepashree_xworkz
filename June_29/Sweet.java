class Sweet{
	
	String ingridients = "Sugar";
	float literOfMilk = 2.5f;
	int price;
	String colorOfSweet;
	
	
	Sweet(){
		System.out.println("Sweet is always sweet and tastey");
	}

}


class SweetRunner{
	public static void main(String[] args){
		System.out.println("Sweet is Runnig");
		Sweet ref = new Sweet();
		
		System.out.println(ref.ingridients);
		System.out.println(ref.literOfMilk);
		System.out.println(ref.price);
		System.out.println(ref.colorOfSweet);
		
	}
}
		
		