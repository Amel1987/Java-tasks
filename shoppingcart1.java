package Exercise;

public class shoppingcart1 {

	public static void main(String[] args) {
		String custName = "Mary Smith";
		String itemDesc = "Shirt";
		String message = custName + " wants to purchase a " + itemDesc;
		
		double price = 29.99;
		int quantity = 2;
		double tax = 1.04;
		double total;
		
		message = custName + " wants to purchase " + quantity + " " + itemDesc;
		total = quantity * price * tax;

		System.out.println(message);
		System.out.println(total);
	}

}
