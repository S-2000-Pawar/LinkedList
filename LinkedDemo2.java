//Write a Java program to iterate through all elements in a linked list starting at the specified position.


import java.util.LinkedList;
import java.util.Iterator;
public class LinkedDemo2
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color); 
       Iterator i=Color.listIterator(2);
       while(i.hasNext())
       {
          System.out.println(i.next());
       }
   }
}