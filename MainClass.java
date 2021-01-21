 /****    
 * Name: Johannes Olafsson
 * Student Number: T00629654   
 * Date: January 20, 2021
 * Program Description:  include an appropriate one or more line description here
 ****/
//import Array.*;
public class MainClass{
     static String [] stores = new String [7];
     static String [] months = new String [6];
     static int [] sales = new int [1]; //????
     static int [] totals = new int [1]; //????
     static String[] [] table = new String [1] [2]; //????

     public static void main(String[] args){
          //String [] newArray = {"Jan", "Feb", "Mar", "Apr", "May", "June"};
          //Integer [] newArray1 = {0, 1, 2, 3, 4};
          //Integer [] newArray2 = {5, 6, 7, 8, 9};
          //int total = methods.totals(newArray);
          //System.out.println(total);
          //methods.Allinfo(newArray, newArray1);
          //System.out.println(table);
          methods.readString("SampleData.txt");
     }
}