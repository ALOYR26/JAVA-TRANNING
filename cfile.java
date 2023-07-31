// Import file class
import java.io.File;
import java.util.Scanner;
public class cfile
{
    public static void main(String args[])
    {
        System.out.println("Enetr the path where you to create the file");
        Scanner sc = new Scanner(System.in);
        String path= sc.next();
        System.out.println("Enetr the Name for the Directory");
        path=path+sc.next();
        File f1=new File(path);
        boolean bool =f1.mkdir();
        if(bool){
            System.out.println("File is Created Successfully");

        }
        else{
            System.out.println("ERROR FOUND");
        }


    }
    
}
