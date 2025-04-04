package module.collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo 
{
    public static void main(String[] args) 
    {
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println("Date:"+d1.getDate());
        System.out.println("Day:"+d1.getDay());
        System.out.println("Year:"+d1.getYear());
        System.out.println("Hour:"+d1.getHours());
        System.out.println("Mintues:"+d1.getMinutes());
        
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(sd.format(d1));
    }
}
