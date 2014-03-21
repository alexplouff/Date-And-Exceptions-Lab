/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsanddateslab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class CustomValidation {

    public void setDateFromString( String getDate ) throws Exception {
        
        if ( getDate.length() == 0 ) {
                throw new IllegalArgumentException (
                    "Requires digits, Must be in format ## ## ####" );
        } 
        String dateFormat = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
        Date date;
        String formattedDate = " 03/19/2014 ";
        sdf.parse( getDate );
        date = sdf.parse( formattedDate );
        
            System.out.println( date );
            System.out.println( getDate );
        
        
    }

    public void setCalendarFromString( String MonthDateYearAndTime ) throws ParseException {
        String dateFormat = "MM/dd/yyyy H:mm ";
        SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
        Calendar calendarDate = Calendar.getInstance( );

        Date date = sdf.parse( MonthDateYearAndTime );
        calendarDate.setTime( date );
        System.out.println( calendarDate.getTime( ) );

    }

    
//    public static void main(String[] args) {
//        CustomValidation c = new CustomValidation();
//        
//        try{
//        c.setDateFromString("03/19/2014");
//        
//        } catch ( Exception exception ) {
//            System.out.println( " fail ");
//        }
//    }
}
