package vjezbanje;

public class treci_zadatak {

	public static void main(String[] args) {
		String custName = "Steve Smith";
		String firstName;
		int spaceIdx;
		StringBuilder sb;
		
		spaceIdx = custName.indexOf(" ");
		firstName = custName.substring(0, spaceIdx);
		System.out.println(firstName);
		
		sb = new StringBuilder(firstName);
		sb.append(" Smith");
		
		System.out.println(sb);

	}

}
