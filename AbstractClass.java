package Java.MPCEJAVANOTES;

public class AbstractClass {
	
}
/*
 * Que. Explain abstract class with suitable example? 
Ans. 
Whenever any class is declared as abstract then that class is known as abstract class. We 
cannot create the object of abstract class but we can access the properties of abstract class by 
extending the properties of abstract class. Any class that extends the properties of abstract class is 
known as concrete class. Example1: abstract class A 
public void show() 
System.out.println("I am in A”); 
VAMO 
class UseMe 
public static void main(String args[]) 
A al=new A(); a1.show(); 
Error : Can't create the object of abstract class A. 
In the above example, since class A is an abstract class therefore main program cannot create the object of abstract class A. But we can access the properties of abstract class A by extending the properties of abstract class A as shown below. abstract class A 
public void show() 
System.out.println("I am in A"); 
class B extends A 
public void show1() 
System.out.println("I am in B”); 
class UseMe 
public static void main(String args[]) 
16 
B b1=new B(); b1.show(); b1.show1(); 
output: 
Tam in A 
Tam in B 

 */