import java.util.Scanner;
class Multiply extends Thread
{
public void run()
{
try
{
for(int i=0;i<=5;i++)
{
System.out.println(i+"X5="+(i*5));
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("Multiplication thread interupted");
}
}
}
class Prime extends Thread
{
int limit,count,flag,i,j;
Prime(int limit)
{
this.limit=limit;
}
public void run()
{
try
{
int j=2;
while(count<limit)
{
flag=1;
for(i=2;i<=(j-1);i++)
{
if(j%i==0)
{
flag=0;
break;
}
}
if(flag==1)
{
System.out.println("prime number:"+j);
count++;
Thread.sleep(500);
}
j++;
}
}
catch(InterruptedException e)
{
System.out.println("prime thread interrupted");
}
}
}
class Threads
{
public static void main(String args[])
{
Multiply m=new Multiply();
Scanner sc=new Scanner(System.in);
System.out.println("enter limit:");
int l=sc.nextInt();
Prime p=new Prime(l);
m.start();
p.start();
}
}

