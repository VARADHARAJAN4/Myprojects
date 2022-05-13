package fileconcept;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class characterstream {
   public static void main(String args[]) throws IOException {
      //Creating FileReader object
      File file = new File("D:/myFile.txt");
      FileReader reader = new FileReader(file);
      char chars[] = new char[(int) file.length()];
      //Reading data from the file
      reader.read(chars);
      //Writing data to another file
      File out = new File("D:/CopyOfmyFile.txt");
      FileWriter writer = new FileWriter(out);
      //Writing data to the file
      writer.write(chars);
      writer.flush();
      System.out.println("Data successfully written in the specified file");
   }
}
