import java.util.LinkedList;
import java.util.Queue;

interface Shape {
	// abstract method
	double area();
}

class Rectangle implements Shape {
	int length, width;
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}	
	@Override
	public double area() {
		return (double) (length * width);
	}
}

class Circle implements Shape {
	double pi = 3.14;
	int radius;
	Circle(int radius) {
		this.radius = radius;
	}	
	@Override
	public double area() {
		return (double) ((pi * radius * radius) / 2);
	}
}


class MyInterfaces {
	public static void main(String[] args) {
		// creating the Objects of Rectangle and Circle classes
		// and using Shape interface
		Shape s1 = new Rectangle(2, 3);
		Shape s2 = new Circle(2);
		
		// Same - creating the Object of LinkedList concrete class
		// and using Queue interface
		Queue<Integer> q1 = new LinkedList<Integer>();
		
	}
}


