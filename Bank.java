import java.util.*;

public class Bank {
String name;
double balance;
String Account_type;
Bank(String name,double balance, String Account_type){
	this.name=name;
	this.balance=balance;
	this.Account_type=Account_type;
}
void deposit(double amount) {
	balance=balance+amount;
	System.out.println("Deposit" +amount);
}
void withdraw(double amt) {
	if(amt<balance) {
		balance=balance-amt;
		System.out.println("Withdraw amount" +amt);
	}else {
		System.out.println("Insufficient balance!");
	}
}
void display() {
	System.out.println("-------Account Details------");
	System.out.println("Account_Holder Name:" +name);
	System.out.println("Account balance:" +balance);
	System.out.println("Accoun Type:" +Account_type);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Holder Name:" );
		String nam=sc.nextLine();
		System.out.println("Enter balance:" );
		double bal=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Account_type:" );
		
		String acc=sc.nextLine();
		Bank b1=new Bank(nam, bal,acc);
		System.out.println("Enter deposit amount:");
		double amt=sc.nextDouble();
		b1.deposit(amt);
		System.out.println("Enter withdrawal amount:");
		double with=sc.nextDouble();
		b1.withdraw(with);
		b1.display();
		
		sc.close();
	

	}

}
