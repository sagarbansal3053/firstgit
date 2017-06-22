import java.text.DateFormat;
import java.util.*;
/**
 * Created by root on 21/6/17.
 */
public class collection9 {
    public static void main(String[] args) {

        Date d1 = new Date();
        DateFormat german = DateFormat.getDateInstance (DateFormat.FULL, Locale.GERMANY);
        DateFormat china = DateFormat.getDateInstance (DateFormat.FULL, Locale.CHINA);
        DateFormat france = DateFormat.getDateInstance (DateFormat.FULL, Locale.FRANCE);
        DateFormat taiwan = DateFormat.getDateInstance (DateFormat.FULL, Locale.TAIWAN);
        DateFormat us = DateFormat.getDateInstance (DateFormat.FULL, Locale.US);
        System.out.println("today is in Italian Language  in German Format : "+ german.format(d1));

        System.out.println("today is in Italian Language  in china Format : "+ china.format(d1) );

        System.out.println("today is in Italian Language  in Switzerland Format : "+ france.format(d1));

        System.out.println("today is in Italian Language  in Switzerland Format : "+ taiwan.format(d1));

        System.out.println("today is in Italian Language  in Switzerland Format : "+ us.format(d1));

    }
}
