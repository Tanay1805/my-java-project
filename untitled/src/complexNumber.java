import java.util.Scanner;

class ComplexNumber {
    int real, image;

    public ComplexNumber(int r, int i) {
        this.real = r;
        this.image = i;
    }

    public void showC() {
        System.out.print(this.real + " +i" + this.image);
    }
    // function for addition
    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber res = new ComplexNumber(0, 0);

        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }

    public static void main(String arg[]) {
        Scanner st = new Scanner(System.in);

        System.out.println("Real Part of the complex number is:");
        int r1 = st.nextInt();
        System.out.println("Imaginary Number is");
        int i1 = st.nextInt();

        System.out.println("The real part is of complex number:");
        int r2 = st.nextInt();
        System.out.println("The Second part of the imaginary number is:");
        int i2 = st.nextInt();

        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        System.out.print("First Complex number: ");
        c1.showC();

        System.out.print("\nSecond Complex number: ");
        c2.showC();

        ComplexNumber res = add(c1, c2);

        System.out.println("\nAddition is :");
        res.showC();

        st.close();
    }
}
