import java.util.concurrent.Callable;

/**
 * Created by root on 20/6/17.
 */

    enum Car {
    honda(10), tata(5), audi(50), fiat(7), suzuki(12);
    private int price;

    Car(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
    public class q10 {
        public static void main(String args[]){
            System.out.println("All car prices:");


            for (Car c : Car.values()) System.out.println(
                    c + " costs " + c.getPrice() + " lakh rupees.");
        }
    }




