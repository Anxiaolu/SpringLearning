/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.validator;

import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class DateValidator {
//    public boolean isIllegalDate(String date){
//        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd");
//        
//    }
    
    public static boolean isValidate(int y, int m, int d) {
        if (d < 1 || m < 1 || m > 12) {
            return false;
        }
        switch (m) {
            case 2:
                if (isLeapYear(y)) {
                    return d <= 29;
                } else {
                    return d <= 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return d <= 30;
            default:
                return d <= 31;
        }
    }

    public static boolean isLeapYear(int y) {
        return y % 4 == 0 && (y % 400 == 0 || y % 100 != 0);
    }
}
