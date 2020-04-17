package com.rajbhavsar.practice.pizzamakingprocess;

import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.BaseIngredient;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.Flour;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.GarlicPowder;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.OliveOil;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.Salt;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.Water;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.baseingredients.Yeast;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.cheese.Cheese;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.sauces.Sauce;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.sauces.TomatoSauce;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Capsicum;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Corn;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Olive;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Onion;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Paneer;
import com.rajbhavsar.practice.pizzamakingprocess.ingredients.toppingsingredients.Topping;
import com.rajbhavsar.practice.pizzamakingprocess.pizza.Dough;
import com.rajbhavsar.practice.pizzamakingprocess.pizza.Pizza;
import com.rajbhavsar.practice.pizzamakingprocess.pizza.base.Base;

import java.util.List;

public class Chef
{

	private Dough makeDough(BaseIngredient[] baseIngredients)
	{
		System.out.println("Take the Bowl");
		for (BaseIngredient ingredient : baseIngredients)
		{
			System.out.println("Add the " + ingredient.toString() + " into the bowl");
		}
		System.out.println("Mixing all the ingredients in the bowl, which will make a Dough");
		return new Dough(baseIngredients);
	}

	private Base roll(Dough dough)
	{
		System.out.println("Rolling the dough, Which will make the base");
		return new Base(dough);
	}

	private Sauce selectSauce(String sauce)
	{
		switch (sauce)
		{
			case "tomatoSauce":
				return new TomatoSauce(50);
			default:
				return new Sauce(10);
		}
	}

	private Cheese selectCheese(String cheese)
	{
		switch (cheese)
		{
			case "cheese":
				return new Cheese(50);
			default:
				return new Cheese(10);
		}
	}

	private Topping selectTopping(String topping)
	{
		switch (topping)
		{
			case "olive":
				return new Olive(25);
			case "onion":
				return new Onion(20);
			case "capsicum":
				return new Capsicum(20);
			case "paneer":
				return new Paneer(20);
			case "corn":
				return new Corn(20);
			default:
				System.out.println(" Sorry we are not having " + topping.toString() + " today...");
				return new Topping(0);
		}
	}

	public Pizza makePizza(PizzaStyle pizzaStyle) throws InterruptedException
	{

		BaseIngredient flour = new Flour(500);
		BaseIngredient salt = new Salt(10);
		BaseIngredient yeast = new Yeast(5);
		BaseIngredient oliveOil = new OliveOil(10);
		BaseIngredient garlicPowder = new GarlicPowder(20);
		BaseIngredient water = new Water(250);

		BaseIngredient[] baseIngredient = {flour, salt, yeast, oliveOil, garlicPowder, water};
		Dough dough = this.makeDough(baseIngredient);
		Base base = this.roll(dough);

		List<String> sauces = pizzaStyle.getSauces();
		for (int i = 0; i < sauces.size(); i++)
			base = base.spreadSauce(selectSauce(sauces.get(i)));

		List<String> cheeses = pizzaStyle.getCheeses();
		for (int i = 0; i < cheeses.size(); i++)
			base = base.spreadCheese(selectCheese(cheeses.get(i)));

		List<String> toppings = pizzaStyle.getToppings();
		for (int i = 0; i < toppings.size(); i++)
			base = base.arrange(selectTopping(toppings.get(i)));

		Oven oven = new Oven();
		Pizza pizza = (Pizza) oven.bake(base);

		PizzaCutter pizzaCutter = new PizzaCutter();
		pizza = pizzaCutter.cut(pizza);

		return pizza;
	}
}
