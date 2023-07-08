class Owner{
	
	String ownerName;
	long ownerNum;
	long ownerNetworth;
	String twiterId;
	String ownerEmail;
	
	Owner(){
		System.out.println("Owner running with no arguments....");
	}
	
	Owner(String ownerName, long ownerNum, long ownerNetworth, String twiterId, String ownerEmail){
		this.ownerName=ownerName;
		this.ownerNum=ownerNum;
		this.ownerNetworth=ownerNetworth;
		this.twiterId=twiterId;
		this.ownerEmail=ownerEmail;	
	}
	
	void printIntanceVariables(){
		System.out.println("ownerName:"+ownerName);
		System.out.println("ownerNum:"+ownerNum);
		System.out.println("ownerNetworth:"+ownerNetworth);
		System.out.println("twiterId:"+twiterId);
		System.out.println("ownerEmail:"+ownerEmail);
	}
}

