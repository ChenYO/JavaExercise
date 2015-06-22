package Exercise;

import java.util.ArrayList;
import java.util.List;

interface Polygon{
	public double area();
	public double circumference();
}

class Square implements Polygon{
	private double side;
	
	public Square(double side){
		this.side = side;
	}

	@Override
	public double area() {
		
		return side * side;
	}

	@Override
	public double circumference() {
		return side * 4;
	}
}

class Rectangle implements Polygon{
	
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double circumference() {
		return (length + width) * 2;
	}
	
}


public class ExerciseThree {

	public static void main(String[] args) {

		Square square1 = new Square(5);
		Square square2 = new Square(8);
		Rectangle rectangle = new Rectangle(4, 7);
		System.out.println(square1.area() + " " + square1.circumference());
		System.out.println(square2.area() + " " + square2.circumference());
		System.out.println(rectangle.area() + " " + rectangle.circumference());
	}

}
