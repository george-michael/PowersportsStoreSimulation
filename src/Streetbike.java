/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class extends upon the  Motorcycle class and defines a Streetbike.
 * It sets the type to Street.
 *
 */
public class Streetbike extends Motorcycle{

	/**
	 *  Constructor
	 * @param b - Brand of Streetbike
	 * @param c - Color of Streetbike
	 * @param t - STREET
	 */
	public Streetbike(Brand b, String c, Type t)
	{
		super(b,c);
		type = t;
	}
}
