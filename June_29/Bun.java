class Bun{
	int productionBatchNO = 30;
	float calory = 38.0f;
	String mrp;
	int expireDate;
	
	Bun()
	{
		System.out.println("Bun color is brown");
	}
	
}



class BunRunner{
	public static void main(String[] args)
	{
		System.out.println("Bun Runnig....");
		Bun ref = new Bun();
		System.out.println(ref.productionBatchNO);
		System.out.println(ref.calory);
		System.out.println(ref.mrp);
		System.out.println(ref.expireDate);
	}
}