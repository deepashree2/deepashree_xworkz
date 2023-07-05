class InfosysRunner{
	public static void main(String[] args){
		System.out.println("Infosys running in main.....");
		Infosys infosys = new Infosys();
	
		Infosys infosys1 = new Infosys("Narayana Murthi", "Sudha Murthi");
		System.out.println("founder Name is :"+infosys1.founderName);
		System.out.println("founder wife Name is :"+infosys1.founderWifeName);
	
		Infosys infosys2 = new Infosys("Narayana Murthi", "Sudha Murthi",1981);
		System.out.println("founder Name is :"+infosys2.founderName);
		System.out.println("founder wife Name is :"+infosys2.founderWifeName);
		System.out.println("founded at :"+infosys2.founded);
		
		Infosys infosys3 = new Infosys("Narayana Murthi", "Sudha Murthi",1981,187000);
		System.out.println("founder Name is :"+infosys3.founderName);
		System.out.println("founder wife Name is :"+infosys3.founderWifeName);
		System.out.println("founded at :"+infosys3.founded);
		System.out.println("Number of employees :"+infosys3.founded);
	}
}