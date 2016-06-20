package final_Lab;
/**
 * person it is an abstract class 
 * @since june,20,2016
 * @author Hassan Ali
 * @version 1
 */
public abstract class Account {

	protected int number;
	protected double bal;
	/**
	 * get the account number
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * return the account current balance
	 * @return bal
	 */
	public double getBal() {
		return bal;
	}
	/**
	 * return info about Owner of the account
	 * @return person
	 */
	public Person getOwner()
	{
		return null;
	}
	/**
	 * deposite new amount to account
	 * @param amount
	 */
	public void deposite(double amount)
	{
		
	}
	/**
	 * abstract methode for amount withdraw
	 * @param amount
	 * @return bool
	 */
	public abstract boolean withdraw(double amount);

	
	
}
