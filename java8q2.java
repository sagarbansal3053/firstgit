import java.io.*;

/**
 * Created by root on 22/6/17.
 */

class student1 implements Serializable
{
    int id;
    String name;
    student1(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
}
public class java8q2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        student1 stu = new student1(1,"rahul");

        FileOutputStream fout = new FileOutputStream("serializable.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        try {
            out.writeObject(stu);
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.flush();
        System.out.println("success");

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("serializable.txt"));
        student1 s=(student1)in.readObject();
        System.out.println(s.id+" "+s.name);

        in.close();
    }
}
