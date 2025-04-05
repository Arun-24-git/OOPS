import java.util.Scanner;
class Employee
{
int empId,salary;
String name,address;
Employee(int empId,String name,String address,int salary)
{
this.empId=empId;
this.name=name;
this.salary=salary;
this.address=address;
}
Employee()
{}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher(int empId,String name,String address,int salary,String department,String subject)
{
super(empId,name,address,salary);
this.department=department;
this.subject=subject;
}
Teacher()
{
super();
}
void displayTeachers(Teacher[] teachers)
{
String format = "%-10s %-20s %-20s %-10s %-20s %-25s%n";

System.out.println("\n-------------------- TEACHER DETAILS --------------------\n");
System.out.printf(format, "EmpID", "Name", "Address", "Salary", "Department", "Subject");
System.out.println("------------------------------------------------------------------------------------------------");

for (Teacher t : teachers) {
System.out.printf(format, t.empId, t.name, t.address, t.salary, t.department, t.subject);
}
}
}
class Employees
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbe of employees:");
int ecount=sc.nextInt();
Teacher[] teachers =new Teacher[ecount];
for(int i=0;i<ecount;i++)
{
System.out.print("Enter EmpID: "); 
int empId = sc.nextInt(); 
sc.nextLine(); 
System.out.print("Enter Name: "); 
String name = sc.nextLine(); 
System.out.print("Enter Adress: ");
String address = sc.nextLine(); 
System.out.print("Enter Salary: "); 
int salary = sc.nextInt(); 
sc.nextLine(); 
System.out.print("Enter Department: "); 
String dep = sc.nextLine(); 
System.out.print("Enter Subject: "); 
String sub = sc.nextLine(); 
teachers[i] = new Teacher(empId, name, address, salary, dep, sub); 
}
Teacher t1=new Teacher();
t1.displayTeachers(teachers);
}
}

