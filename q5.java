/**
 * Created by root on 19/6/17.
 */
public class q5 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,7,34,89,16,6,90,72,85,32,11};
        int[] arr2 = {90,56,12,85,3,67,4,91,16,6,23,77};
        int count = 0;

        for (int loop1 = 0; loop1 < arr1.length; loop1++)
        {
            count = 0;
            for (int loop2 = 0; loop2 < arr2.length; loop2++)
            {
                if (arr1[loop1] == arr2[loop2])
                {
                    count++;
                }

            }

            if (count > 0)
                System.out.println(arr1[loop1]);
        }
    }
}
