/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel;
import com.basekpawel.controller.Controller;
/**
 *
 * @author Paweł Basek
 * @version 0.1
 * @since 0.1
 * 
 * This is main class where programe run.
 * Programe convert roman number to arabic number.
 */
public class ComBasekPawel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller(args);
        controller.mainPrograme();
    }
    
}