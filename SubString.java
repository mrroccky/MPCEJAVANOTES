package Java.MPCEJAVANOTES;

public class SubString {
	public static void main (String arg[]){

String s1 ="KP Solutions"; 
String s2 =s1.substring(1);
 String s3=s1.substring(1,4); 
System.out.println(s1); 
System.out.println(s2); 
System.out.println(s3); 
}
}


/*
 * 11. 
substring() Syntax: 
String substring (int index); String substring(int startIndex,int endIndex); 
Substring() is an overloaded method, available in two version, first version of substring() method of String class is used to retrieve part of string from the given index number to last index number and returns the resultant string. Second version of substring() method is used to retrieve part of string from the invoking object. 
class Example 1 
public static void main (String arg[]). 
01 234567891011 
String s1 ="KP Solutions"; String s2 =s1.substring(1); String s3=s1.substring(1,4); 
System.out.println(sl); 
System.out.println(s2); 
System.out.println(s3); 
output : 
KP Solutions 
P Solutions 
PS 

 */