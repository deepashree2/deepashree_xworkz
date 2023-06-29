class IceCream{
	int price = 30;
	String flavour = "vanilla";
	String brand;
	int typesOfIceCream;
	
	IceCream()
	{
		System.out.println("Childern likes IceCream");
	}
	
}



class IceCreamRunner{
	public static void main(String[] args)
	{
		System.out.println("IceCream Runnig....");
		IceCream ref = new IceCream();
		System.out.println(ref.price);
		System.out.println(ref.flavour);
		System.out.println(ref.brand);
		System.out.println(ref.typesOfIceCream);
	}
}