import java.io.*;  
class FI{  
  public static void main(String args[]){  
   try{  
     FileOutputstream fout=new FileOutputStream("abc.txt");  
     String s="Sachin Tendulkar is my favourite player";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }catch(Exception e){system.out.println(e);}  
  }  
}
