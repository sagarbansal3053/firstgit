package string;

public class q11 {
    public void add(int a, int b)
    {
        int c= a+b;
        System.out.println(c);
    }
    public void add(double a, double b)
    {
        double c= a+b;
        System.out.println(c);
    }
    public void add(float a, float b)
    {
        float c= a*b;
        System.out.println(c);
    }
    public void add(int a, int b,int c)
    {
         c= a*b;
        System.out.println(c);
    }
    public void add(String a, String b)
    {
        String c= a+b;
        System.out.println(c);
    }
    public void add(String a, String b,String c)
    {
        String d= a+b+c;
        System.out.println(d);
    }
    public static void main(String[] args) {
        q11 j =new q11();
        j.add (2,12);
        j.add(22,22);
        j.add(2.6,3.4);
        j.add(2,4,6);
        j.add("sad","happy");
        j.add("dad","ns","son");
    }
}
