public class Methods {
     public static String[][] Allinfo(int[] arr0, int[  ] arr1){
          String [][] table = new String[arr0.length][arr1.length];
          return table;
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
}