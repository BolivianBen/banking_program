package holman11;

//Benjamin Holman, Student ID 2371353


///Going to use arrays and ArrayLists like chap 11, so import those
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//This is not an extension of the account class. It just will provide all the data that is put into that and the other classes.
public class Banking {

	   public static void main(String[] args) {
	       
		   
		   //I have to create the three objects that each have names to be plugged into the "p, n, and b" from the account class
	       Savings savings=new Savings("college","#S1234",5000,1.75);
	       Checking checking=new Checking("bills","#C2311",8000,0);
	       Savings car=new Savings("new car","#S2567",2000,2.125);
	       
	       
	       
	       
	       ///make an array of the objects and then add the three objects I just made into that arrayList
	       Account[] accounts=new Account[3];
	       accounts[0]=savings;
	       accounts[1]=checking;
	       accounts[2]=car;
	       
	       
	      
	       ///Use a for loop to display the details of the accounts
	       for(int i=0;i<3;i++)
	           System.out.println(accounts[i].toString()+"\n");
	       
	       
	       //going to call all the methods from the other classes that I wrote...
	       ///going to put in the numbers from the problem to create an output for the user.
	       accounts[0].deposit(1500);
	       accounts[2].transfer(800, accounts[1]);
	       
	       System.out.println("Paid $350 from checking for groceries, etc.");
	       accounts[1].withdraw(350);
	       
	       ///create a blank line
	       System.out.println();
	       
	       
	       
	       //use the "addInterest" Method for the accounts to calculate the interest
	       savings.addInterest();
	       car.addInterest();
	       
	       //new line
	       System.out.println();
	       
	       ///NowThe users has to actually input information and I'll run it against the methods from the classes
	       Scanner input=new Scanner(System.in);
	       
	       System.out.print("\nEnter checking account withdrwal amount ");
	       double amount = input.nextDouble();
	       accounts[1].withdraw(amount);
	       
	       
	 
	       ///Take the Array I made eailer and turn it into an arraylist to be shown to the user via a for loop
	       ArrayList<Account> listaccounts=new ArrayList<Account>(Arrays.asList(accounts));
	       System.out.println("\nMy Arraylist of accounts");
	       for(Account am:listaccounts)
	           System.out.println(am.toString()+"\n");}

	}

