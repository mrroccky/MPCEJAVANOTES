package Java.MPCEJAVANOTES;

public class MethodOverloading {
	
}


/*
 * Que. Explain method overriding with suitable example? 
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
Que. Explain super keyword and super method? 
Ans: 
super is standard inbuilt keyword of java language. It is used to access member variable, 
methods and constructors of super class from the block of sub class i.e. super keyword provides 
three different features as follows. 
ce UNITETETIliescuies dS TONOWS. 
1. To access member variable of super class in sub class. 
2. To access constructor of super class in sub class. 3. To access methods of super class in sub class. 
Example 1: 
class A 
public void show() 
System.out.println("I am in A”); 
class B extends A 
public void show(). 
System.out.println("I am in B”); 
class UseMe 
public static void main(String args[]). 
B b1=new B(); 
b1.show(); 
Output: 
Tam in B 
In the above example, class B is sub class of super class A and both the classes contain same prototype of show () method due to which class B will not directly access the show () method of super class A. To access the show () method of super class A, we have to use super keyword that helps to access members of super class from the block of sub class as given below. 
Example 2: 
class A 
public void show() 
System.out.println(“I am in A"); 
class B extends A 
public void show() 
super.show(); 
System.out.println("I am in B”); 
class Use Me 
public static void main(String args[]) 
B b1=new B(); b1.show(); 
Output: 
Tam in A 
Tam in B 
In the above example, super keyword is used to access the show () method of super class A. 

 */