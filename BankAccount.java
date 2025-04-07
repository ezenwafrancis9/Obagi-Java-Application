public class BankAccount{
	String accountName = "Big Francis";
	String accountNumber = "9124336673";
	double accountBalance = 5987567.66;
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		System.out.printf("Account name is %s%n",bank.accountName);
		System.out.printf("Account number is %s%n",bank.accountNumber);
		System.out.printf("Account balance is %.2f%n",bank.accountBalance);
		

		bank.withdrawal(50000);
		System.out.printf("Your balance is %.2f%n",bank.accountBalance);
	}
	public double withdrawal(int amount){
		accountBalance -= amount;
		
		return accountBalance;
	}
	
	public int deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
	
}