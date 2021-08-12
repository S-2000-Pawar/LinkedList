 //Write a Java program of swap two elements in a linked list.  

import java.util.LinkedList;
import java.util.Collections;
public class LinkedDemo14
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       Collections.swap(Color,1,3);
       System.out.println(Color);
   }
}