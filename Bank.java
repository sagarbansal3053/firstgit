package string;


 abstract class Bank {

    abstract String getDetails();
    String bankName,branch;
    int ratOfInterest;
}

     class BOI extends Bank {

     String getDetails()
     {
         bankName = "bank of india";
         branch = "delhi";
         ratOfInterest = 10;
         return bankName + " " + branch + " " + ratOfInterest;
     }
    }

     class SBI extends Bank {
         String getDetails()
         {
             bankName = "state bank of india";
             branch = "noida";
             ratOfInterest = 9;
             return bankName + " " + branch + " " + ratOfInterest;
         }
    }

     class ICICI extends Bank {
         String getDetails()
         {
             bankName = "ICICI bank";
             branch = "pune";
             ratOfInterest = 11;
             return bankName + " " + branch + " " + ratOfInterest;
         }
    }


class T2
{
    public static void main(String[] args) {
        Bank b = new BOI();
        Bank s = new SBI();
        Bank i= new ICICI();
        System.out.println(b.getDetails());
        System.out.println(s.getDetails());
        System.out.println(i.getDetails());

    }
}
