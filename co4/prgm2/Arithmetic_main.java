import Arithmetic.*;

class Arithmetic_main
{
  public static void main(String args[])
  {
     Arithmetic A=new Arithmetic();
     System.out.println("SUM = "+A.add(8,2));
     System.out.println("DIFFERENCE = "+A.sub(8,2));
     System.out.println("PRODUCT = "+A.mul(8,2));
     System.out.println("DIVISION = "+A.div(8,2));
   }
}