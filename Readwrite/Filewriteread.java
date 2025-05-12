import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filewriteread
{
public static void main(String args[])
{
String filename="file.txt";
try(FileWriter writer =new FileWriter(filename,true))
{
writer.write("new file is created\n");
}
catch(IOException e)
{
System.out.println("error in writing:"+e.getMessage());
}
try(BufferedReader br=new BufferedReader(new FileReader(filename)))
{
String line;
System.out.println("data read from file:");
while((line=br.readLine())!=null)
{
System.out.println(line);
}
}
catch(IOException e)
{
System.out.println("error while reading from file:"+e.getMessage());
}
}
}
