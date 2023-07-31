import java.util.*;  
class generics{  
public static void main(String args[]){  
ArrayList<Integer> list=new ArrayList<Integer>();  
list.add(11);  
list.add(11);  
list.add(13);
list.add(14);
list.add(15);
list.add(16);
list.add(17);
list.add(18);
list.add(19);
list.add(20);
list.add(20);

list.add(20);
list.add(20);
list.add(20);
//list.add(32);//compile time error  
  
int s=list.get(1);//type casting is not required  
System.out.println("Size is: "+list.size()); 
System.out.println("element is: "+s); 
//list.ensureCapacity(10)  ;
  
Iterator<Integer> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  