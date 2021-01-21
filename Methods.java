public class methods {

     //WORK IN PROGRESS
     public static void AllInfo(String[] arr0, Integer[  ] arr1){
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
     
     public static int StoreTotals(int[][] array){
          int total = 0;
          int[][] myArray = array;
          int arrLength = myArray.length;
          for(int i=0; i < arrLength; i++){
               total = total +myArray[0][i];
          }
          return total;
     }

     public static int MonthlyTotals(int[][] array){
          int total = 0;
          int[][] myArray = array;
          int arrLength = myArray.length;
          for(int i=0; i < arrLength; i++){
               total = total +myArray[i][0];
          }
          return total;
     }

     public static void PrintOutput(){
          System.out.printf("hello\tthis is the final output\n");
          System.out.printf("total output\tmonths\ttotal sales");
     }
}