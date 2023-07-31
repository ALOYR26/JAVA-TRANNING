import java.util.*;  
class hashmap{  
public static void main(String args[]){  
    //HashMap is the subclass of the Map,which is an  Interface
Map<Integer,String> map=new HashMap<Integer,String>();  
Map<Integer,String> map1=new HashMap<Integer,String>();  
Map<Integer,String> map3=new HashMap<Integer,String>(); 
map.put(1,"Mango");  
map.put(4,"Apple");  
map.put(2,"Banana");  
map.put(5,"Grapes");  
map1.putAll(map);
map.putIfAbsent(3,"UNKNOWN");
map.putIfAbsent(1,"UNKNOWN");//relates the integer value to check if its present or no
//map.entryset() is genric 
// Iterartor has to be genric because your value will not be specific
System.out.println("Iterating Hashmap");
map.put(1,"Grapes");
map.replace(4,"App");
map.remove(1,"Grapes");
map3.putAll(map1);
for(Map.Entry m: map3.entrySet())
System.out.println(m.getKey()+" "+m.getValue());  
System.out.println("-----------------------------------------------");



for(Map.Entry m: map.entrySet())
System.out.println(m.getKey()+" "+m.getValue());  
System.out.println("-----------------------------------------------");

//Now use Map.Entry for Set and Iterator  
Set<Map.Entry<Integer,String>> set=map1.entrySet();  
  
Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
while(itr.hasNext()){  
Map.Entry e=itr.next();//no need to typecast  
System.out.println(e.getKey()+" "+e.getValue());  
}  
System.out.println("-----------------------------------------------");
map3.replaceAll((k,v)->"Ajay");
for(Map.Entry m: map3.entrySet())
System.out.println(m.getKey()+" "+m.getValue());  
System.out.println("-----------------------------------------------");
  
}}  