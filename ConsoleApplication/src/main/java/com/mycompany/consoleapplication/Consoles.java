/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

/**
 *
 * @author Student
 */
public abstract class Consoles implements iConsoles {
    private String ConsoleType;
    private String Store;
    int TotalSales;
    
    public Consoles(String ConsoleType, String Store, int TotalSales){
      this.ConsoleType = ConsoleType;
      this.Store =  Store;
      this.TotalSales = TotalSales;
      }
    public String getConsoleType(){
    return ConsoleType;
    }
    public String Store(){
    return Store;
    }
    public int getTotalSales(){
    return TotalSales;
    }      
}

