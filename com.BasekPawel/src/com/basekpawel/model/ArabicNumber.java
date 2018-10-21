/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.model;

/**
 *
 * @author Paweł Basek
 * @version 0.1
 * @since 0.1
 */
interface IArabicNumber{
    public void set(int ab);
    public int get();
}

public class ArabicNumber implements IArabicNumber{
    /**
     * it store the Arabic number
     */
    private int arabicNumber;
    
    /**
     * set the Arabic number
     * @param nb 
     */
    public void set(int nb){
        arabicNumber = nb;
    }
    
    /**
     * 
     * @return the Arabic number
     */
    public int get(){
        return arabicNumber;
    }
}
