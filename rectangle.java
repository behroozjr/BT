
public class RectangleArea {
    private double width;
    private double height;

    public RectangleArea(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Main {
    private RectangleArea rectangle;

    public void getData() {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
            double height = scanner.nextDouble();
        scanner.close();
        rectangle = new RectangleArea(width, height);
    }

    public double computeField() {
        return rectangle.calculateArea();
    }

    public void fieldDisplay(double area) {
        System.out.println("The area of the rectangle is " + area + ".");
    }
}

public class RectangleAreaProgram {
    public static void main(String[] args) {
            Main main = new Main();
        main.getData();
            double area = main.computeField();
        main.fieldDisplay(area);
    }
}
