class OilRunner{
	public static void main(String[] args){
		System.out.println("OilRunner is running....");
		
		Oil ref = new Oil();
		ref.printInstanceVariables();
		
		Oil ref1 = new Oil("diesel", "good", 78, 89.00, 1001 );
		ref1.printInstanceVariables();
		
		Oil ref2 = new Oil();
		ref2.oilName="Petrol";
		ref2.Qualilty="bad";
		ref2.Quantity=234;
		ref2.price=100.00;
		ref2.productId=1234;
		ref2.printInstanceVariables();

	}
}
		