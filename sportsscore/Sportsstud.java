import java.util.Scanner;
interface Student
{
void displayscore();
}
interface Sports
{
void displayssport();
}
class Result implements Student,Sports
{
int ac_score;
int sp_score;
Result(int ascore,int sscore)
{
ac_score=ascore;
sp_score=sscore;
}
public void displayscore()
{
System.out.println("ACADEMIC SCORE:"+ac_score);
}
public void displayssport()
{
System.out.println("SPORTS SCORE:"+sp_score);
}
}
public class Sportsstud
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
//System.out.println("enter academic score:");
//int academic=sc.nextInt();
//System.out.println("enter sports score:");
//int sport=sc.nextInt();
int academic=85;
int sport=90;
System.out.println(".....SCORE CARD......");
Result r=new Result(academic,sport);
r.displayscore();
r.displayssport();
}
}

