package pl.stormit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Service1 {

    public static void main(String[] args) {
        System.out.println(formatDate());
        System.out.println(adding());
    }

    public static String formatDate(){
        DateFormat dateFormat = new SimpleDateFormat();
        Date date= new Date(2019,1,10);
        String formattedDate=dateFormat.format(date);
        return formattedDate;
    }
    public static int adding(){
        int a = 2_147_483_646;
        int b = 1;
        return a + b;

    }

}
