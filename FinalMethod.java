package Java.MPCEJAVANOTES;

public class FinalMethod {
	
}





/*
 * Que. Explain final method of Java language? 
Ans: 
Whenever any method of class is declared as final then that method is known as final 
method. final method is considered as the last version method of class in which it is declared. 
During the compilation process, compiler will not allow sub class to override the final method of 
super class. 
Example1: class A 
final public void show(). 
System.out.println("I am in A”); 
class B extends A 
public void show(). 
System.out.println(“I am in B”); 
class Use Me 
public static void main(String args[]) 
B b1=new B(); 
b1.show(); 
13 
In the above example, class B is subclass of super class A overriding the final method show() of super class A but compiler will not allow to override the final method show() of super class A in sub class B and hence above program will generate following error. 
Error: Can't override the final method show() in sub class A 

 */