import java.util.Scanner;
import java.util.Arrays;
class arraystring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of string:");
int size=sc.nextInt();
String[] strings = new String[size];
System.out.println("Enter the string:\n");
for(int i=0;i<size;i++)
{
strings[i]=sc.next();
}
System.out.println("1.User Defind Function");
System.out.println("2.Build in function");
System.out.println("3.Exit");
System.out.println("Enter the options:");
int opt=sc.nextInt();
switch(opt)
{
case 1:String temp;
       for(int i=0; i<size-1;i++)
       {
       for(int j=i+1;j<size;j++)
       {
       if(strings[i].compareTo(strings[j])>0)
       {
       temp=strings[i];
       strings[i]=strings[j];
       strings[j]=temp;
       }
       }
       }
       break;
       
case 2:Arrays.sort(strings);
       break;
case 3:System.exit(0);
       break;
default:
System.out.println("Invalid  option");
System.exit(0);
}
for(int i=0;i<size;i++)
System.out.println(strings[i]);
}
}

