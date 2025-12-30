package manju;
import java.util.*;

public class shoppingapp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cart cart = new cart();
		int choice;
		
		do {
			System.out.println("\n1. Add Electronics");
            System.out.println("2. Add Clothing");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cart.addProduct(
                        new Electronics("Mobile", 20000, 1)
                    );
                    System.out.println("Electronic product added to the cart");
                    break;

                case 2:
                    cart.addProduct(
                        new clothing("Shirt", 1500, 2)
                    );
                    System.out.println(" clothing product added to the cart");
                    break;

                case 3:
                    cart.showcart();
                    System.out.println("The products in your cart are ");
                    break;

                case 4:
                	System.out.println("Total bill to pay");
                    System.out.println("Total Bill: " + cart.checkout());
                    break;

                case 5:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
		}while(choice !=5);
	}
}
