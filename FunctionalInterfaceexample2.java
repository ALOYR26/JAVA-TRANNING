 interface Doable
{
  default void doIt()
  {
	  System.out.println("Do it now");
  }
}
@FunctionalInterface
interface Sayable extends Doable
{
	   void say(String msg);
	   /*int hasCode();
	   String toString();
	   boolean equals(Object obj);**/
}
class FunctionalInterface2 implements Sayable
{
	public void say(String msg)
	{
		System.out.println(msg);
	}

}
public class FunctionalInterfaceexample2 {

	public static void main(String[] args) {
		FunctionalInterface2 file=new FunctionalInterface2();
		file.say("Hello there");
		file.doIt();

	}

}