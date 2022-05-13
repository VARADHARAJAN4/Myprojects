package fileconcept;

import java.io.File; 
import java.io.IOException;  

public class filepro
{
        public static void main(String[] args) 
        {
        	try 
        	{
        		File Obj = new File("E:\\EduBridge Learning Pvt Ltd\\ppts\\DAY 19\\sita1.txt");
        		if (Obj.createNewFile())	
        		{
			        System.out.println("File created");
               		  System.out.println("Name of the file = " + Obj.getName());
                  } 
                else{
			       System.out.println("File already exists.");
                }
        } 
        catch (IOException e){
	        e.printStackTrace();
        }
   }
}
