//Write a Java program to remove first and last element from a linked list.

import java.util.LinkedList;
import java.util.Collections;
public class LinkedDemo12
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Color.remove(0);
       Color.remove(2);
       System.out.println(Color);
   }
}