package Java.MPCEJAVANOTES;

public class FinalClass {
	
}


/*
 * Que. Explain the final class of java language? Ans: Whenever any class is declared as final then that class is known as final class. final class does not allow to extend the properties in sub class i.e. compiler will not allow sub class to extend the properties of final class but we can access the properties of final class by creating the object of 
final class. 
Example1: 
final class A 
public void showA() 
System.out.println("I am in A”); 
class B extends A 
{ 
public void showB() 
System.out.println("I am in B”); 
Error: Can't extend the final class A in class B 
Example2: final class A 
public void showAll) 
System.out.println("I am in A”); 
class Use Me 
public static void main(String args[]) 
A a1=new A(); a1.showA(); 
output: I am in A 
abstract keyword 
abstract is standard inbuilt keyword of java language. It provides two different features i.e. 
abstract class and abstract method. 

 */