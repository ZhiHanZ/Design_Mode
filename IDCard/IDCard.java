package IDCard;

import framework.Product;

public class IDCard extends Product {
	private String owner;
	public IDCard(String s) {
		// TODO Auto-generated constructor stub
		this.owner =s;
		System.out.println("Make "  + owner + "'s ID Card");
	}
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Use "  + owner + "'s ID Card");
	}
	public String getOwner() {
		return owner;
	}

}
