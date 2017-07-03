/*Create an abstract class Parent and define an abstract methods in it and implement it in the child 
class */
  
package asst5_1;
/*
Abstract methods are the methods defined in abstract class which do not have any implementation.
In the below example, Calculate is an abstract method which does not have any implementation. 
So the deriving class, has to override the method. Here SubClass.
*/
public abstract class AbstractMethods {
  static String newLine = System.getProperty("line.separator");  
  public static void main(String[] args) {
    System.out.println("This is an Abstract Class");
    
    //Creating an instance of the subclass of abstract class & we see that as SubClass extends PrintHello
    SubClass cl = new SubClass();
    cl.Calculate();
    cl.PrintHello();
  }
  public abstract void Calculate();
  public void PrintHello()
  {
    System.out.println("Abstract class Hello" + newLine);
  }
}
