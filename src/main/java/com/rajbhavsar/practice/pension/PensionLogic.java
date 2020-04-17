package com.rajbhavsar.practice.pension;

public class PensionLogic
{
	public boolean isPensionable(Person person, String year){
		String dob = person.getDob();
		String[] dobArray = dob.split("/");
		int age = Integer.parseInt(year) - Integer.parseInt(dobArray[2]);
		return age >= 65;
	}
}
