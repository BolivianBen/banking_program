package holman11;
//Benjamin Holman, Student ID 2371353


///I found this "import" option on a YouTube video. it helps format the output to a desired use
import java.text.DecimalFormat;

public class Account {
	   
		///Create the three private portions of the class
	   private String purpose;
	   private String number;
	   private double balance;
	   
	   
	   //uses the prewritten class that was imported
	   DecimalFormat df=new DecimalFormat("0.00");
	   
	   
	   //The first part of the account class that is public
	   public Account(String p,String n,double b) {
	       purpose=p;
	       number=n;
	       balance=b;}
	   
	   
	   //now I have to create all the methods that were requested in the problem
	   public String getPurpose(){
	       return purpose;}
	   
	   public double getBalance() {
	    return balance;}
	   
	   public void setBalance(double balance) {
	       this.balance = balance;}
	   
	   public String getNumber() {
	       return number;}
  
	   
	   
	   ///For this method, I must adds to the balance
	   public void deposit(double amt) {
	       balance+=amt;
	       System.out.println("Deposited $"+df.format(amt)+" to "+number);}
	   
	   
	   
	   //For this method. The balance needs to be taken away from
	   public void withdraw(double amt){
	       balance-=amt;
	       System.out.println(number+ " balance is "+df.format(balance));}
	   
	   //Must transfer an amount from one account to a different account
	   public void transfer(double amount,Account other){
	       this.balance-=amount;
	       other.deposit(amount);
	       System.out.println("Transfered $"+df.format(amount)+" from "+this.number+" to " +other.number);}
	   
	   // do the toString method that prints all the output for the user
	   @Override
	   public String toString() {
	       return "Account [purpose=" + purpose + ", number=" + number + ", balance=" + balance + "]";}

	   
	   
	   
	   
	   
	   
	   
	}