interface Bank2{
    float rateOfInheritance();
    final int Balance = 2000;
}
class SBI2 implements Bank2{
    public float rateOfInheritance() {
        float a = Balance*9.2f;
        return a;
    }
}
class PNB2 implements Bank2{
    public float rateOfInheritance() {
        float b = Balance*9.1f;
        return b;
    }
}

public class interfaceImplementation {
    public static void main(String[] args) {
        Bank2 b = new SBI2();
        System.out.println("Roi"+b.rateOfInheritance());
        Bank2 c = new PNB2();
        System.out.println(("Roi"+c.rateOfInheritance()));
    }
}
