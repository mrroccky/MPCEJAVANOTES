package Java.MPCEJAVANOTES;

public class StaticBlock {
	//pdfno1E2⬇️⬇️
	// static {
	// System.out.println("hello from static block");
		
	// 	public static void main(String[] args) {
	// 		System.out.println("hello from main function");
	// 	}
	// 	}

	//idont know why its giving error but 
	// i think the main method runs only when it was in in its parent class
	//but we can run that class like 

	// static class imaclass{
	// 	public static void main(String[] args) {
			//todo note! in java,c,c++,c# code ide automaticaly 
			// todo find its main function and start exicuting your code
	// 	}
	// }


 public static void main(String[] args) {
	System.out.println("error");
 }


}









/*
 * Static Block 
static is a key word of Java language that can create its own block within the class. Static block is new concept of Java language that is used to execute all the type of instructions before the execution of any member of that class. Execution control will execute static block only ones before the execution of any constant or method of that class. 
class Example1 
static 
System.out.println("I am in static block"); 
public static void main(String arg[]) 
System.out.println(“I am in main”); 
Output :- I am in static block 
I am in main 
During the execution of above program, execution control will execute all the statement of static block and after the complete execution of static block it will execute the statements of main block. 
Any number of static block can be cwrite anywhere in the problem 

 */









