package stringtasks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task015_DateAndTime {

    public static void main(String[] args) {
        
        SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy \nHH:mm aaa");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(format.format(date));
    }
}
