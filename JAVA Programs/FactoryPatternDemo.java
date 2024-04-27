package designpatterns;

interface Shape{
	void draw();
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("drawing Rectangle :inside draw() of Rectangle");
	}
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("drawing Circle :inside draw() of Circle");
	}
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("drawing Square :inside draw() of Square");
	}
}

class ShapeFactory{
	public Shape getShape(String shapeType)
	{
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("square"))
			return new Square();
		else 
			return null;
	}
}

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get obj of circle and call it's draw()
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();
		
		//get obj of rectangle and call it's draw()
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
		
		//get obj of square and call it's draw()
		Shape square = shapeFactory.getShape("Square");
		square.draw();
	}
}















