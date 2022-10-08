package Java.MPCEJAVANOTES;

public class FinalVar {
	
}

/*
 * Que. Explain final variable of java language with suitable example? Ans: 
Whenever any variable or object of class is declared as final then that variable or object is known as final variable or final object. It is always necessary to initialize the value of final variable at the time of initialization and once it is initialized, compiler will not allow changing the value of final variable or final object. It is used to define the constant value as shown below. 
Example1: class Example1 
public static void main(String args[]) 
final int a=10; 
System.out.println(a); 
a=20; 
System.out.println(a); 
In the above example, variable 'a' is declared as final and therefore compiler will not allow to change the value of variable 'a' hence above program will generate following error. 
Error: can't assign value to final variable 'a' 
a=20; 
Example2: 
class Example2 
public static void main(String args[]) 
final int a=10; 
System.out.println(a); 
int b=a*2; 
System.out.println(b); 
Output: 
 */