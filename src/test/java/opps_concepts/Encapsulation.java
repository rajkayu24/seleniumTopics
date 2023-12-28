package opps_concepts;

public class Encapsulation {
private double balance;
 
public double getBalance() {
	return balance;
	 
 }
public void setBalance(double balance) {
	this.balance=balance;
}

public static void main(String[] args) {
Encapsulation e=new Encapsulation();

e.setBalance(1000);
System.out.println(e.balance);
	}

}
