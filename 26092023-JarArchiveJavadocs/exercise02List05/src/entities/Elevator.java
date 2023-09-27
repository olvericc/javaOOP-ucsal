package entities;

public class Elevator 
{
	private int currentFloor;
	private int totalFloors;
	private int capacity;
	private int peopleQuantity;
	
	/**
	 * constructor method that receives as parameters
	 * the number of floors and the capacity of people
	 * in the elevator.
	 * 
	 * @param totalFloors
	 * @param capacity
	 */
	public Elevator(int totalFloors, int capacity)
	{
		this.currentFloor = 0;
		this.totalFloors = totalFloors;
		this.capacity = capacity;
		this.peopleQuantity = 0;	
	}
	
	/**
	 * method to add people from the elevator
	 * increasing the number of people attribute.
	 *  
	 * @param capacity
	 * @param peopleQuantity
	 * @return
	 */
	public boolean enter()
	{
		if (this.peopleQuantity < this.capacity)
		{
			this.peopleQuantity++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * method to remove people from the elevator
	 * decreasing the number of people attribute.
	 * 
	 * @return
	 */
	public boolean leave()
	{
		if (this.peopleQuantity > 0)
		{
			this.peopleQuantity--;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * method for descending a floor in the elevator.
	 * 
	 * @return
	 */
	public boolean up()
	{
		if (this.currentFloor < this.totalFloors)
		{
			this.currentFloor++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * method for going up a floor in the elevator.
	 * 
	 * @return
	 */
	public boolean down()
	{
		if (this.currentFloor > 0)
		{
			this.currentFloor--;
			return true;
		}
		else
		{
			return false;
		}
	}

	public int getCurrentFloor() 
	{
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) 
	{
		this.currentFloor = currentFloor;
	}

	public int getTotalFloors() 
	{
		return totalFloors;
	}

	public void setTotalFloors(int totalFloors) 
	{
		this.totalFloors = totalFloors;
	}

	public int getCapacity() 
	{
		return capacity;
	}

	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}

	public int getPeopleQuantity() 
	{
		return peopleQuantity;
	}

	public void setPeopleQuantity(int peopleQuantity) 
	{
		this.peopleQuantity = peopleQuantity;
	}
}
