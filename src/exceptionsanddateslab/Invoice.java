/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsanddateslab;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Invoice {

    private Calendar invoiceDate;
    private Calendar dueDate;
    private final int gracePeriod = 15;
    
    private Date date;

    public Invoice (  ){
        invoiceDate = Calendar.getInstance(  );
    }
    
    public void setDueDate(){
        invoiceDate.add(Calendar.DATE, gracePeriod);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Calendar getDueDate() {
        
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        //invoiceDate.add(Calendar.DATE, gracePeriod);
        
        this.dueDate = dueDate;
    }   
    
    public String getInvoiceDateAsString(){
        String format = "M/dd/yyy";
        SimpleDateFormat sdf = new SimpleDateFormat( format );
        date = invoiceDate.getTime();
        String dateOfInvoice = sdf.format(date);
        return dateOfInvoice;
    }
    
    public String getDueDateAsString() {
        String format = "M/dd/yyy";
        SimpleDateFormat sdf = new SimpleDateFormat( format );
        setDueDate();
        date = invoiceDate.getTime();
        String invoiceDueDate = sdf.format(date);
        return invoiceDueDate;
        
    }

    public static void main(String[] args) {
        Invoice d = new Invoice();
        System.out.println("The Date Of The Invoice Was: " + d.getInvoiceDateAsString());
        
        System.out.println("\nThe Due Date Of The Invoice Is: " + d.getDueDateAsString());
    }
    

}
