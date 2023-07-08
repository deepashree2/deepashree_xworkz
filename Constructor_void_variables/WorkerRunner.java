class WorkerRunner{
	public static void main(String[] args){
		
		System.out.println("WorkerRunner is runing.....");
		
		Worker ref = new Worker();
		ref.printInstanceVariables();
		
		Worker ref1 = new Worker("Bhavya","1001XD",34,234556.00,  "Software developer");
		ref1.printInstanceVariables();
		
		System.out.println("Updating data...");
		Worker ref2 = new Worker();
		ref2.name="Nandini";
		ref2.workerId="1002XD";
		ref2.age=23;
		ref2.salary=56000.00;
		ref2.role="backend developer";
		ref2.printInstanceVariables();
	}
}