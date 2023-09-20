package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Agenda;
import entities.Contact;

public class Program 
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner sc = new Scanner(System.in);
		
		Agenda ag1 = new Agenda();
		
		do 
		{
			System.out.println("\n1. add a contact");
			System.out.println("2. find contact by name");
			System.out.println("3. all contacts list");
			System.out.println("4. find contact by month birthday");
			System.out.println("5. exit");
			System.out.print("\ntype the option to continue: ");
			
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option) 
			{
			case 1:
				System.out.print("name: ");
				String name = sc.nextLine();
				System.out.print("telephone: ");
				String telephone = sc.nextLine();
				System.out.print("birthday date (DDMMAAAA): ");
				String birthdayDate = sc.nextLine();
				System.out.print("email: ");
				String email = sc.nextLine();
								
				Contact contact = new Contact(name, telephone, birthdayDate, email);
				ag1.addContact(contact);
				break;
			case 2:
				System.out.print("enter the name to find a contact: ");
				String consult = sc.nextLine();
				ag1.contactList(consult);
				break;
			case 3:
				ag1.allContacts();
				break;
			case 4:
				System.out.println("enter the month of birth to find a contact: ");
				String month = sc.nextLine();
				ag1.listBirthdaysOfMonths(month);	
				break;
			case 5:
				System.out.println("bye bye");
				System.exit(0);
				sc.close();
				break;
			default:
				System.out.println("try again");
			}
		} 
		while (true);
	}
}
