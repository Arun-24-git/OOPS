import java.util.Scanner;
class linearsearch
{
public static void main(String args[])
{
int count,num,item,array[];
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements");
num=sc.nextInt();
array=new int[num];
System.out.println("enter "+num+ " numbers");
for(count=0;count<num;count++)
array[count]=sc.nextInt();
System.out.println("enter the value to search");
item=sc.nextInt();
for(count=0;count<num;count++)
{
if(array[count]==item)
{
System.out.println(item+" is present in the location " +(count+1));
break;
}
}
if(count==num)
System.out.println(item+"not present in the array");
}
}

