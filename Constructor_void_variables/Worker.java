class Worker{
	
	String name;
	String workerId;
	int age;
	double salary;
	String role;
	
	Worker(){
		System.out.println("Worker running with no arguments.....");
	}
	
	Worker(String name, String workerId, int age, double salary, String role){
		this.name=name;
		this.workerId=workerId;
		this.age=age;
		this.salary=salary;
		this.role=role;
	}
	
	void printInstanceVariables(){
		System.out.println(this.name);
		System.out.println(this.workerId);
		System.out.println(this.age);
		System.out.println(this.salary);
		System.out.println(this.role);
	}
}


		
	