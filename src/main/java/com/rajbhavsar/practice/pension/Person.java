package com.rajbhavsar.practice.pension;

public class Person
{
	private String firstName;
	private String lastName;
	private String dob;

	public Person(final String firstName, final String lastName, final String dob)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob(final String dob)
	{
		this.dob = dob;
	}
}
