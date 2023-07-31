package createFile;
import java.io.*;
public class createfile {

	public static void main(String[] args) 
	{
	  try
	  {
		  File myObj=new File("D:\\Pop");
		  if(myObj.createNewFile())
		  {
			  System.out.println("File Created: "+myObj.getName());
		  }
		  else
		  {
			  System.out.println("File already exists");
		  }
	  }
	  catch(IOException e)
	  {
		  System.out.println("An error Occurred");
		  e.printStackTrace();
	  }
	}

}