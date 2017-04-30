/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This Quad(ATV) class extends the Vehicle class, but sets the number of wheels to 4.
 *
 */
public class Quad extends Vehicle{
	
	/**
	 * Constructor
	 * @param b - Brand of ATV
	 * @param c - Color of ATV
	 */
	public Quad(Brand b, String c)
	{
		super(b,c);
		wheels = 4;
	}

}
