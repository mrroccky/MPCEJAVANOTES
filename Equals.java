package Java.MPCEJAVANOTES;

public class Equals {
	public static void main(String[] args) {
		String r="@mrroccky";
		boolean res=r.equals("@mrroccky");
		//o/p true
		boolean res2=r.equalsIgnoreCase("mrroccky");
	}
}

/*
 * 7. 
equals() 
Syntax : 
| boolean equals (String str); 
equals() method of String class is used to compare given string with the string of 
invoking object if both the strings are equal then it will return true otherwise returns false. 
class Example 
public static void main(String arg[]). 
{ 
String s = “KP Solutions”; boolean b = s.equals (“KP Solutions”); System.out.println(b); System.out.println(s.equals("KP")); System.out.println(s.equals("Solutions")); System.out.println(s.equals("Problem")); System.out.println(s.equals("Answer")); 
Output: 
true 
false 
false 
false 
false 

 */

 /*
  * equalsigoreCase () 
Syntax 
boolean equalsignoreCase (String str); 
equalsignoreCase () method of String is used to compare given string with the string of invoking object by ignoring case. If given string is matched with the string of invoking object them it will return true otherwise returns false. 
class Example 
public static void main (String arg[]) 
String s = “KP Solutions”; boolean b = s.equalslgnoreCase("KP Solutions”); 
System.out.println(b); 
System.out.println(s.equalsignoreCase("kp solutions")); System.out.println(s.equalsignoreCase(“Solutions”)); System.out.println(s.equalsignoreCase(“Problem")); System.out.println(s.equalsignoreCase(“Answer")); 
output : 
true 
true 
false 
false 
false 

  */