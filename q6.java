/**
 * Created by root on 19/6/17.
 */
public class q6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,7,8,9};
        int count=0;

        for (int loop1=0; loop1 < arr1.length; loop1++) {
            count=0;
            for (int loop2 = 0; loop2 < arr1.length; loop2++) {
                if (arr1[loop1] == arr1[loop2]) {
                    count++;
                }
            }
            if (count < 2)
                System.out.println(arr1[loop1]);
        }
    }
}
