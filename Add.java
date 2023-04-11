public class Add{
    int num1, num2, sum; 
 
public Add(){
    num1 = 20;
    num2 = 20;
    sum = num1 + num2;
}
public void display(){
    System.out.println("sum of " + num1 + "and" + num2 + "is:" + sum);
}
public static void main(String[] args){
    Add obj = new Add();
    obj.display();
}
}
