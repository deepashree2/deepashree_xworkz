class Chacolate{
	int price = 10;
	String flavour = "chacolate";
	String brand;
	int batchNo;
	
	Chacolate()
	{
		System.out.println("Chacolate is tastey");
	}
	
}



class ChacolateRunner{
	public static void main(String[] args)
	{
		System.out.println("Chacolate Running.....");
		Chacolate ref = new Chacolate();
		System.out.println(ref.price);
		System.out.println(ref.flavour);
		System.out.println(ref.brand);
		System.out.println(ref.batchNo);
	}
}