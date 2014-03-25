/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class StartUp {
    
    
    public static void main(String[] args) {
        DateService ds = new DateService();
        String date = "03/15/2014";
        
        try {
            ds.setDateFromString();
        } catch (IllegalArgumentException ie ) {
            System.out.println(ie.getLocalizedMessage());
            
        } 
        
        
}
}