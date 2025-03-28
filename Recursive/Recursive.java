import java.util.Scanner;
import java.util.Arrays;
class Recursive
{
int recursivebinarysearch(int[] numbers,int target,int first,int last)
{
if(first>last)
{
System.out.println("element not found in array");
return -1;
}           	 
int mid=first+(last-first)/2;
if(numbers[mid]==target)
{
System.out.println("element found at index:" +mid);
return mid;
}
else if(numbers[mid]<target)
{
return recursivebinarysearch(numbers,target,mid+1,last);
}
else
{
return recursivebinarysearch(numbers,target,first,mid-1);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements:");
int size=sc.nextInt();
int[] numbers=new int[size];
System.out.println("enter the elements of array:");
for(int i=0;i<size;i++)
{
numbers[i]=sc.nextInt();
}
Arrays.sort(numbers);
System.out.println("array sorted:"+Arrays.toString(numbers));
System.out.println("enter the element to search:");
int target=sc.nextInt();
Recursive rs=new Recursive();
rs.recursivebinarysearch(numbers,target,0,size-1);
}
}

