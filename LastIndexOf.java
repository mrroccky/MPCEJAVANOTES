package Java.MPCEJAVANOTES;

public class LastIndexOf {
	
	public static void main(String[] args) {
		String s1 ="mrroccy";
		int index =s1.lastIndexOf(s1);
		System.out.println(index);
		//o/p 6
	}

	
}


/*
 * lastindexOf() 
Syntax 
int lastIndexOf(char ch); 
lastIndexOf( ) is standard inbuilt method of String, it is used to search a given character (ch) from the last index number of invoking.object if the given character is present then it returns its respective index number otherwise returns – 1; 
class Example 1 
public static void main (String arg[]) 
String s1=”KP Solutions”; int n=s1.lastIndexOf('o'); System.out.println (n); System.out.println (s1.lastIndexOf('n')); System.out.println (51.lastIndexOf('b')); System.out.println (s1.lastIndexOf('r')); 
output : 

 */