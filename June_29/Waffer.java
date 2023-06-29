class Waffer{
	int productionBatchNo = 3090;
	String type = "thin";
	String mrp;
	int expireDate;
	
	Waffer()
	{
		System.out.println("Waffer is nice");
	}
	
}



class WafferRunner{
	public static void main(String[] args)
	{
		System.out.println("Waffer Runnig....");
		Waffer ref = new Waffer();
		System.out.println(ref.productionBatchNo);
		System.out.println(ref.type);
		System.out.println(ref.mrp);
		System.out.println(ref.expireDate);
	}
}