/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basekpawel.exception;

/**
 *
 * @author Paweł Basek
 * @version 0.1
 * @since 0.1
 */
public class EmptyStringException extends Exception{
    
    /**
     * 
     * @return message about the error
     */
    public String toString(){
        return "There is empty string.";
    }
}