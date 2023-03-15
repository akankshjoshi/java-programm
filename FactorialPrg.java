import java.io.*;
class CalcFact
{
  public static void main(String args[])throw IOException
      {
        int num,fact=1,i;
InputStreamReader x=new InputStreamReader(Sytem.in)
BufferedReader in1=new BufferedReader(x);
System.out.println("Enter value for num:\n");
num=Integer.parseInt(in1.readLine());
for(i=num;i>1;i--)
{
  fact=fact*i;
}
System.out.println("Factorial of "+num+" is="+fact);
}
}