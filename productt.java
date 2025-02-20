import java.util.Scanner;
class product
{
int pcode,price;
String pname;
product(int code,String name,int pr)
{
pcode=code;
pname=name;
price=pr;
}
}
class productt
{
public static void main(String args[])
{
product product1=new product(101,"crayoon",45);
int pcode,price;
String pname;
pcode=102;
pname="sketch";
price=50;
product product2=new product(pcode,pname,price);
Scanner sc=new Scanner(System.in);
System.out.println("enter product code:");
pcode=sc.nextInt();
System.out.println("enter product name:");
pname=sc.next();
System.out.println("enter the price");
price=sc.nextInt();
product product3=new product(pcode,pname,price);
System.out.println("\npcode:"+product1.pcode);
System.out.println("pname:"+product1.pname);
System.out.println("price:"+product1.price);

System.out.println("\npcode:"+product2.pcode);
System.out.println("pname:"+product2.pname);
System.out.println("price:"+product2.price);

System.out.println("\npcode:"+product3.pcode);
System.out.println("pname:"+product3.pname);
System.out.println("price:"+product3.price);

System.out.println("\n...PRODUCT HAVING LOWEST PRICE...\n");

if(product1.price<product2.price && product1.price<product3.price)
{
System.out.println("\npcode:"+product1.pcode);
System.out.println("pname:"+product1.pname);
System.out.println("price:"+product1.price);
}
else if(product2.price<product1.price && product2.price<product3.price)
{
System.out.println("\npcode:"+product2.pcode);
System.out.println("pname:"+product2.pname);
System.out.println("price:"+product2.price);
}
else {
System.out.println("\npcode:"+product3.pcode);
System.out.println("pname:"+product3.pname);
System.out.println("price:"+product3.price);
}
}
}
