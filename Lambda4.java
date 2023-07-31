interface adder {
	public int add(int a,int b);


}
interface multiply{
    public int mul(int a,int b);

}
public class Lambda4 
{
	public static void main(String[] args) 
	{
		adder a1=(a,b)->
		{
			return a+b;
		};
		System.out.println(a1.add(5,6));
		multiply m=(a,b)->
		{
			return a*b;
		};
		System.out.println(m.mul(5,6));		
	}

}