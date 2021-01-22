 /****    
 * Name: Johannes Olafsson
 * Student Number: T00629654   
 * Date: January 20, 2021
 * Program Description:  This program builds a table with total sales from stores around Canada
 ****/

 public class MainClass{
     // Creates arrays used for creating a table
     static String [] stores;
     static String [] months;
     static int [] storeTotals;
     static int [] monthTotals;
     static int [][] sales;                             

     public static void main(String[] args){
          methods.Initialize();
          storeTotals = methods.StoreTotals(sales);
          monthTotals = methods.MonthlyTotals(sales);
          methods.PrintOutput();
     }
}