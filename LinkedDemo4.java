//Write a Java program to insert the specified element at the specified position in the linked list.


 import java.util.LinkedList;
public class LinkedDemo4
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.add(2,"Purpal");
       System.out.println("New linkedlist " +Color);
   }
}