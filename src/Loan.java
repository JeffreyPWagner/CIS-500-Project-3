import java.text.NumberFormat;


public abstract class Loan {

	protected String name;
	protected double interestRate;
	protected int length;
	protected double principle;
	protected double monthlyPayment;
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public Loan (String name, double rate, int years, double amount) {
		this.name = name;
		this.interestRate = rate;
		this.length = years;
		this.principle = amount;
	}
	
	public String process () {
		calcMonthlyPayment();
		return makeSummary();
	}
	
	abstract public void calcMonthlyPayment();
	
	public String makeSummary() {
		return "name: " + name + "\ninterest rate: " + String.format("%.2f%%",interestRate*100) + "\nlength: " + length + "\namount: " + formatter.format(principle) + "\npayment: " + formatter.format(monthlyPayment);
	}
	
	public String toString() {
		return "Loan";
	}
}
