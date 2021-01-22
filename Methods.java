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
//READY     
     public static int[] StoreTotals(int[][] array){
          int[] total = new int [array.length];
          int[][] myArray = array;
          for(int row=0; row < myArray.length; row++){
               for (int col=0; col< myArray[row].length; col++){
                    total[row] = total[row] +myArray[row][col];
               }
          }
          return total;
     }
//READY
     public static int[] MonthlyTotals(int[][] array){
          int[] total = new int[array.length];
          int[][] myArray = array;
          for(int row=0; row < myArray.length; row++){
               for (int col=0; col < myArray[row].length; col++){
                    total[col] = total[col] + myArray[row][col];
                    total[6] = total[6] + myArray[row][col];
               }
          }
          return total;
     }

     public static void PrintOutput(){
          System.out.printf("hello\tthis is the final output\n");
          System.out.printf("total output\tmonths\ttotal sales");
     }
}