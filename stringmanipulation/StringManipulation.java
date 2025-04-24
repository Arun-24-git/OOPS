 public class StringManipulation
{
public static void main(String args[])
{

String str1="hello";
String str2="WORLD";
System.out.println("FIRST STRING:"+str1);
System.out.println("SECOND STRING:"+str2);
System.out.println("length of string1 is:" + str1.length());
String cat=str1 +" "+ str2;
System.out.println("String concatenation:" +cat);
char ch=str2.charAt(3);
System.out.println("Extracted charactor of " + str2 + " at index 3 is:" + ch );
String str3 ="HELLO";
System.out.println("String:"+str3);
System.out.println("str1 equals str3: " + str1.equals(str3));
System.out.println("str1 == str3: " + (str1 == str3));
System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
String z="everyone told me,i have attractive power";
System.out.println("\n\nstring  :"+z);
System.out.println("\n\nindex of 'attractive' word  :"+z.indexOf("attractive"));
String upper = str1.toUpperCase(); 
String replace = str2.replace('W', 'S'); 
System.out.println("Uppercase str1: " + upper);
System.out.println("Replaced str2: " + replace);
int number=398;
String num=String.valueOf(number);
System.out.println("String value of number:"+num);
}
}
