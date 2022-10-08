package Java.MPCEJAVANOTES;

public class SuperConstructorInheritance {
	
}


/*
 * Que. Explain the flow the execution of constructor in inheritance? 
Or 
Que. Explain super constructor of inheritance? 
Ans: 
Whenever the object is created, it will allocate memory as per the number of member variables available in its class as well as in the super classes and therefore it is necessary to initialize the value of all the member variables of instance. To initialize the value of member variables of object, java interpreter invoke all the default constructor of super classes and after the complete execution of all the default constructors of super classes it will invoke constructor of its own class (requested constructor). 
Example1: 
class A 
private int n; 
public Al) 
a=10; 
public void showAO 
System.out.println("A="+a); 
class B extends A 
private int b; 
public B(int n) 
b=n; 
public void showB(). 
System.out.println(“B="+b); 
class Use Me 
public static void main(String arg[]) 
B b1=new B(200); b1.showA(); 
b1.showB(); 
output: 
A=10 
B=200 
To change the flow of constructor i.e. to invoke parameterized constructor of super class 
from the block of constructor of sub class, we have to use super keyword as shown below. 
Example1: 
class A 
private int n; 
public Al) 
a=10; 
} 
public Alint n) 
a=n; 
public void showa() 
System.out.println(“A="+a); 
class B extends A 
private int b; 
public B(int n1,int n2) 
super(nl); 
b=n2; 
public void showBO) 
{ 
System.out.println("B="+b); 
class Use Me 
public static void main(String arg[]). 
B b1=new B(100,200); b1.showA(); b1.showB(); 
Output: 
A=100 B=200 

 */