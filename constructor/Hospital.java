class Hospital{
	String name;
	int patients;
	int nurses;
	String doctorName;
	
	Hospital(){
	System.out.println("Runing with no arguments..");
	}
	Hospital(String name){
		System.out.println("Runing with name...");
		this.name=name;
	}
	
	Hospital(String name, int patients, int nurses,String doctorName ){
		System.out.println("Runing with name patients nurses and doctorName...");
		this.name=name;
		this.patients=patients;
		this.nurses=nurses;
		this.doctorName=doctorName;
	}
}
	
