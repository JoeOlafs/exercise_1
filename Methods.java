import java.util.Scanner;
import java.io.*;

public class methods {
     public static void Allinfo(String[] arr0, Integer[  ] arr1){
          Object[][] table = {arr0, arr1};
          for(int row=0; row < table.length; row++){
               for(int col=0; col<table[row].length;col++){
                    System.out.print(table[row][col]);
               }
               System.out.println();
          }
          //System.out.println(table);
          //return table;
     }
     
     public static int totals(int[] array){
          int total = 0;
          int[] myArray = array;
          int arrLength = myArray.length;
          for(int i=0; i < arrLength; i++){
               total = total +myArray[i];
          }
          return total;
     }

     public static int monthlyTotals(int[] array){
          int total = 0;
          int[] myArray = array;
          int arrLength = myArray.length;
          for(int i=0; i < arrLength; i++){
               total = total +myArray[i];
          }
          return total;
     }

     public static void printOutput(){
          System.out.printf("hello\tthis is the final output\n");
          System.out.printf("total output\tmonths\ttotal sales");
     }

     public static void readString(String name){
          System.out.println(new File(name).getAbsolutePath());
          /*File file = new File("SampleData.txt");
          Scanner scan = new Scanner(file);
          String[] arr = new String[10];
          int row = 0;
          
          while(scan.hasNextLine()){
               while(scan.hasNext()){
                    arr[row] = scan.next();
                    row++;
               }
          }
          scan.close();
          return arr;*/
     }
}