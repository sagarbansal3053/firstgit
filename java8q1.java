import java.io.File;
import java.io.IOException;
import java.io.*;

/**
 * Created by root on 21/6/17.
 */
public class java8q1 {
    public static void main(String[] args) throws IOException {
        File f = new File("sourcefile.txt");
        File f2 = new File("destfile.txt");
        f.createNewFile();
        f2.createNewFile();
        //System.out.println(f.getAbsolutePath());
        if (f.exists() && f2.exists())
            System.out.println("true");

        FileOutputStream fout=new FileOutputStream(f2);
        FileInputStream fin = new FileInputStream(f);

        byte[] buf = new byte[1024];
        int len;
        while ((len = fin.read(buf)) > 0) {
            fout.write(buf, 0, len);
        }
        fin.close();
        fout.close();
    }
}
