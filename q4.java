/**
 * Created by root on 19/6/17.
 */
public class q4 {
    public static void main(String[] args) {
        String str = "abcde ABCD EertyAWQ 12345 !@#";

        int count=0,uppercase=0,lowercase=0,digits=0,special_char=0;
        float ucase_percentage,lcase_percentage,d_percentage,sp_percentage;


        count = str.length();
        for (int var=0;var<count; var++)
        {
            if (Character.isUpperCase(str.charAt(var)))
            {
                uppercase++;
            }
            else if (Character.isLowerCase(str.charAt(var)))
            {
                lowercase++;
            }
            else if (Character.isDigit(str.charAt(var)))
            {
                digits++;
            }
            else
            {
                special_char++;
            }
        }

        ucase_percentage = (float)uppercase/(float)count * 100;
        lcase_percentage = (float)lowercase/(float)count * 100;
        d_percentage = (float)digits/(float)count * 100;
        sp_percentage = (float)special_char/(float)count * 100;


        System.out.println("Total characters: " + count);
        System.out.println("uppercase letters: " + uppercase + "  " + ucase_percentage);
        System.out.println("lowercase letters: " + lowercase + "  " + lcase_percentage);
        System.out.println("digits: " + digits + "  " + d_percentage);
        System.out.println("special letters: " + special_char + "  " + sp_percentage);

    }
}
