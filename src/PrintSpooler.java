
public class PrintSpooler {
	private static PrintSpooler spooler;
	
	public static PrintSpooler getSpooler() {
		if (spooler == null) {
			spooler = new PrintSpooler();
		}
		return spooler;
	}
	
	public void printDocument (String s, String type) {
		if (type.equalsIgnoreCase("SI"))
			System.out.println("Simple Interest Loan");
		if (type.equalsIgnoreCase("AL"))
			System.out.println("Full Amortized Loan");
		System.out.println(s);
	}

}
