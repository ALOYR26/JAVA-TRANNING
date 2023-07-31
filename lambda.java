interface Drawable 
{
   public void draw();
}


public class lambda
{
	public static void main(String[] args) 
	{
		int width=10;
		//Drawable d=new Drawable()
		Drawable d=()->
				{
		           System.out.println("Drawing "+width);
		           
				};
				d.draw();
				
	}

}