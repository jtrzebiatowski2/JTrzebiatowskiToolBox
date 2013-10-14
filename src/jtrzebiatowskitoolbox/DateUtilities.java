package jtrzebiatowskitoolbox;


import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author J-Tron
 */
public class DateUtilities {
    
    //This methods returns the current date and time
    public static Date currentDateTime(){
        return Calendar.getInstance().getTime();
    }
    //This methods takes a date object and a particular string format and returns the date object in the requested format
    public static String getCurrentDateTimeWithFormat(Calendar date, String formatPattern){
        String formattedDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat(formatPattern);
        formattedDate = sdf.format(date.getTime());
        
        return formattedDate;
        
    }
    
    
    
   
}
