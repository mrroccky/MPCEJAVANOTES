package Java.MPCEJAVANOTES;

public class StaticMembers {
	//pdfno1E1⬇️⬇️

	// note in vscode ide we cant Cannot make a static reference to the non-static field 
	// like ⬇️⬇️
//  int a =10;
// 	public static void main(String[] args) {
// 		System.out.println("value="+a);
// 	}

// wehave to declear like this with static key word 
static int a =10;
	public static void main(String[] args) {
		System.out.println("value="+a);
	}
}




















/*Static Members 
Whenever any member variable of class is declared as static then that 
member variable is known as static member variable. 
Whenever any method of class is declared as static then that method is known as static method. Static block or static method can directly access only the static members of its own class and cannot directly access non static members of its 
own class. 
class Example1 
int a=10; public static void main(String arg [ ]) 
System.out.println("value="+a); 
In the above example variable ‘a' is non static member variable and static method main is accessing the value of variable 'a' therefore compiler will generate following error during the compile time of program. 
Error: 
static method main () cannot access not static member variable 'a' 
 */