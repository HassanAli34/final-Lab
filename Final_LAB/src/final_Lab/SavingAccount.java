package final_Lab;
/**
 * person class which is responsible for saving account related responsibilities.
 * @since june,20,2016
 * @author Hassan Ali
 * @version 1
 */
public class SavingAccount extends Account {

	private double interestRate;
	/**
	 * its is an override methode
	 */
	@Override
	public boolean withdraw(double amount) {
		
		return false;
	}
	
	/**
	 * constructor intialize the interest rate
	 * @param interestRate
	 * @param no
	 * @param owner
	 */
	public SavingAccount(double interestRate , int no, Person owner) {
		super();
		this.interestRate = interestRate;
	}
	
	/**
	 * calculate the interest rate.
	 */
	public void addInterset()
	{
		
	}

}
