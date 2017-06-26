

interface MyInterface{

    default void display(){
        System.out.println("This come from a default method in MyInterface");
    }
    static void showInfo(){
        System.out.println("This come from a static method in MyInterface");
    }

}


public class java8q5 implements MyInterface{

    public static void main(String[] args) {

        java8q5 obj =new java8q5();
        obj.display();
        MyInterface.showInfo();

    }
}