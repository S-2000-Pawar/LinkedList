//Write a Java program to insert the specified element at the end of a linked list


import java.util.LinkedList;
import java.util.Iterator;
public class LinkedDemo7
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.addLast("Yellow");
       System.out.println("New Linkedlist " +Color);
   }
}