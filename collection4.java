import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;
/**
 * Created by root on 21/6/17.
 */

class employee
{
    String name;
    int age;
    int salary;

    employee(String name,int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
}

class SalaryComparator implements Comparator {
    public int compare(Object o1,Object o2){
        employee e1=(employee) o1;
        employee e2=(employee) o2;

        if(e1.salary==e2.salary)
            return 0;
        else if(e1.salary>e2.salary)
            return 1;
        else
            return -1;
    }
}
public class collection4 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(new employee("Vijay",23,15000));
        al.add(new employee("Ajay",27,18000));
        al.add(new employee("Jai",21,20000));

        System.out.println("Sorting by salary...");

        Collections.sort(al,new SalaryComparator());
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            employee ep=(employee) itr.next();
            System.out.println(ep.name+" "+ep.age+" "+ep.salary);
        }

    }
}
