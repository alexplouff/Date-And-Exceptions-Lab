/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

/**
 *
 * @author Alex
 */
public class StartUp {
    
    
    public static void main(String[] args) {
        DateService ds = new DateService();
        String date = "03/15/2014";
        String empty = "";
        String tooManyCharaceters = "03/04/20145";
        
        try {
            ds.setDateFromString( tooManyCharaceters );
        } catch (TooManyCharactersException | IllegalArgumentException ie ) {
            System.out.println(ie.getLocalizedMessage());
            
        } 
        
        
    }
}