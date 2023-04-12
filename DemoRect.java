abstract class Figure
{
 double dim1,dim2;
Figure()
{
 dim1=dim2=0;
}
Figure(double d)
{
 dim1=dim2=d;
}
Figure(double d1, double d2)
{
 dim1=d1;dim2=d2;
}
abstract void area();
}
class Rectangle extends Figure{
Rectangle(){
super();
}
Rectangle(double d){
super(d);
}
Rectangle(double a,double b){
super(a,b);
}
void area(){
System.out.println("Area of Rectangle is ="+(dim1*dim2));
}
}
public class DemoRect{
public static void main(String args[]){
Rectangle r1=new Rectangle(5,10);
r1.area();
}
}
