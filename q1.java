import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by root on 19/6/17.
 */
public class q1 {

    public static void main(String[] args) {

        String str = new String("hello world");
        System.out.println(str);
        String str2 = str.replaceAll("hello", "bye");
        System.out.println(str2);
    }
}
