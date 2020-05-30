
class Drink
{
	private String menu, catagory;
	private int price;

	public Drink(String menu, String catagory, int price)
	{
		this.menu = menu;
		this.catagory = catagory;
		this.price = price;
	}

	public Drink()
	{

	}

	public String getMenu()
	{
		return menu;
	}

	public void setMenu(String menu)
	{
		this.menu = menu;
	}

	@Override
	public String toString()
	{
		return "Drink{" + "menu = " + menu + '\'' + ", catagory = '" + catagory + '\'' + ", price = " + price + '}';
	}

}

import java.until.ArrayList;

class Order
{

	public static void main(String[] args) {
		demoArayList1();
	}

	public static void demoArayList1()
	{
		ArrayList<Drink> menus = new ArrayList<Drink>();
		menus.add(new Drink("Orange", "Juice", 40));
		menus.add(new Drink("Apply", "Juice", 45));
		menus.add(new Drink("Lemon", "Juice", 50));
		menus.add(new Drink("Coke", "Soda", 30));
		menus.add(new Drink("Sprite", "Soda", 45));
		menus.add(new Drink("Fanta", "Soda", 35));
		menus.add(new Drink("Latte", "Coffee", 40));
		menus.add(new Drink("Mocha", "Coffee", 45));
		menus.add(new Drink("Cappoccino", "Coffee", 50));
		menus.add(new Drink("Espresso", "Coffee", 55));

		for (Drink menus: menus) 
		{
			System.out.println(menus.toString);	
		}
	}
} 