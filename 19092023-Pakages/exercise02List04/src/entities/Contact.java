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

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getTelephone() 
	{
		return telephone;
	}

	public void setTelephone(String telephone) 
	{
		this.telephone = telephone;
	}

	public String getBirthdayDate() 
	{
		return birthdayDate;
	}

	public void setBirthdayDate(String birthdayDate) 
	{
		this.birthdayDate = birthdayDate;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	@Override
	public String toString() 
	{
		return "\nname : " + name + 
			   "\ntelephone : " + telephone + 
			   "\nbirthdayDate : " + birthdayDate + 
			   "\nemail : " + email;
	}
		
}
