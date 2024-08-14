abstract class figure {
    abstract double getArea();
    abstract double getPerimeter();
}

class Triangle extends figure {
    double getArea() {
        return 0.5 * (10 * 10);
    }

    double getPerimeter() {
        return 10 + 10 + 10;
    }
}

class Rectangle extends figure {
    double getArea() {
        return 20 * 10;
    }

    double getPerimeter() {
        return 2 * (20 + 10);
    }
}

public class CalculatePerimeterAndArea {
    public static void main(String[] args) {
        figure b;
        b = new Triangle();
        System.out.println("The area of the Triangle is: " + b.getArea());
        System.out.println("The perimeter of the Triangle is: " + b.getPerimeter());

        figure c;
        c = new Rectangle();
        System.out.println("The area of the Rectangle is: " + c.getArea());
        System.out.println("The perimeter of the Rectangle is: " + c.getPerimeter());
    }
}
