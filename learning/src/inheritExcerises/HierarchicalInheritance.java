package inheritExcerises;

class BankAccount{
	
	long accountNumber=123456789;
	double balance=3003.25;
	
	void showBalance() {
		
		System.out.println( "AccountNumber "+ accountNumber + "|" + " Balance "+balance );
	}
}
class SavingsAccount extends BankAccount{
	
	double interestRate = 3.5;
	void addInterest() {
		System.out.println("Interest Rate:  " +interestRate + "%" );
		double newbalance =balance+(balance*interestRate/100);
		System.out.println("Interest Added! New Balance: "+ newbalance);
	}
}

class CurrentAccount extends BankAccount{
	
	int overdraftLimit = 100000;
	
	void showOverdraft() {
		System.out.println("Overdraft Limit:  "+ overdraftLimit);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		  SavingsAccount sa = new SavingsAccount();
	        sa.showBalance();
	        sa.addInterest();
	        
	        CurrentAccount ca = new CurrentAccount();
	        ca.showBalance();
	        ca.showOverdraft();
		

	}

}
