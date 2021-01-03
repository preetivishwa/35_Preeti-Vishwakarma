/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package word;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


/**
 *
 * @author Ramesh Kumar Yadav
 */
public class Word
{
    public static void main(String[] args)
    {
        try
        { 
String str="";
String ser="";
int flag=0;
BufferedReader br=new BufferedReader(new FileReader("d:\\file.txt"));
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
str=br.readLine(); 
String []  s = new String[str.length()];
System.out.println("enter the text u want to search");
ser=br1.readLine();
s=str.split(" "); 
for(int i=0;i<s.length;i++)
{
    if(ser.equalsIgnoreCase(s[i]))
{
System.out.println("Text "+ser+" Found");
flag=1;
}
}
if(flag==0)
System.out.println("Text "+ser+" Not Found");
}
catch(Exception e)
{
System.out.println(e);
}
}
}

        // TODO code application logic here
  