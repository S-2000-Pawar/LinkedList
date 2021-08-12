// Write a Java program to insert the specified element at the front of a linked list. 

import java.util.LinkedList;
public class LinkedDemo6
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.addFirst("Purpal");
       System.out.println("New Linkedlist "  +Color);
   }
}
       