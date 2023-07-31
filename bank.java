class RBI{
  
    int getROI()
    {
        return 6;
    }
}
class SBI extends RBI
{
    int getROI()
    {
        return 10;
    }
}

class ICICI extends RBI
{
    int getROI()
    {
        return 15;
    }
}

class AXIS extends RBI
{
    int getROI()
    {
        return 20;
    }
}

public class bank{
    public static void main(String [] args)
    {
        SBI s= new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest:"+s.getROI());
        System.out.println("ICICI Rate of Interest:"+i.getROI());
        System.out.println("AXIS Rate of Interest:"+a.getROI());
    }
}