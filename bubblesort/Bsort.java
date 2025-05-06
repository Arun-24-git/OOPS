import java.util.*;
class Bubble
{
public static <T> T[] bsort(T arr[],int limit)
{
String str,str2;
int i,j;
for(i=0;i<limit-1;i++)
for(j=0;j<limit-1-i;j++)
{
str=arr[j].toString();
str2=arr[j+1].toString();
if(str.compareTo(str2)>0)
{
T temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
return arr;
}
}
class Bsort
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements:");
n=sc.nextInt();
String s[]=new String[n];
System.out.println("\n enter elements:");
for(i=0;i<n;i++)
{
s[i]=sc.next();
}
Bubble bubble=new Bubble();
s=bubble.bsort(s,n);
System.out.println("\n element after sorting:");
for(i=0;i<n;i++)
{
System.out.println(s[i]);
}
}
}
