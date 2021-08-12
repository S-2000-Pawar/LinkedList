//Write a Java program to append the specified element to the end of a linked list.


import java.util.LinkedList;
public class LinkedDemo
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.offerLast("Yellow");
      System.out.println("Final linkedlist " +Color);
   }
}