// Write a Java program to insert some elements at the specified position into a linked list. 


import java.util.LinkedList;
import java.util.Iterator;
public class LinkedDemo8
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.add(1,"Purpal");
       Color.add(4,"Yellow");
       System.out.println("New Linkedlist " +Color);
    }
}