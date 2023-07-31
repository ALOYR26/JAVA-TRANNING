public class exception {
	public static void main(String[] args)
	{
		try
		{
			//code that may raise exception
			int data=100/10;
			System.out.println(data); //10
			String s="java";
			System.out.println(s.length()); //4
			String a="100";
			int i=Integer.parseInt(a);
			System.out.println(i);
			int arr[]=new int[5];//0 1 2 3 4 5
			arr[4]=1000;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		//rest code of the program
		System.out.println("rest of the code....");
	}
	}