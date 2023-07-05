class Money{
	String country;
	String currency;
	String denomication;
	String type;
	
	Money(){
		System.out.println("Money running with no arguments....");
	}
	
	Money(String country){
		System.out.println("Money running with country");
		this.country=country;
	}
	
	Money(String country, String currency){
		System.out.println("Money running with country& currency");
		this.country=country;
		this.currency=currency;
	}
	
	Money(String country, String currency,String denomication,String type){
		this(country,currency);
		System.out.println("Money running with country, currency, denomication & type");
		this.denomication=denomication;
		this.type=type;
	}
	
	
}

