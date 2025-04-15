import java.util.Scanner;
class Publisher
{
String pubname;
Publisher(String pubname)
{
this.pubname=pubname;
}
void display()
{
System.out.println("Publisher:"+pubname);
}
}
class Book extends Publisher
{
String title;
String author;
Book(String pubname,String title,String author)
{
super(pubname);
this.title=title;
this.author=author;
}
void display()
{
super.display();
System.out.println("Title:"+title);
System.out.println("Author:"+author);
}
}
class Literature extends Book
{
String type;
Literature(String pubname,String title,String author,String type)
{
super(pubname,title,author);
this.type=type;
}
void display()
{
super.display();
System.out.println("Type:" +type);
}
}
class Fiction extends Book
{
String theme;
Fiction(String pubname,String title,String author,String theme)
{
super(pubname,title,author);
this.theme=theme;
}
void display()
{
super.display();
System.out.println("Theme:" +theme);
}
}
public class Books
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Literature[] literatures=new Literature[100];
Fiction[] fictions=new Fiction[100];
int fcount=0; //fiction count
int lcount=0;//literature count

int opt;
do
{
System.out.println("\n........BOOK DETAILS.......");
System.out.println("1.FICTION");
System.out.println("2.LITERATUE");
System.out.println("3.EXIT");
System.out.println("Enter the options:");
opt=sc.nextInt();
sc.nextLine();
switch(opt)
{
case 1:if(fcount<100)
       {
       System.out.println("\nEnter a FICTION");
       System.out.println("Publisher:");
       String fpub=sc.nextLine();
       System.out.println("Title:");
       String ftitle=sc.nextLine();
       System.out.println("Author:");
       String fauthor=sc.nextLine();
       System.out.println("Theme:");
       String ftheme=sc.nextLine();
       Fiction fic=new Fiction(fpub,ftitle,fauthor,ftheme);
       fictions[fcount++]=fic;
       System.out.println("\nFiction book added!!!!");
       fic.display();
       }
       else
        {
           System.out.println("Book is full");
        }
     break;
case 2:if(lcount<100)
       {
       System.out.println("\nEnter a LITERATUE");
       System.out.println("Publisher:");
       String lpub=sc.nextLine();
       System.out.println("Title:");
       String ltitle=sc.nextLine();
       System.out.println("Author:");
       String lauthor=sc.nextLine();
       System.out.println("Type:");
       String ltype=sc.nextLine();
       Literature lic=new Literature(lpub,ltitle,lauthor,ltype);
       literatures[lcount++]=lic;
       System.out.println("\nLiterature book added!!!!");
       lic.display();
       }
       else
        {
           System.out.println("Book is full");
        }
     break;
case 3:System.out.println("Exiting.....");
       break;
}
} while(opt!=3);
}
}

