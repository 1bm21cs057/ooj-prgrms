import java.util.Scanner;
abstract class Shape
{
	int x,y;
	double area;
	abstract void printArea();
}
class Rectangle extends Shape
{
	void printArea()
	{
		area=x*y;
		System.out.println("Area of rectangle is: "+area);
	}
}
class Triangle extends Shape
{
	void printArea()
	{
		area=0.5*x*y;
		System.out.println("Area of triangle is: "+area);
	}
}
class Circle extends Shape
{
	void printArea()
	{
		area=3.14*x*x;
		System.out.println("Area of circle is: "+area);
	}
}
class Area
{
	public static void main(String args[])
	{
		Rectangle rec=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		for(int i=0;i<3;i++){
		System.out.print("Enter the shape whose area is to be found out: ");
		Scanner s=new Scanner(System.in);
		String fig=s.next();
		if(fig.equals("rectangle")||fig.equals("Rectangle")||fig.equals("RECTANGLE"))
		{
			System.out.println("Enter length: ");
			rec.x=s.nextInt();
			System.out.println("Enter breadth: ");
			rec.y=s.nextInt();
			rec.printArea();
		}
		else if(fig.equals("triangle")||fig.equals("Triangle")||fig.equals("TRIANGLE"))
		{
			System.out.println("Enter height: ");
			t.x=s.nextInt();
			System.out.println("Enter breadth: ");
			t.y=s.nextInt();
			t.printArea();
		}
		else if(fig.equals("circle")||fig.equals("Circle")||fig.equals("CIRCLE"))
		{
			System.out.println("Enter radius: ");
			c.x=s.nextInt();
			c.printArea();
		}
		else
		{
			System.out.println("WRONG SHAPE ENTERED!!!");
		}}
	}
}
