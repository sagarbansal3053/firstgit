import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by root on 20/6/17.
 */
public class collection1 {
    public static void main(String[] args) {

        float total=0;
        List<Float> list = new ArrayList<Float>();
        list.add((float) 12.45);
        list.add((float)23.67);
        list.add((float)45.3);
        list.add((float)87.23);

        //System.out.println(list);
        Iterator<Float> iterator = list.listIterator();

        while(iterator.hasNext())
        {
            //System.out.println(iterator.next());
            total = total + iterator.next();
        }
        System.out.println(total);
    }
}
