import java.util.*;


public class LoanApplication {

	 Scanner scnr = new Scanner(System.in);
	
	 private Loan loan;
	 private String summary;
	 private String name;
	 private String type;
	 private double interestRate;
	 private int length;
	 private double principle;
	 private boolean moreLoans = true;

	 public void run() {
		 
		 while (moreLoans) {
			 System.out.println("Enter applicant name");
			 name = scnr.next();
			 System.out.println("Enter the interest rate");
			 interestRate = scnr.nextDouble();
			 System.out.println("Enter length of the loan in years");
			 length = scnr.nextInt();
			 System.out.println("Enter the amount of the loan");
			 principle = scnr.nextDouble();
			 System.out.println("Enter SI for simple interest or AL for amortized loan");
			 type = scnr.next();
			 
			 if (type.equalsIgnoreCase("SI")) {
				 loan = new SimpleLoan(name, interestRate, length, principle);
			 }
			 
			 else if (type.equalsIgnoreCase("AL")) {
				 loan = new AmortizedLoan(name, interestRate, length, principle);
			 }
			 
			 else {
				 System.out.println("Invalid loan type, start again");
				 continue;
			 }
			 
			 summary = loan.process();
			 
			 PrintSpooler.getSpooler().printDocument(summary, type);
			 
			 System.out.println("Process another loan? (Y/N)");
			 if (scnr.next().equalsIgnoreCase("N")) {
				 moreLoans = false;
			 }
		 }
	 }
}
