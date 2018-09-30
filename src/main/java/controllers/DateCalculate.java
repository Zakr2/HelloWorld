package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalculate {
    SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatter2=new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat formatter3=new SimpleDateFormat("d-M-yyyy");
    SimpleDateFormat formatter4=new SimpleDateFormat("dd/MM/yy");
    Date birthDate;


    protected boolean isDateValidate(String date){
        if(checker1(date,true)&&checker2(date,true)&&checker3(date,true)&&checker4(date,true))
            return false;
        GregorianCalendar cal1 = new GregorianCalendar();
        GregorianCalendar cal2 = new GregorianCalendar();
        cal1.setTime(birthDate);
        Date today=new Date();
        cal2.setTime(today);
        if(cal1.after(cal2))
            return false;
        if(checker1(date,false)&&checker2(date,false)&&checker3(date,false)&&checker4(date,false))
            if(cal1.isLeapYear(cal1.get(GregorianCalendar.YEAR))) {
                if (cal1.get(GregorianCalendar.MONTH) == 1 && cal1.get(GregorianCalendar.DAY_OF_MONTH) == 29)
                    return true;
                else
                    return false;
            }
            else
                return false;
        return true;
    }
    protected String ageAndBirthdayCalculate(String date) {
        checker1(date,true);
        checker2(date,true);
        checker3(date,true);
        checker4(date,true);
        Date today=new Date();
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();
        cal1.setTime(birthDate);
        cal2.setTime(today);
        int year=cal1.get(GregorianCalendar.YEAR);
        cal1.set(GregorianCalendar.YEAR,2018);
        int age;
        if(cal1.before(cal2)) {
            age=2018-year;
            cal1.add(Calendar.YEAR, 1);
        }
        else
            age=2018-year-1;
        return "Age - "+Integer.toString(age)+", Days to birthday - "+Integer.toString(daysBetween(cal1.getTime(),cal2.getTime()));
    }

    private int daysBetween(Date d2, Date d1) {
        return (int)( ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24))+1);
    }
    private boolean checker1(String date,boolean flag) {
        try {
            formatter1.setLenient(flag);
            birthDate=formatter1.parse(date);
        } catch (ParseException e) {
            return true;
        }
        return false;
    }
    private boolean checker2(String date,boolean flag) {
        try {
            formatter2.setLenient(flag);
            birthDate=formatter2.parse(date);
        } catch (ParseException e) {
            return true;
        }
        return false;
    }
    private boolean checker3(String date,boolean flag) {
        try {
            formatter3.setLenient(flag);
            birthDate=formatter3.parse(date);
        } catch (ParseException e) {
            return true;
        }
        return false;
    }
    private boolean checker4(String date, boolean flag) {
        try {
            formatter4.setLenient(flag);
            birthDate=formatter4.parse(date);
        } catch (ParseException e) {
            return true;
        }
        return false;
    }
}
