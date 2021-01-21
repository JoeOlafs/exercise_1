import java.util.Scanner;
import java.io.*;

public class test {
     public static void main(String[] args){
          System.out.println(new File("SampleData.txt").getAbsolutePath());
          String inputFilename = "SampleData.txt";
          Scanner scan = new Scanner (new File(inputFilename));
          String current = new java.io.File( "." ).getCanonicalPath();
          System.out.println("Current dir:"+current);
     }
}
