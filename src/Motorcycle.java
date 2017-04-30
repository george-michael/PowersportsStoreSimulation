/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This abstract class extends upon the Vehicle class and defines a Motorcycle
 * class. It sets the number of wheels to 2, and adds in a type field (Either Street or Dirt).
 *
 */
public abstract class Motorcycle extends Vehicle{
	
	public Type type;
	
	/**
	 * Constructor
	 * @param b - Brand of motorcycle
	 * @param c - Color of motorcycle
	 */
	public Motorcycle(Brand b, String c)
	{
		super(b,c);
		wheels = 2;
	}
	
	/**
	 * @return The type of the vehicle
	 */
	public Type getType()
	{
		return this.type;
	}

}
