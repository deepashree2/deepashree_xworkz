class Candy{
	int price = 5;
	String flavour = "orange";
	String brand;
	int batchNo;
	
	Candy()
	{
		System.out.println("Candy is always cold");
	}
	
}



class CandyRunner{
	public static void main(String[] args)
	{
		System.out.println("Candy Running.....");
		Candy ref = new Candy();
		System.out.println(ref.price);
		System.out.println(ref.flavour);
		System.out.println(ref.brand);
		System.out.println(ref.batchNo);
	}
}