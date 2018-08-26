package vjezbanje;

public class drugi_zadatak {

	public static void main(String[] args) {
		String custName = "Steve Smith";
		String firstName;
		int spaceIdx;
		
		spaceIdx = custName.indexOf(" ");
			
		firstName = custName.substring(0, spaceIdx);
		System.out.println(firstName);
	}

}
