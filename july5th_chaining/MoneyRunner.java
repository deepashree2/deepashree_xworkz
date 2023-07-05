class MoneyRunner{
	public static void main(String[] args){
		System.out.println("MoneyRunner is runnig....");
		Money money = new Money();
		
		Money money1 = new Money("USA");
		System.out.println("Country :"+money1.country);
	
		Money money2 = new Money("USA","dollars");
		System.out.println("Country :"+money2.country);
		System.out.println("currency :"+money2.currency);
		
		Money money3 = new Money("India","Ruppes","Coins","online");
		System.out.println("Country :"+money3.country);
		System.out.println("currency :"+money3.currency);
		System.out.println("denomication :"+money3.denomication);
		System.out.println("type :"+money3.type);
	
	
	}
}	