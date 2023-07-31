/*
 * Linked List
 * Linked list Implements the collection interface
 * it uses a doubly linked list internally to store the elements 
 * It can Store the Duplicate elements
 * It maintains the insertion order
 * In Linked List the Manipulation is fast because no shifting
 */

 import java.util.*;
 public class linkedlist
{
    public static void main(String[]args){
        LinkedList <String> ll = new LinkedList<String>();
        LinkedList <String> ll1 = new LinkedList<String>();
        vector<String> = new Vect
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("praveen");
        ll.add("teja");
        ll1.add("bc");
        ll1.addAll(ll);
        System.out.println("LL ::"+ll);
        System.out.println("LL1 ::"+ll1);
        ll1.removeAll(ll);
        System.out.println("LL1 ::"+ll1);

        Iterator<String> itr=ll.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());


        }
    }
}