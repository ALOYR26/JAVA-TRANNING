/*
 * An Interface that contains exactly one abstract method is known as functional interface
 * it can have any number of default static methods but can contain only one abstract method
 * it can also declare methods of object class
 * 
 * Functional Interface is also known as single Abstract method
 * Interface or SAM Interfaces
 * it helps in functional Programming  
 */
@FunctionalInterface // @annotation
interface sayable 
{
   void say(String msg);
   default void show()
   {
	   System.out.println("show method");
	}
	static void hello()
	{
		 System.out.println("hello");
	}
}



class FunctionalInterfaceExample implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
}

public class FunctionalInterfaceExample1{
    public static void main(String[] args){
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello World");
        fie.show();
    }
}

