/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoleapplication;
import java.io.*;
import java.util.*;
/**
 *
 * @author Student
 */
public abstract class ConsoleApplication extends Consoles{
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String [] ConsoleType = {"PS5", "XBOX", "SWITCH"};
       
        System.out.println("select a console type");
            for(int i = 0; i < ConsoleType.length; i++){
                System.out.println((i+1)+" "+ ConsoleType[i]);
        }
            int choice = readInt(input,"enter your choice: ", 1, ConsoleType.length);
      
            ConsoleType = ConsoleType[choice - 1];
            
            System.out.println("enter the store name: ");
            String Store = input.nextLine().trim();
            
            
    }

    private static int readInt(Scanner input, String enter_your_choice_, int i, int length) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}

