 class Box1 {
 double width;
 double height;
 double depth;

 Box1(Box1 ob) { 
  width = ob.width;
  height = ob.height;
  depth = ob.depth;
 }

 Box1(double w, double h, double d) {
  width = w;
  height = h;
  depth = d;
 }

 Box1() {
  width = -1; 
  height = -1; 
  depth = -1;
 }

 Box1(double len) {
  width = height = depth = len;
 }
 
 double volume() {
  return width * height * depth;
 }
}

class BoxWeight1 extends Box1 {
 double weight; 

 
 BoxWeight1(double w, double h, double d, double m) {
  width = w;
  height = h;
  depth = d;
  weight = m;
 }
}

class DemoBoxWeight {
 public static void main(String args[]) {
  BoxWeight1 mybox1 = new BoxWeight1(5, 4, 5, 20.2);
  BoxWeight1 mybox2 = new BoxWeight1(2, 2, 4, 0.33);
  double vol;
  
  vol = mybox1.volume();
  System.out.println("Volume of mybox1 is " + vol);
  System.out.println("Weight of mybox1 is " + mybox1.weight);
  System.out.println();
  
  vol = mybox2.volume();
  System.out.println("Volume of mybox2 is " + vol);
  System.out.println("Weight of mybox2 is " + mybox2.weight);
 }
}