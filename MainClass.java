 /****    
 * Name: Johannes Olafsson
 * Student Number: T00629654   
 * Date: January 20, 2021
 * Program Description:  include an appropriate one or more line description here
 ****/
//import array.*;
public class MainClass{
     static String [] stores = new String [7];
     static String [] months = new String [6];
     static int [] sales = new int [1]; //????
     static int [] totals = new int [1]; //????
     static String[] [] table = new String [1] [2]; //????

     public static void main(String[] args){
          int [] newArray = {0, 1, 2, 3, 4};
          int [] newArray1 = {0, 1, 2, 3, 4};
          int total = Methods.totals(newArray);
          System.out.println(Methods.Allinfo(newArray, newArray1));
     }
}