package Java.MPCEJAVANOTES;

public class StartWith {
	public static void main(String[] args) {
		String r="@mrroccky";
		boolean b =r.startsWith("@");
		//o/p true 
	}
}


/*
 * startsWith() Syntax 
boolean startsWith(String str); 
startsWith () is standard method of String, it is used to compare the given string with the starting characters of invoking object, if the given string is matched with the starting characters of invoking object then it will return true otherwise it will return false it is case sensitive method. 
class Example 
public static void main (String arg[]) 
String s1 = "KP Solutions”; boolean b = 51.startsWith("KP”); System.out.println(b); System.out.println(s1.startsWith(“tions")); System.out.println (s1.startsWith("sita")); System.out.println (s1.startsWith("KP Solutions”)); 
output : 
true 
false 
false 
true 

 */