class FireExitguisherRunner{
	public static void main(String[] args){
		System.out.println("Fire Extinguisher is running........");
		
		FireExitguisher ref = new FireExitguisher();
		FireExitguisher ref1 = new FireExitguisher("Class A ", true, "carbon-based solids", 94, 6789.00);
		ref1.instancePrintVariables();
		
		System.out.println("UPdated variables......");
		FireExitguisher ref2 = new FireExitguisher();
		ref2.type= "Class B";
	    ref2.flamable= false;
		ref2.chemicalElement= "Dry Powder";
		ref2.speedOfPressure= 96;
		ref2.price= 5629.00;
		ref2.instancePrintVariables();
		
		
		
	}
}