/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class defines an Order. Each vehicle order will need a Brand,
 * number of wheels, color, and an optional type.
 *
 */
public class Order {
	
	private Brand brand;
	private int wheels;
	private Type type;
	private String color;
	
	/**
	 * Constructor
	 * Initializes fields to null/0
	 */
	public Order()
	{
		brand = null;
		wheels = 0;
		type = null;
		color = null;
		
	}
	
	/**
	 * @return - The brand
	 */
	public Brand getBrand()
	{
		return this.brand;
	}
	
	/**
	 * @return - The number of wheels
	 */
	public int getWheels()
	{
		return this.wheels;
	}
	
	/**
	 * @return - The type (For motorcycles)
	 */
	public Type getType()
	{
		return this.type;
	}
	
	/**
	 * @return - The color
	 */
	public String getColor()
	{
		return this.color;
	}
	
	/**
	 * @param b - Brand
	 */
	public void setBrand(Brand b)
	{
		this.brand = b;
	}
	
	/**
	 * @param w - Wheel numbers
	 */
	public void setWheels(int w) 
	{
		this.wheels = w;
		
	}
	
	/**
	 * @param t - Type (For Motorcycles)
	 */
	public void setType(Type t) 
	{
		this.type = t;
		
	}
	
	/**
	 * @param c - Color
	 */
	public void setColor(String c)
	{
		this.color = c;
	}
}
