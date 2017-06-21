/**
 * Created by root on 19/6/17.
 */
public class q3 {
    public static void main(String[] args) {
        String str = "to the new";
        int count;

        count = str.length() - str.replace("t","").length();
        //System.out.println(count);
        System.out.println(count);
    }
}
