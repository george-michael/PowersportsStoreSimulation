/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class defines a Customer, it extends upon the Person class and adds in an Order
 * data structure for the Customer to hold there vehicle order in
 *
 */
public class Customer extends Person{
	
	private Order order = new Order();
	
	/**
	 * Constructor
	 * @param n - Name of Customer
	 * @param g - Gender of Customer
	 */
	public Customer(String n, Gender g)
	{
		super(n,g);
	}

	/**
	 * This method sets the values of the customers order
	 * @param b
	 * @param w
	 * @param c
	 */
	public void setOrder(Brand b, int w, String c)
	{
		this.order.setBrand(b);
		this.order.setWheels(w);
		this.order.setColor(c);
	}
	
	/**
	 * This method sets the values of the customers order
	 * @param b
	 * @param w
	 * @param t
	 * @param c
	 */
	public void setOrder(Brand b, int w, String c, Type t)
	{
		this.order.setBrand(b);
		this.order.setWheels(w);
		this.order.setType(t);
		this.order.setColor(c);
	}
	
	/**
	 * @return The customers Order
	 */
	public Order getOrder()
	{
		return this.order;
	}

	/**
	 * This method prints out the specifications of the customers order
	 */
	
	public void showOrder() 
	{
		if(order.getType() != null)
		{
		System.out.println("I would like a " + order.getColor() + " " + order.getBrand() +
					" with " + order.getWheels() + " wheels (" + order.getType() + ")");
		}
		
		else
		{
		System.out.println("I would like a " + order.getColor() + " " + order.getBrand() +
					" with " + order.getWheels() + " wheels");
		}
			
	}
		

}
