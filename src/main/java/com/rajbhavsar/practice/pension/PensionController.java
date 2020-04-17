package com.rajbhavsar.practice.pension;

public class PensionController
{
	private PensionLogic pensionLogic = new PensionLogic();
	private View view = new View();
	public void handlePension(Person[] people){
		for (Person person: people){
			if (pensionLogic.isPensionable(person,"2014"))
				view.printEligible(person);
			else
				view.printIneligible(person);
		}
	}
}
