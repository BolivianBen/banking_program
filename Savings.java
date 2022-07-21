package holman11;

//Benjamin Holman, Student ID 2371353

///make sure it extends account class
public class Savings extends Account {
	
	
	   //make private double
	   private double intRate;
	   
	   
	   
	
	   ////Add the public constructors that are used from account class
	   public Savings(String p,String n,double balance,double rate) {
	       super(p,n,balance);
	       intRate=rate;}
	   
	   
	   //make the public methods for this class
	   public double getIntRate() {
	       return intRate;}
	   
	   public void setIntRate(double intRate) {
	       this.intRate = intRate;}
	   
	   
	   //This method has to do actual math of adding to the account and calculating the rate
	   public void addInterest(){
	       System.out.println("Savings account "+getNumber()+" account earned $"+df.format(getBalance()*(intRate/100))+" interest");
	       deposit(((intRate/100)*getBalance()));}
	  
	   
	   
	   //do the ToString method again that prints out the output for the user once banking class is written

	   @Override
	   public String toString() {
	       return "Savings Account "+getNumber()+" for "+getPurpose()+"\nBalance $"+df.format(getBalance())+", interest Rate: "+getIntRate()+"%";
	   }


	}