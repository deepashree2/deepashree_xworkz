class Bread{
	int productionBatchNo = 3430;
	String type = "Smoothy";
	String mrp;
	int expireDate;
	
	Bread()
	{
		System.out.println("Bread color is brown");
	}
	
}



class BreadRunner{
	public static void main(String[] args)
	{
		System.out.println("Bread Runnig....");
		Bread ref = new Bread();
		System.out.println(ref.productionBatchNo);
		System.out.println(ref.type);
		System.out.println(ref.mrp);
		System.out.println(ref.expireDate);
	}
}