package Exercise;

public class customer02 {

	public static void main(String[] args) {
		customer customer01 = new Customer();
		
		System.out.println(customer01.name);
		customer01.age = 40;
	
		customer01.requestDiscoun();
		customer01.displayCustomer();
	}

}
