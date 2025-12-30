package manju;

public class Electronics  extends Product{
public Electronics(String name, double price, int quantity) {
		super(name, price, quantity);
	}
@Override
public double calaculateprice() {
	return getPrice()*getQuantity()*1.18;
}

}


