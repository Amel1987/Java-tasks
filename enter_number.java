import java.util.Scanner;

public class enter_number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");

		int num = scan.nextInt();
		
		scan.close();
		
		System.out.println("The number entered by user: "+num);
		
	}
	
}
