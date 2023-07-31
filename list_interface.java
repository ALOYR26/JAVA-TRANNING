import java.util.*;
class list_interface
{
    public static void main(String args[])
    {
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);
        System.out.println("l1::"+l1);
        List<Integer> l2= new ArrayList<Integer>();
        List<Integer> m1= new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        m1.add(4);
        System.out.println("l2::"+l2);
        l1.addAll(1,l2);
        System.out.println("l1::"+l1);
        m1.addAll(1,l2);
        System.out.println("m1::"+m1);
        m1.remove(1);
        System.out.println("m1::"+m1);
        System.out.println(m1.get(2));
        m1.set(0,5);
        System.out.println("m1::"+m1);
        l2.set(0,5);
        System.out.println("l2::"+l2);
        //m1.removeAll(l2);
        System.out.println("m1::"+m1);
        boolean n = m1.contains(2);
        System.out.println("present?::"+n);
        

        for (int i =0;i<m1.size();i++){
            System.out.print(m1.get(i) + "");
        }
         System.out.println();
        for (int str:m1){
            System.out.print(str + "");
        }
        

    }
}