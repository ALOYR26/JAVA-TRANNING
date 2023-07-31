class vehicle{
  void run()
  {
      System.out.println("The Vehicle is Running");
      
  }
}

class bike extends vehicle{
  
  void run()
  {
      System.out.println("Bike is Running");
  }
  
}

public class overiding{
   public static void main(String[] args){
       bike b1=new bike();
       b1.run();
       
   }
  
}