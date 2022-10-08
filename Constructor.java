package Java.MPCEJAVANOTES;


public class Constructor {
	// https://www.geeksforgeeks.org/constructors-in-java/#:~:text=A%20constructor%20in%20Java%20is,codes%20similar%20to%20the%20method.
	// explainn the consept of constructor and
	// diffrewnt types of constructor with suitable example

	// note copy constructor is not awaileble in java but we can
	// perform opration of copy cunstructor using the parametrized constructor

	// if we dont provide void in front of Data most ide's throw error like⬇️⬇️
	// "Return type for the method is missing" void basically indicates that the
	// function does not return a value
	// private static int a;
	// public void Data(){
	// a=10;
	// }

	// public static void Data(int n){
	// a=n;
	// }

	// public void Show(){
	// System.out.println("value"+a);

	// }
	// class UseMe{
	// public static void main(String[] args) {
	// Data d1= new Data(100); //
	// Data d2= new Data(100);//
	// d1.show();
	// d2.show();
	// }
	// }

	public static void main(String[] args) {
		FromOut FO = new FromOut();//calling class
		System.out.println(FO.name); //refering FromOut class with its new ref name "FO"
		System.out.println(FO.num);
	}

}

class FromOut {

	int num = 10;
	String name = "java";

	FromOut() {

		System.out.println("constructor called");
	}

}
















/*
 * Que. Explain the concept of constructor and different types of constructor with suitable example? 
Answer: 
Constructor: Constructor is special method of class that is automatically invoked whenever the object is created. It is used to initialize the member variables of object. 
Rules to create constructor 
1. Constructor name should exactly match with class name. 2. Access specifier of constructor could be private/public or protected. 
ni mi 
3. Constructor should not have any return type not even void. 
4. Constructor should not contain any return statement. 
5. Overloading of constructor is allowed. 6. Implicit return value of constructor is always an object. 
Types of constructor 
There are only two types of constructor available in java language as given below. 1. Default Constructor: Constructor with no parameter or zero parameters is known as default 
constructor. 
2. Parameterized Constructor: Constructor with one or more than one parameters is known as 
parameterized constructor. 
Note: copy constructor is not available in java language, but we can perform operation of copy 
constructor using the parameterized constructor. 
Example: class Data 
private int a; 
public Data() 
a=10; 
public Data(int n) 
a=n; 
public void show() 
System.out.println("Value="+a); 
class UseMe 
public static void main(String args[]) 
Data dl=new Data(); Data d2=new Data(100); d1.show(); d2.show(); 
Output: 
Value=10 Value=100 
In the above example, Data class contain two types of constructor i.e. default and parameterized constructor. Default constructor is initializing the value of member variable 'a' by 10 
where as parameterized constructor is initializing the value of member variable by the value of given 
parameter. 
During the execution of main program, object d1 will create memory and initialize the value 
of member variable by executing the default constructor where as object d2 will create memory and initialize the value of member variable by using parameterized constructor. 
Note: if constructors are defined in the class then we can access only the defined constructors but if 
the class is not containing any constructor then we can access default constructor. 

 */