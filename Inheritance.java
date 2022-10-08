package Java.MPCEJAVANOTES;

public class Inheritance {
	
}
/*
 * Inheritance: Extending the properties of one class into another is known as inheritance. 
Type of Inheritance: 
There are three types of Inheritance in Java language as given below. 
1. Single inheritance 
A (super class) 
| (sub class) 
A class from which properties are inherited is known as super class and the class in which the properties are inherited is known as sub class. 
When one class inherits properties from other class then such type of inheritance is known as single 
inheritance. In the above diagram class A is super class and class B is sub class of super class A and therefore class B contains all the properties of class A as well as properties of its own class. 
2. Multilevel inheritance 
When one class inherits properties from another class and another class inherits 
properties from next class and so on then such type of inheritance is known as multilevel 
inheritance. 
In the above diagram, class C is sub class of super class B and class B is sub 
class of super class A hence class C contains all the properties of super 
classes. 
3. Hierarchical Inheritance: 
When multiple classes extends properties from single class then such type of inheritance is known as hierarchical inheritance. 
In the above diagram class B, C and D are sub classes of super class 
A, therefore all the subclasses contain properties of super classes 
and the properties of their own class. 
extends keyword 
extends is standard inbuilt keyword of Java language, it is used to extends the properties of super class in sub class. Whenever any subclass extends the properties of super class then subclass will get all the properties of super class except private properties. 
Que. Explain method overriding with suitable example? 
Ans: 
Whenever same prototype of method is present in super class and sub class then method of 
sub class overrides the method of super class, such type of method is known as overridden method 
and the technique is known as method overriding. In method overriding, object of sub class can 
access overridden method of sub class and cannot directly access overridden method of super class. 
The concept of method overriding is useful to change the logical instructions of method of existing 
class without changing the existing code. 
Example 1: class A 
public void show() 
t 
System.out.println("I am in A”); 
class B extends A 
public void show() 
System.out.println("I am in B”); 
class UseMe 
public static void main(String args[]) 
B b1=new B(); b1.show(); 
Output: I am in B 
In the above example, class B is sub class of super class A and both the classes contain same 
prototype of show () method with different logical instructions therefore show () method of class B 
will override the show () method of class A and object of class B will access show () method of its 
own class i.e. show () method of class A is hidden for the object of sub class B. show () method is 
known as overridden method. 

 */