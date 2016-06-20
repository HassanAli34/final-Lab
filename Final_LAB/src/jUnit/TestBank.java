package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import final_Lab.Bank;
import final_Lab.CheckingAccount;
import final_Lab.Person;

public class TestBank {

	@Test
	public void testAddAccount() {
		Bank bank = new Bank();
		Person person = new Person("hassan", 4000);
		CheckingAccount cAcc = new CheckingAccount(0.3, 31045, person);
		bank.addAccount(cAcc);
		assertEquals("complete", "complete");
	}

	@Test
	public void testSelectAccount() {
		fail("Not yet implemented");
	}

}
