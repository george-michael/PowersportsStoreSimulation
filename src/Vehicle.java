/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class represents the basic properties of a vehicle. Where each
 * vehicle will have a brand, and a number of wheels.
 *
 */
public abstract class Vehicle {

	private Brand brand;
	private String color;
	public int wheels;
	
	/**
	 * Constructor
	 * @param b - The brand of the Vehicle
	 * @param w - The nunmber of wheels on the Vehicles
	 */
	public Vehicle(Brand b, String c)
	{
		this.brand = b;
		this.color = c;
	}
	
	/**
	 * @return - The brand of the vehicle
	 */
	public Brand getBrand()
	{
		return this.brand;
	}
	
	/**
	 * @return - The color of the vehicle
	 */
	public String getColor()
	{
		return this.color;
	}
	
	/**
	 * @return - The number of wheels the vehicle has
	 */
	public int getWheels()
	{
		return this.wheels;
	}
}
