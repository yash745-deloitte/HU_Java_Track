class Area {
public void area(int length, int breadth)
{
    System.out.println("Area of Rectangle is: "+ length*breadth);
}
    public void area(double radius)
    {
        System.out.println("Area of circle is: "+ 3.14*radius*radius);
    }

    public void area(double height, double base)
    {
        System.out.println("Area of Triangle is: "+ 0.5*height*base);
    }
    public void area(int side)
    {
        System.out.println("Area of square is: "+ side*side);
    }
}

public class  Areas{
    public static void main(String[] args)
    {
        Area circle = new Area();
        Area rectangle = new Area();
        Area square = new Area();
        Area triangle = new Area();

        circle.area(7.8);
        rectangle.area(10,5);
        square.area(8);
        triangle.area(10,5);

    }
}
