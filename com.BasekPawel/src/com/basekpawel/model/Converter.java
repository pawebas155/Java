/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.model;
import com.basekpawel.model.IArabicNumber;
import com.basekpawel.model.IRomanNumber;
import java.util.HashMap;
/**
 *
 * @author Paweł Basek
 * @version 0.1
 * @since 0.1
 */

interface IConverter{
    public ArabicNumber convertion(RomanNumber romanNb);
}

public class Converter implements IConverter {
    /**
     * Map which store the Roman numbers and corresponding values
     */
    private HashMap<Character, Integer> romanLetter = new HashMap<Character, Integer>();
    
    public Converter(){
        initializeRomanLetter();
    }
    /**
     * initialize map with the Roman numbers
     */
    private void initializeRomanLetter(){
       romanLetter.put('I', 1);
       romanLetter.put('V', 5);
       romanLetter.put('X', 10);
       romanLetter.put('L', 50);
       romanLetter.put('C', 100);
       romanLetter.put('D', 500);
       romanLetter.put('M', 1000);
    }
    
    /**
     * Convert the Roman number to the Arabic number
     * @param romanNb
     * @return the Arabic number
     */
    public ArabicNumber convertion(RomanNumber romanNb){
        
        ArabicNumber arabicNb = new ArabicNumber();
        String romanNumber = new String(romanNb.get());
        
        char tempSign;
        char signWithMaxValue = 'I';
        int valueOfRomanNumber = 0;
        
        for(int i = romanNumber.length() - 1; i >=0; i--){
           tempSign = romanNumber.charAt(i);
           
           
           if(romanLetter.get(tempSign) >= romanLetter.get(signWithMaxValue)){
               signWithMaxValue= tempSign;
               valueOfRomanNumber += romanLetter.get(tempSign);
           }
           else{
               valueOfRomanNumber -= romanLetter.get(tempSign);
           }
        }
        
        arabicNb.set(valueOfRomanNumber);
        return arabicNb;
   }
}
