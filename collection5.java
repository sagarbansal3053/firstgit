import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by root on 21/6/17.
 */


class student
{
    String name;
    double age,score;

    student(String name,double age, double score)
    {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}

class ScoreComparator implements Comparator {
    public int compare(Object o1,Object o2){
        student s1=(student) o1;
        student s2=(student) o2;

        if(s1.score==s2.score)
            return s1.name.compareTo(s2.name);
        else if(s1.score>s2.score)
            return 1;
        else
            return -1;
    }
}
public class collection5 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(new student("Vijay",23,15));
        al.add(new student("Sia",24,8));
        al.add(new student("Aman",23,8));
        al.add(new student("Jai",21,20));

        System.out.println("Sorting by score...");

        Collections.sort(al,new ScoreComparator());
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            student st=(student) itr.next();
            System.out.println(st.name+"   "+st.age+"   "+st.score);
        }

    }
}
