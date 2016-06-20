package final_Lab;
/**
 * person class which is responsible for person related responsibilities.
 * @since june,20,2016
 * @author Hassan Ali
 * @version 1
 */
public class Person {
/**
 * data menbers used to hold name and salary
 */
	private String name;
	private double salary;
	/**
	 * Constructor initilize name and salary
	 * @param name carry the name of the person
	 * @param salary carry the salary of the person
	 * This is constructor which carry name and salary of the person as arguments
	 *  and save it to the data member of this class.
	 */
	public Person(String name,double salary)
	{
		this.name=name;
		this.salary = salary;
	}
/**
 * Getter function return name of person
 * @return name return name of the person
 */
	public String getName() {
		return name;
	}
/**
 * Setter function set the name of person
 * @param name
 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * return salary of person
 * @return salary return salary of person 
 * 
 */
	public double getSalary() {
		return salary;
	}
/**
 * set the slary of the person
 * @param salary
 * 
 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
