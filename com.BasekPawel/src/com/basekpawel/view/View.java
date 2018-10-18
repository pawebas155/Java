/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.view;
import java.util.Scanner;

/**
 *
 * @author Student
 */
interface IView {
    public int Menu();
}

public class View implements IView {
    
    public int Menu(){
        System.out.println("***Welcome to the converter of Roman numbers to Arabic***");
        System.out.println("Select action");
        System.out.println("1. Convert number");
        System.out.println("2. Exit");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
                
        return choice;
    }
    
}
