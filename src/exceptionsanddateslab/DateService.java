package exceptionsanddateslab;


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
    
    
    public Date getDateFromString(  ) throws ParseException {
        String dateFormat = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
        Date date = new Date();
        String formattedDate = "03/19/2014";
        date = sdf.parse( formattedDate );
        return date;
    }
    
    
    
    public void getCalendarFromString( String MonthDateYearAndTime ) throws ParseException {
        String dateFormat = "MM/dd/yyyy H:mm " ;
        SimpleDateFormat sdf = new SimpleDateFormat( dateFormat );
        Calendar calendarDate = Calendar.getInstance();
        
        
        Date date = sdf.parse( dateFormat );
        calendarDate.setTime( date );
        System.out.println( calendarDate.getTime() );
        
        
        
    }
    
    public static void main(String[] args) {
        DateService d = new DateService();
        
        try{
        System.out.println(d.getDateFromString());
        
        } catch ( ParseException pe) {
            
            System.out.println("Please Enter Numbers To Format Date Format");
        }
        
        
        try{
            d.getCalendarFromString( "03/19/2014 1:24 " );
        } catch ( ParseException pe) {
            System.out.println("FAIL ...Enter Number for Month, Date, Year, And Time");
        }
        
        
        
        
        
    }
    
}
