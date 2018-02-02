package currentdate;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) {

        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yy");
        
        String g = dateFormat.format(date);
        System.out.println(g);
        
        
        
    }

}
