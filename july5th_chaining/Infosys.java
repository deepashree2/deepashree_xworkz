class Infosys{
		String founderName;
		String founderWifeName;
		int founded;
		int totalOfEmployees;
		
		Infosys(){
			System.out.println("Infosys running with no arguments...");
		}
		
		Infosys(String founderName,String founderWifeName){
			System.out.println("Infosys running with founderName & founderWifeName...");
			this.founderName=founderName;
			this.founderWifeName=founderWifeName;
			System.out.println("Infosys running with founderName,founderWifeName & founded...");
		}
		
		Infosys(String founderName,String founderWifeName, int founded){
			this(founderName, founderWifeName);
			System.out.println("Infosys running with founderName,founderWifeName & founded...");
			this.founded=founded;
		}

		Infosys(String founderName,String founderWifeName, int founded, int totalOfEmployees){
			this(founderName, founderWifeName);
			System.out.println("Infosys running with founderName founderWifeName founded & totalOfEmployees...");
			//this.founderName=founderName;
			//this.founderWifeName=founderWifeName;
			this.founded=founded;
			this.totalOfEmployees=totalOfEmployees;
		}
}

