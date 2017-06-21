import com.sun.deploy.util.StringUtils;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by root on 19/6/17.
 */
public class q2 {


    public static void main(String[] args) {
        String str = "text that will search similar text in this text";

        String[] str2 = str.split(" ");
        //System.out.println(Arrays.toString(str2));

       int count=0;


        for (String s: str2)
        {
            System.out.print(s);
            for (String s2: str2) {
                if (s.equals(s2)) {
                    count++;
                }
            }
            System.out.println("  " + count);
            count=0;

        }
        }
    }

