package Graphics;

interface inter_graphics
{
  public void RectArea(int l,int b);
  public void CircleArea(int r);
  public void SqArea(int a);
  public void TriArea(int b,int h);
}
public class Graphics implements inter_graphics
{
  public void RectArea(int l,int b)
  {
    System.out.println("Area of Rectangle : "+l*b);
  }

  public void CircleArea(int r)
  {
    System.out.println("Area of Circle : "+3.14f*r*r);
  }

  public void SqArea(int a)
  {
    System.out.println("Area of Square : "+a*a);
  }
  
  public void TriArea(int b,int h)
  {
    System.out.println("Area of Triangle : "+(b*h)/2);
  }
}
  
    