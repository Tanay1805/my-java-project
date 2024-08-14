class Rectangle2 {
    public int length, breath, area, perim;

    // Default constructor
    Rectangle2() {
        length = 0;
        breath = 0;
        area = 0;
        perim = 0;
    }

    // Parameterized constructor
    Rectangle2(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    // Method to calculate area
    public int area() {
        area = length * breath;
        return area;
    }

    // Method to calculate perimeter
    public int perimeter() {
        perim = 2 * (length + breath);
        return perim;
    }

    // Override toString to include area and perimeter
    public String toString() {
        return "Area of rectangle is: " + area + " and Perimeter is: " + perim;
    }
}

public class rectangleDemo {
    public static void main(String[] args) {
        Rectangle2 a = new Rectangle2(2, 3);
        a.area();
        a.perimeter();
        System.out.println(a.toString());
    }
}
