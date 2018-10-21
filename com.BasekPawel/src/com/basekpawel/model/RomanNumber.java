/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.model;
import java.util.regex.*;
import com.basekpawel.exception.RomanNumberStructureException;

/**
 *
 * @author pawel
 */

interface IRomanNumber {
    public boolean isCorrect() throws RomanNumberStructureException;
}

public class RomanNumber implements IRomanNumber{
    private String number;
    
    public RomanNumber(String nb){
        number = nb;
    }
      
    /** return true if number is correct */
    public boolean isCorrect() throws RomanNumberStructureException{

        Pattern p = Pattern.compile("M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
        Matcher m = p.matcher(number);
        
        if(m.matches() == false)
            throw new RomanNumberStructureException();
        
        return true;
    }
}
