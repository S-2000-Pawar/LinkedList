//Write a Java program to remove all the elements from a linked list.

import java.util.LinkedList;
import java.util.Collections;
public class LinkedDemo13
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.clear();
       System.out.println(Color);
   }
}