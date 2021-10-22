 package exceptions;
import java.io.*;  
  
class TestThrow2{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
 
//public class M{  
   public static void main(String args[]){  
    try{  
    	TestThrow2 m=new TestThrow2();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
}  