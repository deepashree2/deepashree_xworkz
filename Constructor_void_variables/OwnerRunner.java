class OwnerRunner{
	public static void main(String[] args){
		
		System.out.println("OwnerRunner is running");
		
		Owner ref = new Owner();
		ref.printIntanceVariables();
		System.out.println(" ");
		
		Owner ref1 = new Owner("Nandutha", 93532697, 33146541, "naditha07", "nanditha07@gmail.com");
		ref1.printIntanceVariables();
		System.out.println(" ");
		
		Owner ref2 = new Owner();
		ref2.ownerName="jeevan";
		ref2.ownerNum=6363587;
		ref2.ownerNetworth=96513213;
		ref2.twiterId="jeevan08";
		ref2.ownerEmail="jeevan08@gmail.com";
		ref2.printIntanceVariables();

	}
}