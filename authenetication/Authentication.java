import java.util.Scanner;
class invalid extends Exception
{
public invalid(String msg)
{
super(msg);
}
}
public class Authentication
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try{
   System.out.println("Enter user name:");
   String name=sc.nextLine();
   System.out.println("Enter user password:");
   String password=sc.nextLine();
   if(!name.equals("Arunjith"))
   {
   throw new invalid("!!!..INCORRECT NAME.try again...");
   }
   else if(!password.equals("java@lab"))
   {
   throw new invalid("!!!..INCORRECT PASSWORD.try again...");
   }
   else
   {
   System.out.println("Login sucessful");
   }
  }
catch(invalid e)
{
System.out.println("AUTHENTICATION FAILD......."+e.getMessage());
}
}
}
