package com.rajbhavsar.practice.pension;

public class Client
{
	public static void main(String[] args)
	{
		PensionController pensionController= new PensionController();
		Person[] people = new Person[]{
				new Person("John","Smith","28/06/1993"),
				new Person("Jane","Doe","05/01/1950"),
				new Person("Fred","Bloggs","12/12/1949"),
		};

		pensionController.handlePension(people);
	}
}
