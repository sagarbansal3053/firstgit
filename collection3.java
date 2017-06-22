import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class collection3 {
    public static void main(String[] args) {
        String str = new String("sagar");
        char_occurence(str);


    }

    public static void char_occurence(String str) {
        char[] ch;
        char ch1;
        int count = 0;
        ch = str.toCharArray();

        ArrayList<Character> set = new ArrayList<>();

        for (int i = 0; i < ch.length; i++)
            set.add(ch[i]);

        Iterator<Character> itr = set.iterator();

        while (itr.hasNext()) {
            count = 0;
            ch1 = itr.next();
            Iterator<Character> itr2 = set.iterator();
            while (itr2.hasNext()) {
                if (ch1 == itr2.next()) {
                    count++;
                }
            }

            System.out.println(ch1 + " occurence: " + count);
            // System.out.println(itr.next());
        }


    }

}