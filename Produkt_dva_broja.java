import java.util.Scanner;

public class Produkt_dva_broja {

	public static void main(String[] args) {
		int a;
		int b;
		int rez;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first sum: \n");
		a=input.nextInt();
		
		System.out.print("Enter the second sum: \n");
		b=input.nextInt();
		
		rez=a*b;
		System.out.println("Result of your work is: " +rez);
	}

}
