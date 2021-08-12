//Write a Java program to display the elements and their positions in a linked list.

import java.util.LinkedList;
public class LinkedDemo10
{
   public static void main(String[] args)
   {
      LinkedList<String>Color=new LinkedList<String>();
       Color.add("Pink");
       Color.add("Green");
       Color.add("Orange");
       Color.add("White");
       System.out.println(Color);
       for(int i=0;i<Color.size();i++)
       {
          System.out.println("Element at index "+i+": "+Color.get(i));
        }
  }
} 