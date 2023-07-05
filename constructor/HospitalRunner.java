class HospitalRunner{
	public static void main(String[] args){
		System.out.println("Hospital runner is running....");
		Hospital ref = new Hospital();
		
		Hospital ref1 = new Hospital("Jayadeva");
		System.out.println("Hospital name is: "+ref1.name);
		
		Hospital ref2 = new Hospital("SSM",234, 123,"vinna");
		System.out.println("Hospital name is: "+ref2.name);
		System.out.println("Hospital patients is: "+ref2.patients);
		System.out.println("Hospital nurses is: "+ref2.nurses);
		System.out.println("Hospital doctor name is: "+ref2.doctorName);
	}
}

		
		