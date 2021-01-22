 /****    
 * Name: Johannes Olafsson
 * Student Number: T00629654   
 * Date: January 20, 2021
 * Program Description:  Methods used in MainClass
 ****/
public class methods {

     // Initializes all arrays used in MainClass
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
     // Calculates total sales from each store     
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
     // Calculates the montly total sales
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
     // Formats and prints out a table with monthly sales
     public static void PrintOutput(){
          System.out.printf("%-15s\n", "Output:");
          System.out.printf("%-30s%19s%22s\n", "Store", "Montly Sales ", "Store");
          System.out.printf("%-30s%20s%21s\n", "Location", "(Thousands of $)", "Totals");
          System.out.printf("%-15s","");
          for(int i = 0; i < MainClass.months.length; i++){
               System.out.printf("%8s", MainClass.months[i]);
          }
          System.out.println();
          for(int i = 0; i < MainClass.stores.length; i++){
               System.out.printf("%-15s", MainClass.stores[i]);
               for(int j = 0; j < MainClass.sales[i].length; j++){
                    //System.out.println(MainClass.sales.length);
                    System.out.printf("%8d", MainClass.sales[i][j]);
               }
               System.out.printf("%8d\n", MainClass.storeTotals[i]);
          }
          System.out.printf("%-15s","Month Totals");
          for(int i = 0; i < MainClass.monthTotals.length; i++){
               System.out.printf("%8d", MainClass.monthTotals[i]);
          }
     }
}