import java.util.ArrayList;
/**
 * @author Michael George
 * ICSI405 - Final Project
 * 
 * This Class defines a shop, which has an inventory or vehicles. It contains 
 * a method which takes an order and determines if there is vehile to match
 * the order
 *
 */

public class Shop {
	
	/* To hold all the vehicles in the inventory */
	public ArrayList<Vehicle>  inventory = new ArrayList<>();
	
	public Shop()
	{
		/* Adding these ATV's to our inventory */
		inventory.add(new Quad(Brand.Yamaha, "Blue"));
		inventory.add(new Quad(Brand.Suzuki, "Yellow"));
		inventory.add(new Quad(Brand.Honda, "Red"));
		
		/* Adding these Dirtbike's to our inventory */
		inventory.add(new Dirtbike(Brand.Yamaha, "Blue",Type.Dirt));
		inventory.add(new Dirtbike(Brand.Honda,"White",Type.Dirt));
		inventory.add(new Dirtbike(Brand.Suzuki,"Yellow",Type.Dirt));
		
		/* Adding these Streetbike's to our inventory */
		inventory.add(new Streetbike(Brand.Honda,"Black",Type.Street));
		inventory.add(new Streetbike(Brand.Kawasaki,"Green",Type.Street));
		inventory.add(new Streetbike(Brand.Yamaha,"Blue",Type.Street));
		inventory.add(new Dirtbike(Brand.Honda,"White",Type.Street));
	}
	
	/**
	 * This method searches our inventory to see if there is a vehicle that matches
	 * the order
	 * @param od - The Customers order
	 * @return - True if there is a match, False if there is no match
	 */
	public Boolean searchInventory(Order od)
	{
		
		for(Vehicle i : inventory)
		{
			
			/* If the customer wants an ATV */
			if(od.getWheels() == 4 & od.getType() == null)
			{
				/* Only need to look at ATVS */
				if( i instanceof Quad)
				{
					/* If the brands match */
					if(i.getBrand().equals(od.getBrand()))
					{
						/* If the colors match */
						if(i.getColor().equals(od.getColor()))
						{
							return true;
						}
					}
					
				}
				
			}
			
			/* If the customer wants a Motorcycle */
			else if(od.getWheels() == 2)
			{
				/* If the customer wants a Dirtbike */
				if(od.getType().equals(Type.Dirt))
				{
					/* Only need to search through Dirtbikes */
					if( i instanceof Dirtbike)
					{
						/* If the brands match */
						if(i.getBrand().equals(od.getBrand()))
						{
							/* If the colors match */
							if(i.getColor().equals(od.getColor()))
							{
								return true;
							}
						}
						
					}
				}
				
				/* If the customer wants a Streetbike */
				if(od.getType().equals(Type.Street))
				{
					/* Only need to search through Dirtbikes */
					if( i instanceof Streetbike)
					{
						/* If the brands match */
						if(i.getBrand().equals(od.getBrand()))
						{
							/* If the colors match */
							if(i.getColor().equals(od.getColor()))
							{
								return true;
							}
						}
						
					}
					
				}
				
			}
		
		
		
		}
		return false;
	}
	
}