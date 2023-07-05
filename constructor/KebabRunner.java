class KebabRunner{
		public static void main(String[] args){
			System.out.println("KebabRunner is runing...");
			Kebab ref =new Kebab();
			
			Kebab ref1 =new Kebab("Chiken");
			System.out.println("name is :"+ref1.name);
			
			Kebab ref2 = new Kebab("Mutton",200.00);
			System.out.println("name is :"+ref2.name);
		    System.out.println("price :"+ref2.price);
		
			Kebab ref3= new Kebab("Mashrum", 50.00, "Udupi hotel", 8);
			System.out.println("name is :"+ref3.name);
			System.out.println("price is :"+ref3.price);
			System.out.println("hotel Name is :"+ ref3.hotelName);
			System.out.println("Number of Pieces :"+ref3.noOfPieces);
		
			Kebab ref4= new Kebab("Chiken", 100.00, "empire", 6, true);
			System.out.println("name is :"+ref4.name);
			System.out.println("price is :"+ref4.price);
			System.out.println("hotel Name is :"+ ref4.hotelName);
			System.out.println("Number of Pieces :"+ref4.noOfPieces);
			System.out.println("takeway :"+ref4.takeway);
		}
}