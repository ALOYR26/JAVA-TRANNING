

interface Sayable {
	public String say(String nm);

}
public class Lambda3 
{
	public static void main(String[] args) 
	{
		Sayable s1=(nm)->
		{
			return "Hello, "+nm;
		};
		System.out.println(s1.say("SOOOO"));
		Sayable s2=(nm)->
		{
			return "Next, "+nm;
		};
		System.out.println(s2.say("no"));		
	}

}