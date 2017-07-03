/*Create an abstract class Parent and define an abstract methods in it and implement it in the child 
class */

package asst5_1;

//The child class SubClass extends AbstractMethods
public class SubClass extends AbstractMethods
{
 String newLine = System.getProperty("line.separator");
 public void Calculate()
 {
   System.out.println(newLine + "subclass calculate!!!" + newLine);
 }
public void PrintHello() {
	
}
}