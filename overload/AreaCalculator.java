import java.util.Scanner;

class AreaCalculator {
public double calculateArea(double radius)
{
return Math.PI * radius * radius;
}

public double calculatetri(double length, double width) 
{
return length * width;
}
public double calculaterec(double base, double height) 
{
return 0.5 * base * height;
}
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
AreaCalculator calculator = new AreaCalculator();
System.out.print("Enter radius of circle: ");
double radius = sc.nextDouble();
System.out.println("Area of Circle: " + calculator.calculateArea(radius));
System.out.print("Enter length of rectangle: ");
double length = sc.nextDouble();
System.out.print("Enter width of rectangle: ");
double width = sc.nextDouble();
System.out.println("Area of Rectangle: " + calculator.calculaterec(length, width));
System.out.print("Enter base of triangle: ");
double base = sc.nextDouble();
System.out.print("Enter height of triangle: ");
double height = sc.nextDouble();
System.out.println("Area of Triangle: " + calculator.calculatetri(base, height));
}
}
       
