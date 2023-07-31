class add{
   public add(int a,int b){
    return(a+b);}
    public add(int a,int b,int c){
        return(a+b+c);}
       public add(int a,int b,double d){
                return(a+b+d);}
    }


public class overload{
    public static void main(String[]args){
        add(5,7);
        add(5,6,7);
        add(5,6,7.8);
    }
}