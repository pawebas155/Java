/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.controller;
import com.basekpawel.model.RomanNumber;
import com.basekpawel.view.View;
import com.basekpawel.exception.*;


/**
 *
 * @author Student
 */
public class Controller {
    
    View programeView = new View();
    RomanNumber romanNumber;// = new RomanNumber();
    
    public void mainPrograme(){
        //programeView.Menu();    // this function return int
        
        
        romanNumber = new RomanNumber("MMMDMXVII");
        
        try{
            romanNumber.isCorrect();
        }
        catch(RomanNumberStructureException ex){
            System.out.println(ex);
        }
    }
}
