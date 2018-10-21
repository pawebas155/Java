/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.view;
import java.util.Scanner;

/**
 *
 * @author Paweł Basek
 * @version 0.1
 * @since 0.1
 */
interface IView {
    public String GetRomanNumber();
    public void TooMuchParameters();
    public void ShowArabicNumber(int arabicNb);
}

public class View implements IView {
    /**
     * This method get roman number form user.
     * @return roman number from user.
     */
    public String GetRomanNumber(){
        System.out.print("Give a Roman Number: ");
        Scanner scanner = new Scanner(System.in);
        String userNumber = scanner.next();
        
        return userNumber;
    }
    
    /**
     * Show a notification, that user entered too much parameters.
     */
    public void TooMuchParameters(){
        System.out.println("There are too much parameters.");
    }
    
    /**
     * Show on screen arabic number after convertion.
     * @param arabicNb Integer with Arabic number after conversion
     */
    public void ShowArabicNumber(int arabicNb){
        System.out.println("Roman Number after convertion: " + arabicNb);
    }
}
