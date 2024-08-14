
abstract class Bank {
    abstract int getRateOfInterest();

}
class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}
class PNM extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}
public class Main {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest: "+b.getRateOfInterest()+"%");
        b=new PNM();
        System.out.println("Rate of Interest: "+b.getRateOfInterest()+"%");
    }
}