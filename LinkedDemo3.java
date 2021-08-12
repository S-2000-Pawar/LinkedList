//Write a Java program to iterate a linked list in reverse order.


import java.util.LinkedList;
import java.util.Iterator;
public class LinkedDemo3
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Iterator i =Color.descendingIterator();
       System.out.println("Elements in Reverse Order:");
     while (i.hasNext()) 
     {
        System.out.println(i.next());
     }
  }
}
   
