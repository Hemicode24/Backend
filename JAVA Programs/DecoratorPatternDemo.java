package designpatterns;

import java.util.Scanner;

interface Food{
	public String prepareFood();
	public double foodPrice();
}

class VegFood implements Food{

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Pav-Bhaji ";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 120;
	}
	
}

abstract class FoodDecorator implements Food{
	
	private Food newFood;
	
	public FoodDecorator(Food newFood) {
		super();
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return newFood.prepareFood();
	}
	
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newFood.foodPrice();
	}
}

class NonVegFood extends FoodDecorator{

	public NonVegFood(Food newFood) {
		super(newFood);
	}
	
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+"Roasted Chicken";
	}
	
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+250;
	}
	
}

class ChineeseFood extends FoodDecorator{

	public ChineeseFood(Food newFood) {
		super(newFood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+"Fried Rice and Manchurian";
	}
	
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+170;
	}
	
}

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("------------Food Menu-----------");
			System.out.println("Enter your choice : ");
			System.out.println("1.Veg \n2.Non-veg \n3.Chineese \n4.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				VegFood vegFood = new VegFood();
				System.out.println("Selected food : "+vegFood.prepareFood());			
				System.out.println("Price : "+vegFood.foodPrice());
				break;
				
			case 2:
				Food food1 = new NonVegFood(new VegFood());
				System.out.println("Selected Food : "+food1.prepareFood());
				System.out.println("Price : "+food1.foodPrice());
				break;
				
			case 3: 
				Food food2 = new ChineeseFood(new VegFood());
				System.out.println("Selected Food : "+food2.prepareFood());
				System.out.println("Price : "+food2.foodPrice());
				break;
				
			default: System.out.println("Other than this no food is available");	
			}
			
		} while (choice!=4);
	}

}













