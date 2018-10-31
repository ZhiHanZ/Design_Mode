package template;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay d1 = new CharDisplay('9');
		AbstractDisplay d2  = new StringDisplay("19260817");
		AbstractDisplay d3  = new StringDisplay("1234567");
		d1.display();
	    d2.display();
	    d3.display();
	}

}
