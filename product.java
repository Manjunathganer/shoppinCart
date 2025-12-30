package manju;
abstract class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name, double price, int quantity) {
    	this.name = name;
    	this.price = price;
    	this.quantity = quantity;
    }
    public abstract double calaculateprice();
    
    public String getName() {
    	return name;
    }
    protected double getPrice() {
    	return price;
    }
    protected int getQuantity() {
    	return quantity;
    }
	public double calculaterice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
