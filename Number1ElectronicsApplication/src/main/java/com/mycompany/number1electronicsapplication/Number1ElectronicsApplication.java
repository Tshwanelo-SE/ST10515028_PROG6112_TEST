/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronicsapplication;

/**
 *
 * @author Student
 */
public class Number1ElectronicsApplication {

    public static void main(String[] args) {
   String [] city = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
   String [] console = {"PS5", "XBOX", "SWITCH"};
    int [][] sales = {
        {1000, 2000, 3000},
        {2000, 3000, 4000},
        {1500, 1100, 1200}
    };
     int[] totalsales = new int[sales.length];
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Gaming Console Report");
         System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
         // Display month headings
        System.out.printf("%-25s", "Consoles");
    }
    
    public static void displayReport(String[]city, String[] console, int[][] sales, int [] totalSales){
        System.out.printf("%-15", "console"); 

        for(int column =0; column < city.length; column++){
            System.out.printf("15-%", city[column]);
            
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        for (int row =0; row< sales.length; row++){
            System.out.printf("%-25", console[row]);
            
            for(int column=0; column < sales[row].length; column++){
                System.out.printf("%-15d", sales[row][column]);
                totalSales[row] += sales[row][column];
            }
            System.out.println();
        }
        System.out.println();
     for(int i =0; i < console.length; i++){
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Console Sales For Each City"+ console[i]+" "+ totalSales[i]);
        System.out.println("--------------------------------------------------------------------------------------");
    }
     int highestSales = totalSales[0];
     int topConsoleIndex = 0;
     for(int i = 0; i < totalSales.length; i++){
         if (totalSales[i] > highestSales){
             highestSales = totalSales[i];
             topConsoleIndex = i;
        }
         System.out.println();
         System.out.println("City With The Most Sales: "+" "+console[topConsoleIndex]+" "+city);
         System.out.println("--------------------------------------------------------------------------------------");
        }
    }
}
