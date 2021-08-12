 //Write a Java program to iterate through all elements in a linked list. 


import java.util.LinkedList;
public class LinkedDemo1
{
  public static void main(String[] args)
  {
     LinkedList<Integer>Number=new LinkedList<Integer>();
     Number.add(10);
     Number.add(25);
     Number.add(30);
     Number.add(45);
     System.out.println(Number);
     for(int i=0;i<Number.size();i++)
     {
        System.out.println(Number.get(i));
      }
   }
}