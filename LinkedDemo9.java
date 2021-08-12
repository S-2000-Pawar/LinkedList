//Write a Java program to get the first and last occurrence of the specified elements in a linked list.


import java.util.LinkedList;
import java.util.Iterator;
public class LinkedDemo9
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color); 
       Object first_element=Color.getFirst();
       System.out.println("First element " +first_element);
       Object last_element=Color.getLast();
       System.out.println("Second element " +last_element);
  }
}