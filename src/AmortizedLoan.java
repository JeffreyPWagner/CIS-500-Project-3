/*****************************************************************
Representation of a fully amortized loan in the system

@author Jeffrey Wagner
@version Fall 2018
*****************************************************************/


public class AmortizedLoan extends Loan{

	/*****************************************************************
    Constructor creates a loan with specified attributes
    @param name the name of the applicant
    @param rate the interest rate of the loan
    @param years the length of the loan in years
    @param amount the amount of the loan
    *****************************************************************/
	public AmortizedLoan(String name, double rate, int years, double amount) {
		super(name, rate, years, amount);
	}
	
	
	/*****************************************************************
    Calculates the monthly loan payment
    *****************************************************************/
	public void calcMonthlyPayment() {
		
		/** monthly interest rate */
		double monthlyInterest = interestRate / 12;
		
		/** length of the loan in months */
		int lengthMonths = length * 12;
		
		/** value used to calculate monthly payment */
		double n = Math.pow(1 + monthlyInterest, lengthMonths);
		
		monthlyPayment = (principle * monthlyInterest * n) / (n - 1);
	}
	
	
	/*****************************************************************
	Converts the loan to a printable string
	*****************************************************************/
	public String toString() {
		return "Full Amortized Loan";
	}
}
