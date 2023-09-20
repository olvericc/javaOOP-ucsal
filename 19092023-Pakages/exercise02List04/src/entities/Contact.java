package entities;

public class Contact 
{
	private String name;
	private String telephone;
	private String birthdayDate;
	private String email;
	
	public Contact(String name, String telephone, 
				   String birthdayDate, String email) 
	{
		this.name = name;
		this.telephone = telephone;
		this.birthdayDate = birthdayDate;
		this.email = email;
	}

	@Override
	public String toString() 
	{
		return "name = " + name + 
				", telephone = " + telephone + 
				", birthdayDate = " + birthdayDate + 
				", email = " + email;
	}
		
}
