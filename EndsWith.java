package Java.MPCEJAVANOTES;

public class EndsWith {
	public static void main(String[] args) {
		String r="@mrroccky";
		boolean res=r.endsWith("y");
		//o/p true
	}
}


/*
 * endsWith() 
Syntax 
| 
boolean endsWith (String str); 
endsWith ( ) is standard inbuilt method of String, it is used to compare given string with the last characters of invoking object, if the given string is matched with the last characters of invoking string then it will return true otherwise return false. 
class Example 
public static void main(String arg[]). 
String s1 = “KP Solutions”; boolean b = 51.endsWith(“Solutions”); System.out.println(b); System.out.println(s1.endsWith("tions")); System.out.println (s1.endsWith("sita")); System.out.println (s1.endsWith("KP Solutions")); 
output : 
true 
true 
false 
true 
7. 

 */