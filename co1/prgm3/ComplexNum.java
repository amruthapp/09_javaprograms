  
class Complex
{
 int real;
 int img;
 void sum(int a,int b,int c,int d)
 {
  real=a+c;
  img=b+d;
  System.out.println("complex numbers after addition is:"+real+"+"+img+"i");
 }
}
class ComplexNum
 {
  public static void main(String args[])
  {
   Complex c=new Complex();
   c.sum(3,4,5,6);
  }
 }






 
