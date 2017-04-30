/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class represents a person, where each person has
 * a gender and a name
 */
public abstract class Person {
	
	private Gender gend;
	private String name;
	
	/**
	 * Constructor
	 * @param n - The name of the Person
	 * @param g - The gender of the Person
	 */
	Person(String n, Gender g)
	{
		this.name = n;
		this.gend = g;
	}

	/**
	 * @return - The gender of the Person
	 */
	public Gender getGender()
	{
		return this.gend;
	}
	
	/**
	 * @return - The name of the Person
	 */
	public String getName()
	{
		return this.name;
	}
}
