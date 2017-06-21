/**
 * Created by root on 19/6/17.
 */
public class q8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello world");
        sb.reverse();
        System.out.println(sb);

        sb.replace(4,9,"");
        System.out.println(sb);
    }
}
