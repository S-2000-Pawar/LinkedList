//Write a Java program to remove a specified element from a linked list.


import java.util.LinkedList;
import java.util.Collections;
public class LinkedDemo11
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.remove(3);
       System.out.println("New Linkedlist " +Color);
    }
}
       