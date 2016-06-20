package final_Lab;
/**
 * person class which is responsible for checking account related responsibilities.
 * @since june,20,2016
 * @author Hassan Ali
 * @version 1
 */
public class CheckingAccount extends Account {

	private double chargeRate;
	/**
	 * override methode for withdraw
	 */
	@Override
	public boolean withdraw(double amount) {

		return false;
	}
	/**
	 * constructor initialize the chargeRate
	 * @param chargeRate
	 * @param no
	 * @param o
	 */
	public CheckingAccount(double chargeRate, double no, Person o) {
		super();
		this.chargeRate = chargeRate;
	}
	/**
	 * deduct the charge amount from the account
	 */
	public void payCharge()
	{
		
	}

	
}
