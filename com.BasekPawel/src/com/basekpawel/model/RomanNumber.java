/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.model;
import java.util.regex.*;
/**
 *
 * @author pawel
 */
public class RomanNumber {
    private String number;
    
    public void setNumber(String nb){
        number = nb;
    }
    /** return true if number consist only letter which are used in Roman Numbers */
    public boolean areGoodLetters(){
        Pattern p = Pattern.compile("[IVXLCDM]+");
        Matcher m = p.matcher(number);
        boolean b = m.matches();
        
        return b;
    }
    
    /** return true if number have at least 3 same letter in row */
    public boolean haveAtLeastThreeSameLetters(){
        int count = 1;
        char tempSign = ' ';
        for(int i = 0; i < number.length(); i++){
            
            if(tempSign != number.charAt(i)){
                tempSign = number.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
            
            if(count >= 3){
                return false;
            }
            
            tempSign = number.charAt(i);
        }
        return true;
    }
    
    /** return true if number is correct */
    public boolean isCorrect(){
        return false;
    }
}
