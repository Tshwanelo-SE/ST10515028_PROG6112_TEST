/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

import java.io.*;


/**
 *
 * @author Student
 */
public abstract class ConsoleSales extends Consoles {
    public ConsoleSales(String ConsoleType, String Store, int TotalSales){
    super(ConsoleType, Store, TotalSales);
}
    @Override 
    public void PrintReport(){
    System.out.println();
    System.out.println("Console Sales Report");
    System.out.println("********************");
    System.out.println("Console Type: "+ getConsoleType());
    System.out.println("Enter The Store: "+ getStore());
    System.out.printf("Enter The Amount of sales: R %.2f%n"+ TotalSales);
    }
    
}