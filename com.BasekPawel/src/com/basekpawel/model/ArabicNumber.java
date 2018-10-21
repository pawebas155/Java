/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.model;

/**
 *
 * @author pawel
 */
interface IArabicNumber{
    public void set(int ab);
    public int get();
}

public class ArabicNumber implements IArabicNumber{
    private int arabicNumber;
    
    public void set(int nb){
        arabicNumber = nb;
    }
    
    public int get(){
        return arabicNumber;
    }
}
