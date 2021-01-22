 /****    
 * Name: Johannes Olafsson
 * Student Number: T00629654   
 * Date: January 20, 2021
 * Program Description:  include an appropriate one or more line description here
 ****/

 public class MainClass{
     static String [] stores = {"Chilliwack", "Kamloops", "Kelowna", "Nanaimo", "Surrey", "Vancouver", "Victoria"};
     static String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "June"};
     static int [] monthTotals = new int [months.length];
     static int [] storeTotals = new int [stores.length];
     static int [][] sales = {     {400, 500, 500, 600, 500, 600},
                                   {600, 800, 800, 800, 900, 900},
                                   {700, 700, 700, 900, 900, 1000},
                                   {500, 600, 700, 800, 700, 700},
                                   {800, 700, 800, 700, 900, 800},
                                   {1000, 1100, 1200, 1300, 1400, 1400},
                                   {900, 900, 900, 1000, 1100, 1100}};

     public static void main(String[] args){
          storeTotals = methods.StoreTotals(sales);
          monthTotals = methods.MonthlyTotals(sales);
     }
}