package manju;

public class cart {
	private Product[] products = new Product[10];
	private int count = 0;
	
	public void addProduct(Product p) {
		if(count < products.length) {
			products[count++] = p;
			System.out.println("Product added to the cart");
		}
		else {
			System.out.println("cart is full");
		}
	}
	public void showcart() {
		if(count ==0) {
			System.out.println("cart is empty");
			return;
		}
		for(int i =0;i<count;i++) {
			System.out.println(
					products[i].getName() + " : " + 
					products[i].calaculateprice());
	}
}
public double checkout() {
	double total = 0;
	for(int i=0;i<count;i++) {
		total += products[i].calaculateprice();
	}
	return total;
}
}
