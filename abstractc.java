abstract class shape
{
    abstract void draw();
}
class Rectangle extends shape{
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends shape{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}

class abstractc
{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.draw();
        Circle c = new Circle();
        c.draw();
        shape s1=new Rectangle();
        s1.draw();
        shape s2 = new Circle();
        s2.draw();
    
    }
}

