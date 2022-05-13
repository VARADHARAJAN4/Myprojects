package fileconcept;

import java.io.*; 
public class fileoutputstream { 
   public static void main(String args[]) { 
      try { 
         byte bWrite [] = {121,22,31,24,25}; 
         OutputStream os = new FileOutputStream("mytest.txt"); 
         for(int x = 0; x < bWrite.length ; x++) { 
            os.write( bWrite[x] );  
         } 
         os.close(); 
         InputStream is = new FileInputStream("mytest.txt"); 
         int size = is.available(); 
         for(int i = 0; i < size; i++) { 
            System.out.print((char)is.read() + "  "); 
         } 
         is.close(); 
      } catch (IOException e) { 
         System.out.print("Exception"); 
      } 
   } 
} 