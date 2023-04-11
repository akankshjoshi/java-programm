public class Brea {
    public void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is: " + area);
    }

    public void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.calculateArea(10, 20);
        obj.calculateArea(5);
    }
}