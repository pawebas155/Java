/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.controller;
//import com.basekpawel.model.Model;
import com.basekpawel.model.RomanNumber;
import com.basekpawel.view.View;


/**
 *
 * @author Student
 */
public class Controller {
    
    View programeView = new View();
    //Model programeModel = new Model();
    RomanNumber romanNumber = new RomanNumber();
    
    public void mainPrograme(){
        programeView.Menu();    // this function return int     
        
    }
}
