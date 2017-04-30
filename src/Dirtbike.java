/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class extends upon the  Motorcycle class and defines a Dirtbike.
 * It sets the type to Dirt.
 *
 */
public class Dirtbike extends Motorcycle{
	
	/**
	 * Constructor
	 * @param b - Brand of the Dirtbike
	 * @param c - Color of the Dirtbike
	 * @param t - DIRT
	 */
	public Dirtbike(Brand b, String c, Type t)
	{
		super(b,c);
		type = t;
	}
	

}
