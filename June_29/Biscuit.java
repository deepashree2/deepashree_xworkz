class Biscuit{
	
	String Brand = "Good-Day";
	int numOfBisInPacks = 10;
	int price;
	String colorOfBiscuit;
	
	
	Biscuit(){
		System.out.println("Biscuit is so tastey");
	}

}


class BiscuitRunner{
	public static void main(String[] args){
		System.out.println("Biscuit is Runnig");
		Biscuit ref = new Biscuit();
		
		System.out.println(ref.Brand);
		System.out.println(ref.numOfBisInPacks);
		System.out.println(ref.price);
		System.out.println(ref.colorOfBiscuit);
		
	}
}