class Own{
	String name;
	int age;
	String friend;
	
	Own(){
		System.out.println("Own is running with no arguments....");
	}
	
	Own(String name, int age)
	{
		System.out.println("The name is :"+name);
		System.out.println("age  is :"+age);
	}
	
	Own(String name1, int age1, String friend1)
	{
		System.out.println("name is :"+name1);
		System.out.println("age  is :"+age1);
		System.out.println("friend is :"+friend1);
		this.name=name1;
		this.age=age1;
		this.friend=friend1;
	}
	
}
class OwnRunner{
	public static void main(String[] args){
		System.out.println("OwnRunner is runing...");
		Own ref = new Own();
		Own ref1 = new Own("Nethra", 21);
		Own ref2 = new Own("sahana",21, "Nethra");
	}
}