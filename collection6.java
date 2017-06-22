package  CollectionAssignment;

import javax.jnlp.IntegrationService;
import java.util.*;


// Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

public class collection6 {
    public static void main(String[] args) {
        int n[]={9,1,9,1,4,5,6,8,8,1,1,2,2,11,4,11,6};
        ///output
        // 9,4,
        HashMap<Integer,Integer> fre=new HashMap();
        HashMap<Integer,Integer> in=new HashMap();
        for(int i=0;i<n.length;i++)
        {
            if(fre.containsKey(n[i]))
            {
                fre.put(n[i], fre.get(n[i])+1);
            }
            else
            {
                fre.put(n[i],1);
                in.put(n[i], i);

            }
        }
        List<Map.Entry<Integer,Integer>> key=new ArrayList(fre.entrySet());

        Collections.sort(key , new comp(in));
        for(Map.Entry<Integer,Integer> i : key)
        {
            System.out.println(i);
        }
    }  //9,4,5
}
class comp implements Comparator <Map.Entry<Integer,Integer>>
{
    HashMap<Integer,Integer> m;
    public comp(HashMap<Integer,Integer> obj)
    {
        m=obj;
    }
    @Override
    public int compare(Map.Entry<Integer,Integer> o1 , Map.Entry<Integer,Integer> o2) {

        if(o1.getValue().equals(o2.getValue()))
        {
            return m.get(o1.getKey())-m.get(o2.getKey());
        }
        else
        {
            return o2.getValue().compareTo(o1.getValue());
        }
//       else
//        {
//            return 0;
//        }

    }
}