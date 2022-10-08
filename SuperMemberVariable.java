package Java.MPCEJAVANOTES;

public class SuperMemberVariable {
	
}


/*
 * Que. Explain super member variable of java language? 
Ans: 
Whenever super and sub class contain same variable/object then variable/object of sub class will hide the variable/object of super class such type of variable/object is known as hidden variable or hidden object, in such case, sub class will not able to access member variable of super 
class. 
Example 1: 
class A 
public int n; 
public void showa() 
System.out.println("A="+n); 
class B extends A 
public int n; 
public void setB(int n1,int n2) 
n=n1; 
n=n2; 
} 
public void showB() 
System.out.println(“B="+n); 
class Use Me 
public static void main(String args[]) 
B b1=new B(); b1.setB(10,20); 
b1.show(); 
b1.showB(); 
Output: 
A=0 
B=20 
To access the member variable of super in sub class we have to use super keyword as shown 
below. 
Example 2: 
class A 
public int n; 
public void showAl) 
System.out.println("A=”+n); 
class B extends A 
W 
h 
ile phone 
public int n; 
public void setB(int n1,int n2) ? 
super.n=n1; 
n=n2; 
10 
public void showB() 
System.out.println(“B="+n); 
class UseMe 
public static void main(String args[]). 
B b1=new B(); | b1.setB(10,20); 
b1.showal); b1.showB(); 
Output: 
A=10 
B=20 
final keyword 
final is standard inbuilt keyword of java language. It provides three different features in java 
language i.e. final variable, final method and final class. 

 */