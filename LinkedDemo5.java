//Write a Java program to insert elements into the linked list at the first and last position.


import java.util.LinkedList;
public class LinkedDemo5
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.addFirst("Yellow");
       Color.addLast("Purpal");
       System.out.println("New linkedlist " +Color);
  }
}
