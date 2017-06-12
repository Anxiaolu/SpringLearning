/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author huanlu
 */
public class Dateformatter implements Formatter<Date>{

    private String datePattern;
    
    private SimpleDateFormat dateFormat;
    
    public Dateformatter(String datePattern){
        this.datePattern = datePattern;
        dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setLenient(false);
    }
    
    @Override
    public String print(Date t, Locale locale) {
        return dateFormat.format(t);
    }

    @Override
    public Date parse(String string, Locale locale) throws ParseException {
        try {
            return dateFormat.parse(string);
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date format.Please use this pattern\"" + datePattern + "\"");
        }
    }
    
}
