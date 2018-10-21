/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.controller;
import com.basekpawel.model.*;
import com.basekpawel.view.View;
import com.basekpawel.exception.*;


/**
 *
 * @author Paweł Basek
 * @version 0.1
 * @since 0.1
 * 
 * This class control the programe.
 * It gets values from user in view and send it to model.
 */
public class Controller {
    
    String[] arguments;
    View programeView;
    RomanNumber romanNumber = new RomanNumber();
    Converter conv;
    
    /**
     * Constructor gets arguments and creates objects.
     * @param arg set table of programe paramters
     */
    public Controller(String[] arg){
        arguments = arg;
        programeView = new View();
        conv = new Converter();
    }
    
    /**
     * In this method programe gets roman number from user and send it to Model,
     * class RomanNumber check if the number is correct.
     * If it is correct it commission conversion from roman number to arabic number
     */
    public void mainPrograme(){
        
        String userNb = "";
        boolean isCorrectRomanNumber = false;
        
        if(arguments.length == 0){
            userNb = programeView.GetRomanNumber();
        }
        if(arguments.length == 1){
            userNb = arguments[0];
        }
        else{
            programeView.TooMuchParameters();
            userNb = programeView.GetRomanNumber();
        }
        
        romanNumber.set(userNb);
        
        try{
            isCorrectRomanNumber = romanNumber.isCorrect();
        }
        catch(RomanNumberStructureException ex){
            System.out.println(ex);
        }
        catch(EmptyStringException ex){
            System.out.println(ex);
        }
        
        while(isCorrectRomanNumber == false){
            userNb = programeView.GetRomanNumber();
            romanNumber.set(userNb);
            try{
                isCorrectRomanNumber = romanNumber.isCorrect();
            }
            catch(RomanNumberStructureException ex){
                System.out.println(ex);
            }
            catch(EmptyStringException ex){
                System.out.println(ex);
            }
        }
        
        ArabicNumber arabicNumber = conv.convertion(romanNumber);
        
        programeView.ShowArabicNumber(arabicNumber.get());
    }
}
