/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionsanddateslab;

import java.text.ParseException;

/**
 *
 * @author Alex
 */
public class ExceptionsAndDatesLab {

    public static void main(String[] args) {
        DateService service = new DateService();
        
        try {
        service.setDateFromString("03/15/2014");
        } 
        catch ( Exception e ){
            System.out.println(" Fail ");
        }
        
        try{
            service.getCalendarFromString( " 09/19/2014 9:24 " );
        }
        catch (ParseException pe) {
            System.out.println(" Fail ");
        }
    }
    
    
    
    
    
    
    
    
    
}
