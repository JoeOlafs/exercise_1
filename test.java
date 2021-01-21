import java.util.Scanner;
import java.io.*;

public class test {
     public static void main(String[] args)throws IOException{
          String inputFilename = "SampleData.txt";
          Scanner scan = new Scanner (new File(inputFilename));
          //String[] arr = new String[100];
          int[] arr0 = new int[7];
          int row = 0;
          for(int i = 0; i<14; i++){
               while(scan.hasNextLine()){
                    i++;
                    if(i==7){
                         while(scan.hasNext()){
                              arr0[row] = scan.nextInt();
                              row++;
                         }
                         System.out.println(arr0);
                    }
               }
          }
          // System.out.println(arr);

          //String current = new java.io.File(inputFilename).getCanonicalPath();
          //System.out.println("Current dir:"+current);
     }
}
