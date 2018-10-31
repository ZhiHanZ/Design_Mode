package IDCard;

import framework.Factory;
import framework.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
	       Product card1 = factory.create("小米");
	       Product card2 = factory.create("红米");
	       Product card3 = factory.create("黑米");
	       card1.use();
	       card2.use();
	       card3.use();
	}

}
