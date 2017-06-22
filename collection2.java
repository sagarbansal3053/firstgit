import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by root on 20/6/17.
 */
public class collection2 {
    public static void main(String[] args) {
        String str = new String("sagar");
        int total = unique_char(str);
        System.out.println("unique characters: " + total);


    }

    public static int unique_char (String str)
    {
        char[] ch;
        int count=0;
        ch = str.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for (int i=0;i < ch.length; i++)

            set.add(ch[i]);


        Iterator<Character> itr = set.iterator();
        while (itr.hasNext())
        {

            count++;
            itr.next();
           // System.out.println(itr.next());
        }

    return count;
    }
}
