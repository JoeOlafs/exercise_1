public class methods {

     //WORK IN PROGRESS
     public static void Initialize(){
          MainClass.stores = new String[] {"Chilliwack", "Kamloops", "Kelowna", "Nanaimo", "Surrey", "Vancouver", "Victoria"};
          MainClass.months = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "June"};
          MainClass.storeTotals = new int[MainClass.stores.length];
          MainClass.monthTotals = new int[MainClass.months.length];
          MainClass.sales = new int[][] {    {400, 500, 500, 600, 500, 600},
                                             {600, 800, 800, 800, 900, 900},
                                             {700, 700, 700, 900, 900, 1000},
                                             {500, 600, 700, 800, 700, 700},
                                             {800, 700, 800, 700, 900, 800},
                                             {1000, 1100, 1200, 1300, 1400, 1400},
                                             {900, 900, 900, 1000, 1100, 1100}};
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