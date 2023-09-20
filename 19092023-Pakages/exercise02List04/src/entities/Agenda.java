package entities;

public class Agenda 
{
	Contact[] contacts = new Contact[50];
	int contactQuantity = 0;
	
	public boolean addContact(String name, String telephone, 
			   String birthdayDate, String email)
	{
		if (this.contactQuantity < 50)
		{
			contacts[this.contactQuantity] = new Contact(name, telephone, birthdayDate, email);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// list
	// birthday date of month
}
