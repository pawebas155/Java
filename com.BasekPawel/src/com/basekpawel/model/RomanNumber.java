/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.model;
import java.util.regex.*;
import com.basekpawel.exception.*;

/**
 *
 * @author Paweł Basek
 * @version 0.1
 * @since 0.1
 */

interface IRomanNumber {
    public boolean isCorrect() throws RomanNumberStructureException, EmptyStringException;
    public String get();
    public void set(String rNb);
}

public class RomanNumber implements IRomanNumber{
    /**
     * number stores the Roman number which the user provide 
     */
    private String number;
    
    /**
     * @return the Roman number
     */
    public String get(){
        return number;
    }
    
    /**
     * @param rNb set the Roman number
     */
    public void set(String rNb){
        number = rNb;
    }
    
    /**
     * 
     * @return true if the Roman number is correct
     * @throws RomanNumberStructureException throw exception if the structure of the Roman number is uncorrect
     * @throws EmptyStringException throw exception if there is empty string (no roman number)
     */
    public boolean isCorrect() throws RomanNumberStructureException, EmptyStringException{

        Pattern p = Pattern.compile("M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
        Matcher m = p.matcher(number);
        
        if(m.matches() == false)
            throw new RomanNumberStructureException();

        if(number.isEmpty())
            throw new EmptyStringException();
        
        return true;
    }
}
