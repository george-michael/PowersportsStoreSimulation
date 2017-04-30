/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This class is the driver class for our power sports store simulations. It simulates customers
 * coming into a power sports store and trying to purchase Quads, Dirtbikes, Streetbikes.
 *
 */
public class PowersportsDriver {
	
	public static void main(String args[])
	{
		Boolean avail;
		
		/* Creating our shop to simulate*/
		Shop PowersportsShop = new Shop();
		
		/* Creating a customer and an employee*/
		Customer customer1 = new Customer("Michael George", Gender.Male);
		Employee salesman = new Employee("Jackson Baker", Gender.Male, "Salesman");
		
		/* Greeting Customer */
		salesman.greetCustomer();
		
		/* Customer deciding what they want to buy */
		customer1.setOrder(Brand.Kawasaki, 2, "Green", Type.Dirt);
		customer1.showOrder();
		
		/* Sales man taking customer order */
		salesman.takeOrder(customer1.getOrder());
		
		/* Checking vehicle inventory */
		avail = PowersportsShop.searchInventory(salesman.getOrder());
		
		/* Employee displaying answer */
		salesman.displayAnswer(avail);
		
	/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
		Customer customer2 = new Customer("Sarah Snow", Gender.Female);
		
		/* Greeting Customer */
		System.out.println();
		salesman.greetCustomer();
		
		/* Customer deciding what they want to buy */
		customer2.setOrder(Brand.Honda, 4, "Red");
		customer2.showOrder();
		
		/* Sales man taking customer order */
		salesman.takeOrder(customer2.getOrder());
		
		/* Checking vehicle inventory */
		avail = PowersportsShop.searchInventory(salesman.getOrder());
		
		/* Employee displaying answer */
		salesman.displayAnswer(avail);
		salesman.printRecipt(new Quad(Brand.Honda,"Honda"));
		
		
		/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
		Customer customer3 = new Customer("Justin Yang", Gender.Male);
		
		/* Greeting Customer */
		System.out.println();
		salesman.greetCustomer();
		
		/* Customer deciding what they want to buy */
		customer3.setOrder(Brand.Yamaha, 2, "Blue",Type.Street);
		customer3.showOrder();
		
		/* Sales man taking customer order */
		salesman.takeOrder(customer3.getOrder());
		
		/* Checking vehicle inventory */
		avail = PowersportsShop.searchInventory(salesman.getOrder());
		
		/* Employee displaying answer */
		salesman.displayAnswer(avail);
		salesman.printRecipt(new Streetbike(Brand.Yamaha, "Blue",Type.Street));
		
		/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
		Customer customer4 = new Customer("Morgan Bentley", Gender.Female);
		
		/* Greeting Customer */
		System.out.println();
		salesman.greetCustomer();
		
		/* Customer deciding what they want to buy */
		customer4.setOrder(Brand.Suzuki,4, "White");
		customer4.showOrder();
		
		/* Sales man taking customer order */
		salesman.takeOrder(customer4.getOrder());
		
		/* Checking vehicle inventory */
		avail = PowersportsShop.searchInventory(salesman.getOrder());
		
		/* Employee displaying answer */
		salesman.displayAnswer(avail);
		
		
		
	}

}
