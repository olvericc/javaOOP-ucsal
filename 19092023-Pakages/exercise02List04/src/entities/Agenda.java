package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda 
{
	private Contact[] contacts;
	private int contactQuantity;
	
	public Agenda()
	{
		contacts = new Contact[50];
		contactQuantity = 0;
	}
	
	public void addContact(Contact contact)
	{
		if (this.contactQuantity <= 50)
		{
			contacts[contactQuantity] = contact;
			contactQuantity++;
		}
		else
		{
			System.out.println("error");
		}
	}
	
	public void contactList(String name)
	{
		
		for (int i = 0; i < contactQuantity; i++) 
		{
			if (contacts[i].getName().equalsIgnoreCase(name))
			{
				System.out.println(contacts[i]);
			}
		}
	}
	
	public void allContacts()
	{
		if (contactQuantity == 0)
		{
			System.out.println("empty agenda");
		}
		else
		{
			for (int i = 0; i < contactQuantity; i++) 
			{
				System.out.println("\n" + (i + 1) + ") " + contacts[i].getName() + " - " + contacts[i].getTelephone());
			}
		}
	}
	
	public void listBirthdaysOfMonths(String month) throws ParseException
	{
		System.out.println("birthday dates of " + month + ": ");
		
		SimpleDateFormat inputDateFormat = new SimpleDateFormat("ddMMyyyy");
		SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		
		for (int i = 0; i < contactQuantity; i++) 
		{
			String birthdayDate = contacts[i].getBirthdayDate();
			
			Date date = inputDateFormat.parse(birthdayDate);
			String formattedDate = outputDateFormat.format(date);
			
			if (formattedDate.substring(3, 5).equals(month))
			{
				System.out.println("\ncontact name: " + contacts[i].getName() +"\nbirthday date: " +formattedDate);
			}
		}
	}
}
