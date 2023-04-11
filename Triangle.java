public class Triangle{
    double base,heigth,area;

public Triangle(double b,double h){
    base = b;
    heigth = h;
    area = 0.5 * base * heigth;
}
public void display(){
    System.out.println("Area of triangle with base " + base + "and heigth " + heigth + "is: " + area);
}
public static void main(String[] args){
    Triangle obj = new Triangle(20,50);
    obj.display();
}
}