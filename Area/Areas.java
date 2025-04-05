import java.util.Scanner;
interface shapes
{
void input();
void area();
void perimeter();
}
class Rectangle implements shapes {
int length=0;
double breadth=0;
double area=0;
double perimeter=0;
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length:");
length=sc.nextInt();
System.out.print("Enter the breadth:");
breadth=sc.nextDouble();
}
public void area()
{
area=length * breadth;
System.out.println("Area of rectangle is:" +area);
}
public void perimeter()
{
perimeter=2*(length + breadth);
System.out.println("Perimeter of rectangle is :"+perimeter);
}
}
class Circle implements shapes{
int radius=0;
double pi=3.14;
double area=0;
double perimeter=0;
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the radius:");
radius=sc.nextInt();
}
public void area()
{
area=pi*radius*radius;
System.out.println("Area of circle is:" +area);
}
public void perimeter()
{
perimeter=2*pi*radius;
System.out.println("Perimeter of circle is :"+perimeter);
}
}
public class Areas
{
public static void main(String args[])
{
int opt;
Circle c=new Circle();
Rectangle r=new Rectangle();
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter options....");
System.out.println("1.Area of circle");
System.out.println("2.perimeter of circle");
System.out.println("3.Area of Rectangle");
System.out.println("4.Perimeter of Rectangle");
System.out.println("5.Exit");
while(true)
{
System.out.print("\nEnter your option:");
opt=sc.nextInt();
switch(opt)
{
case 1:
       c.input();
       c.area();
       break;
case 2:
       c.input();
       c.perimeter();
       break;
case 3:
       r.input();
       r.area();
       break;
case 4:
       r.input();
       r.perimeter();
       break;
case 5:System.out.println("exiting....");
       return;
default : System.out.println("invalid option");
}
}
}
}
