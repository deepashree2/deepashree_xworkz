package deepashree_xworkz;

public class ContactLensRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ContactLensRunner running..");
		ContactLens ref = new ContactLens();
		ContactLens ref1 = new ContactLens(true);
		ref1.Display();
		ContactLens ref2 = new ContactLens(false);
		ref2.Display();
		
	}

}
