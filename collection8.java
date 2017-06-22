import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by root on 21/6/17.
 */
public class collection8 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formator = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate =    formator.format(date);

        System.out.println("Date Format with dd-MMMM-yyyy : "+strDate);
    }
}
