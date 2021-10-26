package collections;

import java.util.*;  
public class LinkedList1{  
 public static void main(String args[]){  
  
  LinkedList<String> name=new LinkedList<String>();  
  name.add("Ravi");  
  name.add("Lucky");  
  name.add("Ravi");  
  name.add("Kumar");  
  
  Iterator<String> itr=name.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  