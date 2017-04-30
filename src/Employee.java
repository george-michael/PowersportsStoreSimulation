
/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class defines and Employee, it builds upon the person class by adding in
 * their job title
 *
 */
public class Employee extends Person {
	
	private String jobTitle;
	private Order currentOrder = new Order();
	
	/**
	 * Constructor
	 * @param n - Name
	 * @param g - Gender
	 * @param t - Job Title
	 */
	public Employee(String n, Gender g, String t)
	{
		super(n,g);
		this.jobTitle = t;
	}
	
	/*
	 * @return Job Title
	 */
	public String getJobTitle()
	{
		return this.jobTitle;
	}
	
	/**
	 * This method displays a greeting to the customer
	 */
	public void greetCustomer()
	{
		System.out.println("Welcome to Michael's Powersports");
		System.out.println("What would you like to purchase today?");
	}

	/**
	 * This method takes in the customers order and stores it
	 * @param od - Customers order
	 */
	public void takeOrder(Order od)
	{
		this.currentOrder.setBrand(od.getBrand());
		this.currentOrder.setColor(od.getColor());
		this.currentOrder.setWheels(od.getWheels());
		this.currentOrder.setType(od.getType());
		
	}
	
	/**
	 * This method displays the results of vehicle availability
	 * @param b - Boolean value of the availability of the vehicle
	 */
	public void displayAnswer(Boolean b)
	{
		if(b)
		{
			System.out.println("Congratulations, we have it in stock!, you "
					+ "can pick it up outside!");
		}
		else
		{
			System.out.println("Sorry, We currently don't have a vehicle"
					+ " that matches your specifications in stock");
		}
	}

	/**
	 * @return - Current order the employee has
	 */
	public Order getOrder() 
	{
		
		return this.currentOrder;
	}
	
	/**
	 * This method calculates the price of the vehicle that the customer is purchasing
	 * @param t - The Vehicle the customer is buying
	 * The param uses a generic type to allow us to use this method on an vehicle
	 */
	public <T extends Vehicle> void printRecipt(T t)
	{
		double cost;
		cost = 0;
		
		/* Calculating cost of vehicle */
		cost += (t.getBrand().equals(Brand.Kawasaki)) ? 4000 : 0;
		cost += (t.getBrand().equals(Brand.Honda)) ? 4000 : 0;
		cost += (t.getBrand().equals(Brand.Yamaha)) ? 3000 : 0;
		cost += (t.getBrand().equals(Brand.Suzuki)) ? 3500 : 0;
		
		cost += (t.getWheels() == 2) ? 1000 : 2000;
		
		System.out.printf("Your total is: %.2f\n",cost);
		
	}

}
