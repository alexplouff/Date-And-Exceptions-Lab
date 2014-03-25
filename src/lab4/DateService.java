package lab4;


import exceptionsanddateslab.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class DateService {
    
    
    public void setDateFromString( String getDate ) throws TooManyCharactersException, IllegalArgumentException {
        
        if ( getDate.length() == 0 ) {
                throw new IllegalArgumentException (
                    "Requires digits, Must be in format ##/##/####" );
        } 
        
        if ( getDate.length() > 10) {
            throw new TooManyCharactersException("Too Many Characters");
            
        }
        
        String dateFormat = "MM/dd/yyyy";
        try{
        SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
        Date date;
        date = sdf.parse( getDate );
        System.out.println( date );
        } catch (ParseException pe) {
            System.out.println("Incorrect Format ##/##/####");
        }
    }
    
    
    
    public void setCalendarFromString( String MonthDateYearAndTime ) throws ParseException {
        
        if ( MonthDateYearAndTime.length() == 0 ) {
            throw new IllegalArgumentException(" Format must follow ##/##/#### #:## ");
        }
        
        String dateFormat = "MM/dd/yyyy H:mm " ;
        SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
        Calendar calendarDate = Calendar.getInstance( );
        
        
        Date date = sdf.parse( MonthDateYearAndTime );
        calendarDate.setTime( date );
        System.out.println( calendarDate.getTime( ) );
        
    }
        
}
