package Java.MPCEJAVANOTES;

public class AbstractMethod {
	
}





/*
 * Que. Explain abstract method with suitable example? 
or 
Que. Explain dynamic dispatch method with suitable example? 
Ans. 
Whenever any prototype of method is declared as abstract then that method is known as 
abstract method provided abstract method should be present in abstract class. Any subclass that 
extends the properties of abstract class is known as concrete class and it is necessary for the 
concrete class to implement the body of abstract method of super abstract class with explicit access 
specifier as public. 
Dynamic dispatch method is the concept of java language in which object of concrete class dispatches its methods to the object of abstract class and object of abstract class can access all 
those methods of concrete class that are declared as abstract in abstract class. 
Example1: 
abstract class A 
public abstract void show(); 
class B extends A 
public void showo) 
System.out.println("I am in B”); 
class Magic 
public static void show Magic(A a) 
a.show(); 
class UseMe 
public static void main(String args[]) 
B b1=new B(); Magic.showMagic(b1); 
output: I am in B 
in the above example, class B is concrete class of super class (abstract) A containing 
the implemented body of abstract method show() of abstract class A. Since the class B is concrete 
class of abstract class A therefore object of class A can hold the instance of class B and can access 
show() method. During the execution of above program, execution control will dispatch the abstract 
to send oft methods of class B to the object of class A. 

 */