package applications;

import java.util.Random;

import entities.Elevator;

public class Program 
{
	public static void main(String[] args) 
	{
		
		int quantityToEnter;
		int quantityToLeave;
		
		Random random = new Random();
		
		Elevator elevator1 = new Elevator(3, 5);
		
		for (int i = 0; i <= elevator1.getTotalFloors(); i++) 
		{
			System.out.println("Floor: " + elevator1.getCurrentFloor());
			
			quantityToLeave = random.nextInt(elevator1.getPeopleQuantity() + 1);
			quantityToEnter = random.nextInt(elevator1.getCapacity() - elevator1.getPeopleQuantity() + 1);
			
			System.out.println("Leave: " + quantityToLeave);
			System.out.println("Enter: " + quantityToEnter);
			
			while (quantityToLeave < 0)
			{
				elevator1.leave();
				quantityToLeave--;
			}
			
			while (quantityToEnter > 0)
			{
				elevator1.enter();
				quantityToEnter--;
			}
			
			System.out.println("Floor: " + elevator1.getCurrentFloor() + "\n");
			System.out.println("Capacity: " + elevator1.getCapacity());
			elevator1.up();
		}
		
		for (int i = 0; i <= elevator1.getTotalFloors(); i++) 
		{
			System.out.println("Floor: " + elevator1.getCurrentFloor());
			
			quantityToLeave = random.nextInt(elevator1.getPeopleQuantity() + 1);
			quantityToEnter = random.nextInt(elevator1.getCapacity() - elevator1.getPeopleQuantity() + 1);
			
			System.out.println("Leave: " + quantityToLeave);
			System.out.println("Enter: " + quantityToEnter);
			
			while (quantityToLeave < 0)
			{
				elevator1.leave();
				quantityToLeave--;
			}
			
			while (quantityToEnter > 0)
			{
				elevator1.enter();
				quantityToEnter--;
			}
			
			System.out.println("Floor: " + elevator1.getCurrentFloor() + "\n");
			System.out.println("Capacity: " + elevator1.getCapacity());
			elevator1.down();
		}
	}
}
