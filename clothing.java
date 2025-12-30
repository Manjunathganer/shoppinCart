package manju;

public class clothing extends Product {
	public clothing(String name, double price, int quantity) {
		super(name, price,quantity);
	}
	
	@Override
	public double calaculateprice() {
		return getPrice()* getQuantity()* 0.90;
	}
}

