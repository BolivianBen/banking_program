package holman11;

//Benjamin Holman, Student ID 2371353


///Make sure that this class is an extension of the account class
	public class Checking extends Account{
	
	
	   //Create a CONSTANT by using final and give it value 500
	   private final double OVER_LIMIT=500;
	   
	   
	   //create the private variable for this class
	   private int transactions;
	   
	   
	   //now make the public portions of the class
	   public Checking(String p,String n,double b,int t) {
	       super(p,n,b);
	       transactions=t;}
	   
	   
	   //get all the methods for this class
	   
	   public int getTransactions() {
	       return transactions;}
	   
	   public void setTransactions(int transactions) {
	       this.transactions = transactions;}
	   
	   
	   //This is the method that has to overrides the account part, if the amount is over the OVERLIMIT constant.
	   //I'm going to see if it needs to over-ride the amount by using an if statement
	   public void withdraw(double amount){
	       if(getBalance()+OVER_LIMIT<amount)
	           System.out.println("Denied. Insufficient funds!");
	       ///if the transaction isn't denied, the amount can be withdrawn
	       else{
	           super.withdraw(amount);
	           	transactions++;}}
	   
	   
	   
	   //Than do the toString method that prints all the output again
	   @Override
	   public String toString() {
	       return "Checking Account "+getNumber()+" for "+getPurpose()+"\nBalance $"+df.format(getBalance())+", # of transactions: "+getTransactions();}


	}
