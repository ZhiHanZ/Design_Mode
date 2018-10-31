package IDCard;

import java.util.ArrayList;
import java.util.List;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
	private List<IDCard> list = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		IDCard id = new IDCard(owner);
		return id;
	}

	@Override
	protected void registerProduct(Product p) {
		list.add((IDCard)p);
	}
	public List getOwners() {
		return list;
	}

}
